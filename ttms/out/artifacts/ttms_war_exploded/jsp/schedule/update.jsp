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
<div style="background-image: url(/img/墙.jpg);" >
<form method="post" action="/update2ScheduleServlet?id=${scheduleOut.id}">
    演出厅名称：<input type="text" name="studio_name" value="${scheduleOut.studio_name}"/><br><br><br>
    剧目名称<input type="text" name="play_name" value="${scheduleOut.play_name}"/><br><br><br>
    时间<input type="text" name="sched_time" value="${scheduleOut.sched_time}"/><br><br><br>
    影片类型：<input type="text" name="lang_version" value="${scheduleOut.lang_version}"/><br><br><br>
    播出日期:<input type="text" name="sche_date" value="${scheduleOut.sche_date}"/><br><br><br>
    <%--id： <input type="text" name="id" value="${scheduleOut.id}" /><br><br><br>--%>
    <input type="submit" style="width:50px; height:20px;" value="修改"/>
</form>
</div>
</body>
</html>
