<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/5
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/managers/header.jsp" %>
<html>
<head>
    <title>添加剧目计划</title>
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
<form method="post" action="/addScheduleServlet">
    演出厅名称：<select name="studio_name">
                    <c:forEach items="${sessionScope.list1}" var="scs">
                        <option value="${scs.studio_name}">${scs.studio_name}</option>
                    </c:forEach>
              </select><br><br><br>
    剧目名称：<select name="play_name">
                <c:forEach items="${sessionScope.list}" var="scs">
                    <option value="${scs.play_name}">${scs.play_name}</option>
                </c:forEach>
            </select><br><br><br>
    时间：<input type="text" name="sched_time"/><br><br><br>
    影片类型：<select name="lang_version">
                <option value="国语3D">国语3D</option>
                <option value="英语3D">英语3D</option>
                <option value="国语2D">国语2D</option>
                <option value="英语2D">英语2D</option>
            </select><br><br><br>
    播出日期：<input type="text" name="sche_date"/><br><br><br>
    <input type="submit" style="width:50px; height:20px;" value="添加"/>
    <input type="reset" style="width:50px; height:20px;" value="重填"/>
</form>
</div>
</body>
</html>