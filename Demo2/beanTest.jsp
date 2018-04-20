<%@ page import="lee.Person" %><%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/22
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Bean 测试</title>
</head>
<body>
<%
    //实例化JavaBean实例，实现类为lee.Person，该实例的实例名为p1
    Person p1 = new Person();
    //将p1放置到page范围中
    pageContext.setAttribute("p1",p1);
    //设置p1的name属性
    p1.setName("wawa");
    //设置p1的age属性
    p1.setAge(23);
%>
<!--输出p1的name属性值-->
<%=p1.getName()%><br/>
<!--输出p1的age属性值-->
<%=p1.getAge()%>
</body>
</html>

<!--
<body>
<!--创建lee.Person的实例，该实例的实例名为p1-->
<jsp:useBean id="p1" class="lee.Person" scope="page"/>
<!--设置p1的name属性值-->
<jsp:setProperty name="p1" property="name" value="wawa"/>
<!--设置p1的age属性值-->
<jsp:setProperty name="p1" property="age" value="23"/>
<!--输出p1的name属性值-->
<jsp:getProperty name="p1" property="name"/><br/>
<!--输出p1的age属性值-->
<jsp:getProperty name="p1" property="age"/>
</body>
-->