package servlet.play;

import domain.play;
import service.play.playService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/allfindPlayServlet")
public class allfindPlayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        playService ps = new playService();
        List<play> list = ps.allfind();
        HttpSession session = request.getSession();
        session.setAttribute("list",list);
        request.getRequestDispatcher("/jsp/play/list.jsp").forward(request,response);
    }
}
