package org.example;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 响应字节数组
 */
@WebServlet(name = "ZiJie")
public class ZiJie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "F:/F/图片.jpg";
        FileInputStream in  = new FileInputStream(path);
        //没有IOUtils的jar包，下面这个操作看一下就好
        //byte [] bytes = IOUtils.toByteArray(in);//读取输入流内容的字节到字符数组中
        //response.getOutputStream().write(bytes);
    }
}
