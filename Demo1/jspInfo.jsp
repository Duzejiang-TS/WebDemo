<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/19
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--指定info信息-->
<%@ page info="this is a jsp"%>
<html>
<head>
    <title>测试page指令的info属性</title>
</head>
<body>
<!--输出info信息-->
<%=getServletInfo()%>
</body>
</html>
