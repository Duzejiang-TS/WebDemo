package org.user.dao;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.user.domain.User;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


/**
 * 数据类
 */
public class UserDao {
    private String path = "D:/Java Web project/TestMVC/users.xml";//依赖数据文件

   public User findByUsername(String username){
       /**
        *1.得到Document
        *2.xpath查询
        * 3.校验查询结果是否为null，为null返回null
        * 4.不为null，需要把Element封装到User对象中
        */
       //创建解析器
       SAXReader reader = new SAXReader();
       try {
           Document doc = reader.read(path);
           Element ele = (Element) doc.selectSingleNode("//user[@username='"+ username + "']");

           if(ele == null) return null;

           User user = new User();
           String attrUsername = ele.attributeValue("username");
           String attrPassword = ele.attributeValue("password");
           user.setUsername(attrUsername);
           user.setPassword(attrPassword);
           return user;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public void add(User user) {
       SAXReader reader = new SAXReader();
       try {
           Document doc = reader.read(path);
           Element root = doc.getRootElement();
           Element userEle = root.addElement("user");
           userEle.addAttribute("username" ,user.getUsername());
           userEle.addAttribute("password" ,user.getPassword());

           /**
            * 保存文档
            */

           OutputFormat format = new OutputFormat("\t",true);
           format.setTrimText(true);

           //创建XMLWrite流
           XMLWriter writer;
           writer = new XMLWriter(
                   new OutputStreamWriter(
                           new FileOutputStream(path),"utf-8"),format);
           writer.write(doc);
           writer.close();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

}
