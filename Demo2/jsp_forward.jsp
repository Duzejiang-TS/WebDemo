<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/19
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>froward的原始页</title>
</head>
<body>
<h3>forward的原始页</h3>
<jsp:forward page="forward_result.jsp">
    <jsp:param name="age" value="29"/>
</jsp:forward>
</body>
</html>
