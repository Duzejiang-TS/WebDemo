<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/25
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext测试</title>
</head>
<body>
<%
    //使用pageContext设置属性，该属性默认在page范围内
    pageContext.setAttribute("page","hello");

    //使用request设置属性，该属性默认在request范围内
    request.setAttribute("request","hello");

    //使用pageContext将属性设置在request范围中
    pageContext.setAttribute("request2","hello",pageContext.REQUEST_SCOPE);

    //使用session设置属性，该属性默认在session范围内
    session.setAttribute("session","hello");

    //使用pageContext将属性设置在session范围中
    pageContext.setAttribute("session2","hello",pageContext.SESSION_SCOPE);

    //下面获取各属性所在范围：
    out.println("page变量所在范围：" +
            pageContext.getAttributesScope("page") + "<br/>");

    out.println("request变量所在范围：" +
            pageContext.getAttributesScope("request") + "<br/>");

    out.println("request2变量所在范围：" +
            pageContext.getAttributesScope("request2") + "<br/>");

    out.println("session变量所在范围：" +
            pageContext.getAttributesScope("session") + "<br/>");

    out.println("session2变量所在范围：" +
            pageContext.getAttributesScope("session2") + "<br/>");
%>
</body>
</html>
