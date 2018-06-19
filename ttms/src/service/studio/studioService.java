package service.studio;

import dao.studio.studioDao;
import domain.studio;

import java.sql.SQLException;
import java.util.List;

public class studioService {

    studioDao studioDao = new studioDao();

    //增
    public void add(studio studio) {
        studioDao.add(studio);
    }
    //删
    public void delete(int id) {
        studioDao.delete(id);
    }
    //改
    public void update(studio studio) {
        studioDao.update(studio);
    }
    //id查
    public studio idfind(int id) {
        studio studio = studioDao.idfind(id);
        return studio;
    }
    //全查
    public List<studio> allfind() {
        List<studio> list = studioDao.allfind();
        return list;
    }
    //name查
    public studio namefind(String name){
        studio studio = studioDao.namefind(name);
        return studio;
    }
}
