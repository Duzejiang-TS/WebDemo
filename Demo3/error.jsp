<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/25
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>异常处理页面</title>
</head>
<body>
异常类型是：<%=exception.getClass()%><br/>
异常信息是：<%=exception.getMessage()%><br/>
</body>
</html>
