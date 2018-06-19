package service.play;

import dao.play.playDao;
import domain.play;

import java.util.List;

public class playService {

    playDao playDao = new playDao();

    //增
    public void add(play play){
        playDao.add(play);
    }
    //删
    public void delete(int id){
        playDao.delete(id);
    }
    //改
    public void update(play play){
        playDao.update(play);
    }
    //id查
    public play idfind(int id){
        play play = playDao.idfind(id);
        return play;
    }
    //全查
    public List<play> allfind(){
        List<play> list = playDao.allfind();
        return list;
    }
    //name查
    public play namefind(String name){
        play play = playDao.namefind(name);
        return play;
    }
}
