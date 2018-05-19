package org.Dao;

import org.domain.Classroom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClassDao {
    tool tool = new tool();

    //增
    public void add(Classroom cr){
        Statement st = tool.getStatement();
        String sql = "INSERT INTO stu VALUES ('" + cr.getId() + "','" +
                cr.getName() + "','" + cr.getStu() + "','" +
                cr.getTea() + "','" + cr.getMan() + "');";
        try {
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //删
    public void delect(String id){
        Statement st = tool.getStatement();
        String sql ="DELETE FROM stu WHERE id='" + id + "';";
        try {
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //改
    public Classroom update(Classroom cr){
        Statement st = tool.getStatement();
        String sql="UPDATE stu SET name='" + cr.getName() + "',num='" +
                cr.getStu() + "',teacher='" + cr.getTea() + "',man='" +
                cr.getMan() + "'WHERE id='" + cr.getId() + "';";
            try {
            st.execute(sql);
//            if(rs.next()){
//                Classroom classroom = new Classroom();
//                classroom.setId(rs.getString(1));
//                classroom.setName(rs.getString(2));
//                classroom.setStu(rs.getInt(3));
//                classroom.setTea(rs.getString(4));
//                classroom.setMan(rs.getString(5));
//                return classroom;
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //根据id查
    public Classroom idFind(String id){
        Statement st = tool.getStatement();
        String sql = "SELECT * FROM stu WHERE id='" + id + "';";
        try {
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                Classroom classroom = new Classroom();
                classroom.setId(rs.getString(1));
                classroom.setName(rs.getString(2));
                classroom.setStu(rs.getInt(3));
                classroom.setTea(rs.getString(4));
                classroom.setMan(rs.getString(5));
                return classroom;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //全查
    public List<Classroom> AllFind(){
        Statement st = tool.getStatement();
        String sql = "SELECT * FROM stu;";
        try {
            ResultSet rs = st.executeQuery(sql);
            List<Classroom> list = new ArrayList<>();
            while (rs.next()){
                Classroom classroom = new Classroom();
                classroom.setId(rs.getString(1));
                classroom.setName(rs.getString(2));
                classroom.setStu(rs.getInt(3));
                classroom.setTea(rs.getString(4));
                classroom.setMan(rs.getString(5));
                list.add(classroom);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
