<%--
  Created by IntelliJ IDEA.
  User:韦月鑫
  Date: 2021/11/2
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册页面</title>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<form action="register" method="get" onsubmit="return Check1()">
    <table class="table">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username" id="username"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password" id="password"/></td>
        </tr>
        <tr>
            <td>确认密码:</td>
            <td><input type="password" name="pwd" id="pwd"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"/></td>
            <td><a href="index.jsp"><input type="button" value="登录"/></a></td>
        </tr>
    </table>
</form>
</body>
</html>
