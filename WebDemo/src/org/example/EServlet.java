package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 使用Referer请求头防盗链
 */
@WebServlet(urlPatterns = "/EServlet")
public class EServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     *如果直接访问，相当于从浏览器地址行输入的地址，referer是得不到请求来源的，会等于NULL，从而跳转到百度页面
     * 可以写一个HTML的文件，其中的东西可以超链接到本文件，这样请求中有localhost，就会成功输出 hello!
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer =  request.getHeader("Referer");
        System.out.println(referer);
        if(referer == null || !referer.contains("localhost")){
            response.sendRedirect("http://www.baidu.com");
        }else{
            System.out.println("hello!");
        }
    }
}
