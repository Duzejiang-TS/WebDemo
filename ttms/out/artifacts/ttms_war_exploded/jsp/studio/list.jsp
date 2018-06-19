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
    table{

        margin-top: 10px;
        padding-top: 40px;
        font-size: 18px;
        font-weight: bold;
        padding-bottom: 100px;}

</style>
<body>
<h1 style="text-align: center">演出厅</h1><br>
<div style="background-image: url(/img/墙.jpg) ; margin-top: 15px" >
    <div style="margin-left: 250px">
        <table width="1000px" height="100px" border="1" >
            <tr>
                <td style="font-size: 18px; text-align: center;">演出厅</td>
                <td style="font-size: 18px; text-align: center;">排数</td>
                <td style="font-size: 18px; text-align: center;">列数</td>
                <td style="font-size: 18px; text-align: center;">演出厅类型</td>
                <td style="font-size: 18px; text-align: center;">操作</td>
            </tr>
            <c:forEach items="${sessionScope.list1}" var="ss">
                <tr>
                    <td style="font-size: 18px; text-align: center;">${ss.studio_name}</td>
                    <td style="font-size: 18px; text-align: center;">${ss.studio_row_count}</td>
                    <td style="font-size: 18px; text-align: center;">${ss.studio_col_count}</td>
                    <td style="font-size: 18px; text-align: center;">${ss.studio_introduction}</td>
                    <td >
                        <a style="color:#D43F3A;font-size: 18px; text-align: center;"href="/deleteStudioServlet?id=${ss.studio_id}">删除</a>
                        <a style="color:#D43F3A;font-size: 18px; text-align: center;" href="/update1StudioServlet?id=${ss.studio_id}">修改</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</div>
<h1 style="text-align: center"><a style="background-color: whitesmoke;color: #000000;" href="/jsp/studio/add.jsp" class="btn btn-primary" role="button">添加</a></h1>
</body>
</html>
