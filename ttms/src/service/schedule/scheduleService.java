package service.schedule;

import dao.schedule.scheduleDao;
import domain.schedule;
import domain.scheduleOut;

import java.util.List;

public class scheduleService {

    scheduleDao scheduleDao = new scheduleDao();

    //增
    public void add(schedule schedule){
        scheduleDao.add(schedule);
    }
    //删
    public void delete(int id){
        scheduleDao.delete(id);
    }
    //改
    public void update(schedule schedule){
        scheduleDao.update(schedule);
    }
    //id查
    public scheduleOut idfind(int id){
        scheduleOut scheduleOut = scheduleDao.idfind(id);
        return scheduleOut;
    }
    //全查
    public List<scheduleOut> allfind(){
        List<scheduleOut> list = scheduleDao.allfind();
        return list;
    }
}
