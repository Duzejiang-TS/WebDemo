package servlet.schedule;

import domain.schedule;
import domain.scheduleOut;
import service.schedule.scheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/allfindScheduleServlet")
public class allfindScheduleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        scheduleService scs = new scheduleService();
        List<scheduleOut> list2 = scs.allfind();
        HttpSession session = request.getSession();
        session.setAttribute("list2",list2);
        request.getRequestDispatcher("/jsp/schedule/list.jsp").forward(request,response);
    }
}
