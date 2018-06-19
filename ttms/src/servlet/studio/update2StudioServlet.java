package servlet.studio;

import domain.studio;
import service.studio.studioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update2StudioServlet")
public class update2StudioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        studio studio = new studio();
        studio.setStudio_id(Integer.parseInt(request.getParameter("studio_id")));
        studio.setStudio_name(request.getParameter("studio_name"));
        studio.setStudio_row_count(Integer.parseInt(request.getParameter("studio_row_count")));
        studio.setStudio_col_count(Integer.parseInt(request.getParameter("studio_col_count")));
        studio.setStudio_introduction(request.getParameter("studio_introduction"));

        studioService ss = new studioService();
        ss.update(studio);
        request.getRequestDispatcher("/allfindStudioServlet").forward(request,response);

    }
}
