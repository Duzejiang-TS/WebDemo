package org.Service;

import org.Dao.ClassDao;
import org.domain.Classroom;

import java.util.List;

public class ClassService {
    ClassDao cd = new ClassDao();

    //增
    public void add(Classroom cr){
        Classroom cl = cd.idFind(cr.getId());
        if (cl==null) {
            cd.add(cr);
        }
    }

    //删
    public void delete(String id){
        cd.delect(id);
    }

    //改
    public Classroom update(Classroom cr){
        return cd.update(cr);
    }

    //id查
    public Classroom idFind(String id){
        return cd.idFind(id);
    }

    //全查
    public List<Classroom> AllFind(){
        return cd.AllFind();
    }
}
