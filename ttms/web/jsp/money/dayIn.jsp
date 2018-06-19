<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/managers/header.jsp" %>
<html>
<head>
    <title>查询日期</title>
</head>
<style>
    form{
        margin-left: 500px;
        margin-top: 10px;
        line-height: 10px;;
        padding-top: 40px;
        font-size: 18px;
        font-weight: bold;
        padding-bottom: 100px;}

</style>
<body>
<div style="background-image: url(/img/墙.jpg) ;" >
<h1 style="text-align: center">输入查询信息</h1>
<form method="post" action="/moneyServlet">
    需要查询<input type="text" name="month"/>月<input type="text" name="day"/>日
    <input type="submit" value="查询"/>
</form>
</div>
</body>
</html>
