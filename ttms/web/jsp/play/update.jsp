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
<form method="post" action="/update2PlayServlet?play_id=${play.play_id}" enctype="multipart/form-data">
    剧目名称:<input type="text" name="play_name" value="${play.play_name}"/><br /><br /><br />
    简介:<input type="text" name="play_introduction" value="${play.play_introduction}"/><br /><br /><br />
    <img src="${pageContext.request.contextPath}/img/OnShow/${play.play_image}" alt="400*300"><br /><br /><br />
    图片:<br><br><input type="file" name="play_image"/><br />
    时长:<input type="text" name="play_length" value="${play.play_length}"/><br /><br /><br />
    票价: <input type="text" name="play_ticket_price" value="${play.play_ticket_price}"/><br /><br /><br />
    状态 :<input type="text" name="play_status" value="${play.play_status}"/><br /><br /><br />
    语言: <select name="lang" >
            <option value="${play.lang}">${play.lang}</option>
            <option value="英语">英语</option>
            <option value="汉语普通话">汉语普通话</option>
            <option value="意大利语">意大利语</option>
            <option value="印度语">印度语</option>
        </select><br /><br /><br />
    类型(请重新填写！):<br /><br />
        <p><input type="checkbox" name="type" value="动作"/>动作
            <input type="checkbox" name="type" value="冒险"/>冒险
            <input type="checkbox" name="type" value="奇幻"/>奇幻
            <input type="checkbox" name="type" value="校园"/>校园
            <input type="checkbox" name="type" value="爱情"/>爱情</p>
        <p><input type="checkbox" name="type" value="青春"/>青春
            <input type="checkbox" name="type" value="战争"/>战争
            <input type="checkbox" name="type" value="军旅"/>军旅
            <input type="checkbox" name="type" value="喜剧"/>喜剧
            <input type="checkbox" name="type" value="教育"/>教育
        <p><input type="checkbox" name="type" value="剧情"/>剧情
            <input type="checkbox" name="type" value="动画"/>动画
            <input type="checkbox" name="type" value="科技"/>科技</p><br /><br /><br />
    上映日期:<input type="text" name="play_showtime" value="${play.play_showtime}"/><br /><br /><br />
    <%--表单id： <input type="text" name="play_id" value="${play.play_id}" disabled/><br /><br /><br />--%>
    <input type="submit" style="width:50px; height:20px;" value="修改"/>
</form>
</div>
</body>
</html>
