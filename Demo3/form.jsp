<%--
  Created by IntelliJ IDEA.
  User: 旗云百里
  Date: 2018/3/25
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>收集参数的表单页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<form id="form1" method="post" action="/aa">
    用户名：<br/>
    <input type="text" name="name"><hr/>
    性别：<br/>
    男：<input type="radio" name="gender" value="男">
    女：<input type="radio" name="gender" value="女"><hr/>
    喜欢的颜色：<br/>
    红：<input type="checkbox" name="color" value="红">
    绿：<input type="checkbox" name="color" value="绿">
    蓝：<input type="checkbox" name="color" value="蓝"><hr/>
    来自国家：<br/>
    <select name="country">
        <option value="中国">中国</option>
        <option value="美国">美国</option>
        <option value="俄罗斯">俄罗斯</option>
    </select><hr/>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
