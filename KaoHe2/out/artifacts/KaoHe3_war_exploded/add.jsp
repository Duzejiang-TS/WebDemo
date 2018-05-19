<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/16
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<h1>添加</h1>
<form method="post" action="/items/add.do">
    班级编码:<input type="text" name="id"/>
    班级名称:<input type="text" name="name"/>
    班级人数:<input type="text" name="stu"/>
    老师姓名:<input type="text" name="tea"/>
    班长姓名:<input type="text" name="man"/>
    <input type="submit" value="添加"/>
</form>

</body>
</html>
