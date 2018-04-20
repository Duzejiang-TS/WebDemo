<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/5
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第二个jsp页面</title>
</head>
<body>
<!--下面是JAVA脚本--!>
<%for(int i = 0 ; i < 7 ; i++)
{
    out.println("<font size='" + i + "'>");
%>
疯狂（wild java camp）</font>
<br/>
<%}%>
</body>
</html>
