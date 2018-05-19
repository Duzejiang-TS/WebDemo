package org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tool {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/hhh";
    private String user = "root";
    private String pass = "duzejiang";

    public Statement getStatement(){
        try {
            Class.forName(this.driver);
            Connection conn = DriverManager.getConnection(this.url,this.user,this.pass);
            Statement st = conn.createStatement();
            return st;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
