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
<body>
<h1 style="text-align: center" >所有剧目
    <a href="/jsp/play/add.jsp" class="btn btn-primary" role="button" style="right: 5px">添加</a></h1>


<p id="test"></p>
<div style="font-size: 24px;background-image: url(/img/墙.jpg);">
    <div class="row">
    <c:forEach items="${sessionScope.list}" var="pa" >
        <div class="col-xs-6 col-md-2">
            <div class="thumbnail">
                <img src="${pageContext.request.contextPath}/img/OnShow/${pa.play_image}" alt="347*250" width="347" height="250">
                <div style="background-color:#ABCDEF;">
                    <h3>${pa.play_name}</h3>
                    <p>简介：</p><textarea rows="2" cols="25" readonly="readonly">${pa.play_introduction}</textarea>
                    <p>片长：${pa.play_length}</p>
                    <p>票价：${pa.play_ticket_price}</p>
                    <p>状态：<c:if test="${pa.play_status eq 1}">正在热映</c:if>
                            <c:if test="${pa.play_status eq 0}">即将上映</c:if></p>
                    <p>语言：${pa.lang}</p>
                    <p>类型：${pa.type}</p>
                    <p>上映日期：${pa.play_showtime}</p>
                    <p>
                        <a href="/deletePlayServlet?id=${pa.play_id}" class="btn btn-primary" role="button">删除</a>
                        <a href="/update1PlayServlet?id=${pa.play_id}" class="btn btn-primary" role="button">修改</a>
                    </p>
                </div>
            </div>
        </div>
    </c:forEach>

</div>
</div>
</body>
</html>
