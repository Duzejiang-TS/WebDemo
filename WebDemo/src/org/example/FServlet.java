package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * 和FHtml.html一起用
 */
@WebServlet(urlPatterns = "/FServlet")
public class FServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");

        System.out.println(username + "," + password + "," + Arrays.toString(hobby));
        /**
         * 测试获取所有请求参数的名称
         */
        Enumeration names = request.getParameterNames();
        while(names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
        /**
         * 获取所有请求参数，封装到Map中
         */
        Map<String,String[]> map = request.getParameterMap();
        for(String name : map.keySet()){
            String[] values = map.get(name);
            System.out.println(name + "=" + Arrays.toString(values));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET: " + request.getParameter("xxx"));
        System.out.println("GET: " + request.getParameter("yyy"));
    }
}
