<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/24
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>aoolication测试</title>
</head>
<body>
<%
    //从配置参数中获取驱动
    String driver = application.getInitParameter("Driver");
    //从配置参数中获取数据库url
    String url = application.getInitParameter("url");
    //从配置参数中获取用户名
    String user = application.getInitParameter("user");
    //从配置参数中获取密码
    String pass = application.getInitParameter("pass");
    //注册驱动
    Class.forName(driver);
    //获取数据库连接
    Connection conn = DriverManager.getConnection(url,user,pass);
    //创建Statement对象
    Statement stmt = conn.createStatement();
    //执行查询
    ResultSet rs = stmt.executeQuery("SELECT * from stu_table");
%>
<table bgcolor="#9999dd" border="1" width="480">
    <%
        //遍历结果集
        while(rs.next()){
            %>
    <tr>
        <td><%=rs.getString(1)%></td>
        <td><%=rs.getString(2)%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
