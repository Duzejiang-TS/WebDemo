<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/25
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读取Cookie</title>
</head>
<body>
<%
    //获取本站在客户端上保留的所有Cookie
    Cookie[] cookies = request.getCookies();
    //遍历客户端上的每一个Cookie
    for(Cookie c : cookies){
        //如果Cookie的名为username,表明该Cookie是我们需要访问的Cookie
        if(c.getName().equals("username")){
            out.println(c.getValue());
        }
    }
%>
</body>
</html>
