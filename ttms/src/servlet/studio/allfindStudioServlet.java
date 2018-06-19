package servlet.studio;

import domain.studio;
import service.studio.studioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/allfindStudioServlet")
public class allfindStudioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        studioService ss = new studioService();
        List<studio> list1 = ss.allfind();
        HttpSession session = request.getSession();
        session.setAttribute("list1",list1);
        request.getRequestDispatcher("/jsp/studio/list.jsp").forward(request,response);
    }
}
