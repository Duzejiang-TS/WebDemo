<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/9
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/managers/header.jsp" %>
<html>
<head>
    <title>修改</title>
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
<form method="post" action="/update2StudioServlet?studio_id=${studio.studio_id}">
    演出厅：<input type="text" name="studio_name" value="${studio.studio_name}"/><br><br><br>
    第<input type="text" name="studio_row_count" value="${studio.studio_row_count}"/>排
    第<input type="text" name="studio_col_count" value="${studio.studio_col_count}"/>列<br><br><br>
    演出厅类型：<input type="text" name="studio_introduction" value="${studio.studio_introduction}"/><br><br><br>
    <%--id： <input type="text" name="studio_id" value="${studio.studio_id}" disabled/><br><br><br>--%>
    <input type="submit" style="width:50px; height:20px;" value="修改"/>
</form>
</div>
</body>
</html>
