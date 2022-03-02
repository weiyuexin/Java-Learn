<%--
  Created by IntelliJ IDEA.
  User: wyx
  Date: 2021/11/2
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录成功页面</title>
</head>
<body>
<%!Cookie username;%>
<%
    //通过request对象获取客户端的cookie
    Cookie cookie[] = request.getCookies();
    if (cookie != null) {
        //遍历所有cookie
        for (int i = 0; i < cookie.length; i++) {
            Cookie temp = cookie[i];
            if (temp.getName().equals("username")) {
                username = temp;
            }
        }
    }
%>
<h1>欢迎，
    <%
        if (username == null) {
            //如果没有登录，则重定向到登录页面
            response.sendRedirect("index.jsp");
        } else {
            out.println(username.getValue());
            username=null;//解决移除cookie刷新后无反应的问题
        }
    %>
</h1>
</body>
</html>
