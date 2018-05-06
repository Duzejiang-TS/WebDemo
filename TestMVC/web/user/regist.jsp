<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/5/5
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>regist</title>
</head>
<body>
<h1>注册</h1>
<p style="color: red;font-weight: 900" >${msg}</p>
<form action="/registServlet" method="post">
    用户名：<input type="text" name="username" value="${user.username}"/><br/>
    密 码：<input type="password" name="password value="${user.password}" ><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
