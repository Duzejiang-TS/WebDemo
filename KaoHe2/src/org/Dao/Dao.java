package org.Dao;

import org.domain.Classroom;

import java.util.List;

public interface Dao {
    //增
    void add(Classroom cr);
    //删
    void delect(String id);
    //改
    Classroom update(Classroom cr);
    //id查
    Classroom idFind(String id);
    //全查
    List<Classroom> AllFind();
}
