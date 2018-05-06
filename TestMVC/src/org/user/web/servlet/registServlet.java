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


@WebServlet(urlPatterns = "/registServlet")
public class registServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//请求编码POST
        response.setContentType("text/html;charset=utf-8");//响应编码

        //依赖userService
        UserService userService = new UserService();

        //1.封装表单数据（封装到User对象中）
        // 一句话封装，以后就用这个必须表单中数据的name与User中的变量名一致（即username和password）
        //User form = CommonUtils.toBean(request.getParameterMap(),User.class);
        User form = new User();
        form.setUsername(request.getParameter("username"));
        form.setPassword(request.getParameter("password"));
        try {
            userService.regist(form);
            response.getWriter().print("<h1>注册成功！</h1><a href='"+"/user/login.jsp "+"'>点击这里去登陆</a>");
        } catch (UserException e) {
            //获取异常信息保存到request域中
            request.setAttribute("msg",e.getMessage());
            request.setAttribute("user",form);
            request.getRequestDispatcher("/user/regist.jsp").forward(request,response);
        }
    }

}
