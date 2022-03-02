<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录校验页面</title>
</head>
<body>
	<%
	//获取传递过来的用户名和密码
	String username = (String) request.getParameter("username");
	String password = (String) request.getParameter("password");
	if(username==null || password==null){
		//没有输入用户名和密码直接访问时，重定向到登录页
		response.sendRedirect("index.jsp");
	}else if (!username.equals("weiyuexin")) {
		out.println("<script type='text/javascript'>alert('用户名错误，请重新输入');window.history.go(-1);</script>");
	} else if (!password.equals("weiyuexin")) {
		out.println("<script type='text/javascript'>alert('密码错误，请重新输入');window.history.go(-1);</script>");
	} else {
		//新建cookie对象
		Cookie c = new Cookie("username",username);
		// 设置最大保存时间
		c.setMaxAge(60*60*24);
		//通过response对象将cookie设置到客户端
		response.addCookie(c);
		response.sendRedirect("loginSuccess.jsp");
	}
	%>
</body>
</html>