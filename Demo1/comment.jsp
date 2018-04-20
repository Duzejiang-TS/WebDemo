<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/5
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*"%>
<html>
<head>
    <title>小脚本测试</title>
</head>
<body>
<%
    //注册数据库驱动
    Class.forName("com.mysql.jdbc.Driver");
    //获取数据库连接
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/hhh", "root", "duzejiang");
         Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from student_table");
%>
<table bgcolor="aqua" border="1" width="300">
<%
  while(rs.next())
  {%>
    <tr>
    <!--输出结果集-->
        <td><%=rs.getString(1)%></td>
        <td><%=rs.getString(2)%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
