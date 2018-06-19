package dao.schedule;

import domain.schedule;
import domain.scheduleOut;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCPUtil;

import java.sql.SQLException;
import java.util.List;

public class scheduleDao {
    private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
    //增
    public void add(schedule schedule) {
        try {
            qr.update("insert into schedule(studio_id,play_id,sched_time,lang_version,sche_date) values(?,?,?,?,?)",
                    schedule.getStudio_id(),schedule.getPlay_id(),schedule.getSched_time(),
                    schedule.getLang_version(),schedule.getSche_date()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删
    public void delete(int id) {
        try {
            qr.update("delete from schedule where id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //改
    public void update(schedule schedule) {
        try {
            qr.update("update schedule set studio_id=?,play_id=?,sched_time=?,lang_version=?,sche_date=? where id=?",
                    schedule.getStudio_id(),schedule.getPlay_id(),schedule.getSched_time(),schedule.getLang_version(),schedule.getSche_date(),schedule.getId()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //id查
    public scheduleOut idfind(int id) {
        try {
            return qr.query("SELECT id,studio_name,play_name,sched_time,lang_version,sche_date from play,studio,schedule where id=? and schedule.studio_id=studio.studio_id and schedule.play_id=play.play_id;", new BeanHandler<scheduleOut>(scheduleOut.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    //全查
    public List<scheduleOut> allfind() {
        try {
            return qr.query("SELECT id,studio_name,play_name,sched_time,lang_version,sche_date from play,studio,schedule where schedule.studio_id=studio.studio_id and schedule.play_id=play.play_id;", new BeanListHandler<scheduleOut>(scheduleOut.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
