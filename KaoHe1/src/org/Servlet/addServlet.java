package org.Servlet;

import org.Service.ClassService;
import org.domain.Classroom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addServlet")
public class addServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Classroom cr = new Classroom();
        cr.setId(request.getParameter("id"));
        cr.setName(request.getParameter("name"));
        cr.setStu(Integer.parseInt(request.getParameter("num")));
        cr.setTea(request.getParameter("tea"));
        cr.setMan(request.getParameter("man"));
        ClassService cs = new ClassService();
        cs.add(cr);
        request.getRequestDispatcher("/allfServlet").forward(request,response);
    }
}
