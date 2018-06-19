<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/5
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/managers/header.jsp" %>
<html>
<head>
    <title>添加演出厅</title>
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
<form method="post" action="/addStudioServlet">
    演出厅：<input type="text" name="studio_name"/><br><br><br>
    第<input type="text" name="studio_row_count"/>排
    第<input type="text" name="studio_col_count"/>列<br><br><br>
    演出厅类型：<input type="text" name="studio_introduction"/><br><br><br>
    <input type="submit" style="width:50px; height:20px;" value="添加"/>
    <input type="reset" style="width:50px; height:20px;" value="重填"/>
</form>
</div>
</body>
</html>