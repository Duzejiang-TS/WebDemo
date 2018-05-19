package org.Service;

import org.Dao.Dao;
import org.domain.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classService")
public class ClassService {
    //ClassDao cd = new ClassDao();

    @Autowired
    private Dao dao;

    //增
    public void add(Classroom cr){
        Classroom cl = dao.idFind(cr.getId());
        if (cl==null) {
            dao.add(cr);
        }
    }

    //删
    public void delete(String id){
        dao.delect(id);
    }

    //改
    public Classroom update(Classroom cr){
        return dao.update(cr);
    }

    //id查
    public Classroom idFind(String id){
        return dao.idFind(id);
    }

    //全查
    public List<Classroom> AllFind(){
        return dao.AllFind();
    }
}
