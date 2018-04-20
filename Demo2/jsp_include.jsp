<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/20
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp_include测试</title>
</head>
<body>
<!--使用动态include指令导入页面-->
<jsp:include page="forward_result.jsp">
    <jsp:param name="age" value="32"/>
</jsp:include>
</body>
</html>
