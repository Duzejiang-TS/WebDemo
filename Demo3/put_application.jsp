<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/24
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
<!--JSP声明-->
<%!
    int i;
%>
<!--将i值自加后放入application的变量内-->
<%
    application.setAttribute("counter",String.valueOf(++i));
%>
<!--输出i值-->
<%=i%>
</body>
</html>
