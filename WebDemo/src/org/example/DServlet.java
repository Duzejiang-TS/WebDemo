package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DServlet")
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String addr = request.getRemoteAddr();//获取客户端IP地址
        System.out.println("IP: "+ addr);
        System.out.println("请求方式： " + request.getMethod());//获取请求方式
        String userAgent = request.getHeader("User-Agent");//获取名为User-Agent的请求头
        System.out.println(userAgent);
    }
}
