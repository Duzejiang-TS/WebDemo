package servlet.schedule;

import domain.scheduleOut;
import service.schedule.scheduleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update1ScheduleServlet")
public class update1ScheduleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        scheduleService scs = new scheduleService();
        int id  = Integer.parseInt(request.getParameter("id"));
        scheduleOut scheduleOut = scs.idfind(id);
        request.setAttribute("scheduleOut",scheduleOut);
        request.getRequestDispatcher("/jsp/schedule/update.jsp").forward(request,response);

    }
}
