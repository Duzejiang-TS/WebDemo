package servlet.play;

import domain.play;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import service.play.playService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@WebServlet(urlPatterns = "/addPlayServlet")
public class addPlayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String resultPath = "";
        String storePath = getServletContext().getRealPath("/img/OnShow");
        /*
        上传三步
         */
        //创建一个DiskFileItemFactory工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建一个文件上传解析器
        ServletFileUpload sfu = new ServletFileUpload(factory);
        //解决上传文件名的中文乱码
        sfu.setHeaderEncoding("UTF-8");
        //解析得到List
        try {
            List<FileItem> FileItemlist = sfu.parseRequest(request);
            int size = FileItemlist.size();
            play play = new play();
            //前七个正常
            FileItem fi1 = FileItemlist.get(0);
            FileItem fi2 = FileItemlist.get(1);
            FileItem fi3 = FileItemlist.get(2);
            FileItem fi4 = FileItemlist.get(3);
            FileItem fi5 = FileItemlist.get(4);
            FileItem fi6 = FileItemlist.get(5);
            FileItem fi7 = FileItemlist.get(6);
            FileItem fi8 = FileItemlist.get(size-1);

            play.setPlay_name(fi1.getString("UTF-8"));
            play.setPlay_introduction(fi2.getString("UTF-8"));
            //play.setPlay_image(fi3.getString("UTF-8"));
            play.setPlay_length(fi4.getString("UTF-8"));
            play.setPlay_ticket_price(Float.parseFloat(fi5.getString("UTF-8")));
            play.setPlay_status(Integer.parseInt(fi6.getString("UTF-8")));
            play.setLang(fi7.getString("UTF-8"));
            play.setPlay_showtime(fi8.getString("UTF-8"));

            //类型
            String type="";
            int i;
            for(i = 7;i < size-2;i++){
                FileItem fi = FileItemlist.get(i);
                type = type + fi.getString("UTF-8") +",";
            }
            FileItem fi = FileItemlist.get(i);
            type+=fi.getString("UTF-8");
            play.setType(type);

            //上传文件处理
            InputStream in = fi3.getInputStream();
            String fileName = fi3.getName();
            fileName=fileName.substring(fileName.lastIndexOf("\\")+1); //截取扩展名
            play.setPlay_image(fileName);
            OutputStream out = new FileOutputStream(storePath+"\\"+fileName);
            int len = -1;
            byte b[] = new byte[1024];
            while((len=in.read(b))!=-1){
                out.write(b, 0, len);
            }
            out.close();
            in.close();

            //将play传入service层
            playService ps = new playService();
            ps.add(play);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/allfindPlayServlet").forward(request,response);


    }
}
