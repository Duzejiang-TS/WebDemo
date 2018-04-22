<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/24
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试config内置对象</title>
</head>
<body>
<!--输出该JSP名为name的配置信息-->
name配置参数的值：<%=config.getInitParameter("name")%><br/>
<!--输出该JSP名为age的配置信息-->
age配置参数的值：<%=config.getInitParameter("age")%>
</body>
</html>


