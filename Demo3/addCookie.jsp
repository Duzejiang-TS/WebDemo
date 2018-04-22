<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/25
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加Cookie</title>
</head>
<body>
<%
    //获取请求参数
    String name = request.getParameter("name");
    //以获取到的请求参数为值，创建一个Cookie对象
    Cookie c = new Cookie("username",name);
    //设置Cookie对象的生命期限
    c.setMaxAge(24 * 3600);
    //向客户端增加Cookie对象
    response.addCookie(c);
%>
</body>
</html>
