package servlet.money;

import domain.Sale;
import domain.studio;
import service.money.moneyService;
import service.studio.studioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/moneyServlet")
public class moneyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        moneyService ms = new moneyService();
        int month = Integer.parseInt(request.getParameter("month"));
        int day = Integer.parseInt(request.getParameter("day"));
        String day1="";
        String day2="";
        if(month>0&&month<10){
            day1=day1+0+month;
            day2=day2+0+month;
        }else if(month>9&&month<13){
            day1=day1+month;
            day2=day2+month;
        }else {
            request.getRequestDispatcher("/jsp/money/dayIn.jsp").forward(request,response);
        }
        day1=day1+"-"+day;
        day2=day2+"-"+day+1;

        List<Sale> list = ms.moneyfind(day1,day2);

        int money = 0;
        for (Sale m:list) {
            money+=m.getPrice();
        }
        request.setAttribute("price",money);

        request.getRequestDispatcher("/jsp/money/piaofang.jsp").forward(request,response);
    }
}
