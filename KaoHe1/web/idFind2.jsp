<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/16
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<h1>查询结果</h1>
    <h1>班级编码:${Classroom.id}</h1><br/>
    <h1>班级名称:${Classroom.name}</h1><br/>
    <h1>班级人数:${Classroom.stu}</h1><br/>
    <h1>老师姓名:${Classroom.tea}</h1><br/>
    <h1>班长姓名:${Classroom.man}</h1><br/>
    <a href="/allfServlet">返回</a>
</body>
</html>
