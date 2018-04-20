<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/19
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forward结果页</title>
</head>
<body>
<!--使用request内置对象获取age参数的值-->
<%=request.getParameter("age")%>
<!--输出username请求参数的值-->
<%=request.getParameter("username")%>
</body>
</html>
