package org.user.web.servlet;

import org.user.domain.User;
import org.user.service.UserException;
import org.user.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//请求编码POST
        response.setContentType("text/html;charset=utf-8");//响应编码

        //依赖userService
        UserService userService = new UserService();

        User form = new User();
        form.setUsername(request.getParameter("username"));
        form.setPassword(request.getParameter("password"));

        try {
            User user = userService.login(form);
            request.getSession().setAttribute("sessionUser",user);
            response.sendRedirect(request.getContextPath() + "/user/welcome.jsp");
        } catch (UserException e) {
            request.setAttribute("msg",e.getMessage());
            request.setAttribute("user",form);
            request.getRequestDispatcher("/user/login.jsp").forward(request,response);
        }


    }

}
