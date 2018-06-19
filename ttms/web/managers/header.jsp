<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/6/8
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="/css/bootstrap.css" />
    <link rel="stylesheet" href="/css/my.css" />
    <link href="/css/css.css" rel="stylesheet" type="text/css" />


    <!--需要引入JQuery-->
    <script type="text/javascript" src="/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
<br />
<nav class="navbar navbar-default" >
    <div style="background-color: pink">
        <div class="container-fluid">
            <div style="font-size: 20px;background-color: white">
                <nav class="navbar navbar-collapse">
                    <div class="container-fluid" style="margin-left: 0">
                        <img alt="" src="/img/logo.jpg">
                    </div>
                </nav>
            </div>
        </div>
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}" class="active"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>主页</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/servlet/ClientServlet?operation=search" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" name="play_name" placeholder="搜索">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </li>
                <c:if test="1">
                    <li><a href="${pageContext.request.contextPath}/login/login.jsp">/登录</a></li>
                    <li><a href="${pageContext.request.contextPath}/login/regist.jsp">/注册</a></li>
                </c:if>
                <c:if test="${sessionScope.emp!=null}">
                    <div class="navbar-text">
                        <li>欢迎您：</li>
                    </div>
                    <li><a href="${pageContext.request.contextPath}/servlet/ClientServlet?operation=logout">/注销</a></li>
                </c:if>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>
<div style=" padding-top:20px;background-color:antiquewhite;height:1500px;width:180px;float:left;">
    <div style="position: fixed">
        <ul type="null">
            <li><a style="font-size: 18px;color: #000000;" href="/allfindPlayServlet" target="_blank">剧目管理</a></li><br><br><br>
            <li><a style="font-size: 18px;color: #000000;" href="/allfindStudioServlet" target="_blank">演出厅管理</a></li><br><br><br>
            <li><a style="font-size: 18px;color: #000000;" href="/allfindScheduleServlet" target="_blank">演出计划管理</a></li>
        </ul>
    </div>
</div>

</body>
