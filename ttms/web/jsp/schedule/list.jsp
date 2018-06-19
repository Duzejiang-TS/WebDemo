<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/9
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/managers/header.jsp" %>
<html>
<head>
    <title>剧目展示</title>
</head>
<style>
    table {
        padding-top: 40px;

        font-weight: bold;
        padding-bottom: 100px;}

</style>
<body>
<div style="background-image: url(/img/墙.jpg);" >
    <center>
        <h1 style="text-align: center">演出厅信息</h1>
<table width="900px" height="100px" border="1" >
    <tr>
        <td style="font-size: 18px; text-align: center;">演出厅名称</td>
        <td style="font-size: 18px; text-align: center;">剧目名称</td>
        <td style="font-size: 18px; text-align: center;">时间</td>
        <td style="font-size: 18px; text-align: center;">影片类型</td>
        <td style="font-size: 18px; text-align: center;">播出日期</td>
        <td style="font-size: 18px; text-align: center;">操作</td>
    </tr>
    <c:forEach items="${sessionScope.list2}" var="scs">
        <tr>
            <td style="font-size: 18px; text-align: center;">${scs.studio_name}</td>
            <td style="font-size: 18px; text-align: center;">${scs.play_name}</td>
            <td style="font-size: 18px; text-align: center;">${scs.sched_time}</td>
            <td style="font-size: 18px; text-align: center;">${scs.lang_version}</td>
            <td style="font-size: 18px; text-align: center;">${scs.sche_date}</td>
            <td style="font-size: 18px; text-align: center;">
                <a style="color:#D43F3A;font-size: 18px; text-align: center;" href="/deleteScheduleServlet?id=${scs.id}" >删除</a>
                <a style="color:#D43F3A;font-size: 18px; text-align: center;" href="/update1ScheduleServlet?id=${scs.id}" >修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
    </center>
    <h1 style="text-align: center"><a style="background-color: whitesmoke;color: #000000;" href="/jsp/schedule/add.jsp" class="btn btn-primary" role="button">添加</a></h1>
</div>
</body>
</html>
