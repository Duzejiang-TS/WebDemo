package org.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 练习：访问量统计
* 一个项目中所有资源被访问都要对访问量进行累加
* 创建一个int类型的变量，用来保存访问量，然后把它保存到ServletContext的域中，这样可以保证所有的Servlet都可以访问到
*
* 分析：
* 1.最初，ServletContext中没有保存访问量的相关属性
* 2.当本站第一次被访问，创建一个变量，值为1，保存到ServletContext中
* 3.以后访问时，从ServletContext中获取这个变量，并在其基础上加一
* 细节问题：
* 获取ServletContext对象，查看是否存在名为count的属性，如果存在，说明不是第一次访问
*    ->第一次访问，调用ServletContext的SetAttribute()传递一个属性，名为count，值为1；
*    ->第2~N次访问，调用ServletContext的getAttribute()方法获取原来的访问量，给访问量加一，
*                 在调用ServletContext的setAttribute()方法完成设置
* */
@WebServlet(urlPatterns = "/Statistical10086")
public class Statistical extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext app = this.getServletContext();
        Integer count = (Integer)app.getAttribute("count");
        if(count == null)
            app.setAttribute("count",1);
        else
            app.setAttribute("count",count+1);

        //向浏览器输出，需要使用响应对象
        PrintWriter pw = response.getWriter();
        pw.print("<h1>" + count + "<h1>");
    }
}
