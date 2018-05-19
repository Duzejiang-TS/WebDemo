<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/16
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>

<form action="/updateServlet" method="post">
    班级编码:<input type="text" name="id" value="${cr.id}"/>
    班级名称:<input type="text" name="name" value="${cr.name}"/>
    班级人数:<input type="text" name="num" value="${cr.stu}"/>
    老师姓名:<input type="text" name="tea" value="${cr.tea}"/>
    班长姓名:<input type="text" name="man" value="${cr.man}"/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
