package dao.studio;

import domain.studio;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCPUtil;

import java.sql.SQLException;
import java.util.List;

public class studioDao {
    private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
    //增
    public void add(studio studio) {
        try {
            qr.update("insert into studio(studio_name,studio_row_count,studio_col_count,studio_introduction) values(?,?,?,?)",
                    studio.getStudio_name(),studio.getStudio_row_count(),
                    studio.getStudio_col_count(),studio.getStudio_introduction()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删
    public void delete(int id)  {
        System.out.println(id);
        try {
            qr.update("delete from studio where studio_id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //改
    public void update(studio studio) {
        try {
            qr.update("update studio set studio_name=?,studio_row_count=?,studio_col_count=?,studio_introduction=? where studio_id=?",
                    studio.getStudio_name(),studio.getStudio_row_count(),
                    studio.getStudio_col_count(),studio.getStudio_introduction(),studio.getStudio_id()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //id查
    public studio idfind(int id) {
        try {
            return qr.query("select * from studio where studio_id=?", new BeanHandler<studio>(studio.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //全查
    public List<studio> allfind() {
        try {
            return qr.query("select * from studio", new BeanListHandler<studio>(studio.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //name查
    public studio namefind(String name){
        try {
            return qr.query("select * from studio where studio_name=?", new BeanHandler<studio>(studio.class),name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
