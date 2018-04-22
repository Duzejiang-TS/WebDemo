package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示定时刷新
 * 设置一个Refresh，表示定时刷新！
 *
 */
@WebServlet(urlPatterns = "/CServlet")
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PrintWriter writer = response.getWriter();
        //writer.print("");
        response.setHeader("Refresh","5;URL=/BServlet");//五秒后转到BServlet
    }
}
