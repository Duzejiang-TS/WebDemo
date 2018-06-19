package servlet.schedule;

import domain.schedule;
import service.play.playService;
import service.schedule.scheduleService;
import service.studio.studioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addScheduleServlet")
public class addScheduleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        playService ps = new playService();
        studioService ss = new studioService();
        int play_id = ps.namefind(request.getParameter("play_name")).getPlay_id();
        int studio_id = ss.namefind(request.getParameter("studio_name")).getStudio_id();

        schedule schedule = new schedule();
        schedule.setStudio_id(studio_id);
        schedule.setPlay_id(play_id);
        schedule.setSched_time(request.getParameter("sched_time"));
        schedule.setLang_version(request.getParameter("lang_version"));
        schedule.setSche_date(request.getParameter("sche_date"));

        scheduleService scs = new scheduleService();
        scs.add(schedule);
        request.getRequestDispatcher("/allfindScheduleServlet").forward(request,response);
    }
}
