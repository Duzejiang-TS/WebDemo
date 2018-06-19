package dao.play;

import domain.play;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCPUtil;

import java.sql.SQLException;
import java.util.List;


public class playDao {
    private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
    //增
    public void add(play play)  {
        try {
            qr.update("insert into play(play_name,play_introduction,play_image,play_length,play_ticket_price,play_status,lang,type,play_showtime)values(?,?,?,?,?,?,?,?,?)",
                   play.getPlay_name(),play.getPlay_introduction(),play.getPlay_image(),
                    play.getPlay_length(),play.getPlay_ticket_price(),play.getPlay_status(),play.getLang(),
                    play.getType(),play.getPlay_showtime()
                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删
    public void delete(int id)  {
        try {
            qr.update("delete from play where play_id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //改
    public void update(play play)  {
        try {
            qr.update("update play set play_name=?,play_introduction=?,play_image=?,play_length=?,play_ticket_price=?,play_status=?,lang=?,type=?,play_showtime=? where play_id=?",
                    play.getPlay_name(),play.getPlay_introduction(),play.getPlay_image(),
                    play.getPlay_length(),play.getPlay_ticket_price(),play.getPlay_status(),play.getLang(),
                    play.getType(),play.getPlay_showtime(),play.getPlay_id()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //id查
    public play idfind(int id) {
        try {
            return qr.query("select * from play where play_id=?", new BeanHandler<play>(play.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //全查
    public List<play> allfind() {
        try {
            return qr.query("select * from play", new BeanListHandler<play>(play.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //name查
    public play namefind(String name){
        try {
            return qr.query("select * from play where play_name=?", new BeanHandler<play>(play.class),name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
