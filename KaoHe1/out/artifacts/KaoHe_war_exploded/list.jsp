<%@ page import="java.util.List" %>
<%@ page import="org.domain.Classroom" %><%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/16
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h1>显示所有</h1>
<table border="1" >
    <tr>
        <td>班级编码</td>
        <td>班级名称</td>
        <td>班级人数</td>
        <td>老师姓名</td>
        <td>班长姓名</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.stu}</td>
            <td>${s.tea}</td>
            <td>${s.man}</td>
            <td>
                <a href="/deleteServlet?id=${s.id}">删除</a>
                <a href="Update1Servlet?id=${s.id}">
                    修改
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="add.jsp">添加</a>
<a href="idFind.jsp">查询</a>

</body>
</html>
