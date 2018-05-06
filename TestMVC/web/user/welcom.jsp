<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/5
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<h1>欢迎登陆</h1>
<c:choose>
    <c:when test="${empty sessionScope.sessionUser}">异常闯入，请走正常渠道</c:when>
    <c:otherwise>
        ${sessionScope.sessionUser}
    </c:otherwise>
</c:choose>
</body>
</html>
