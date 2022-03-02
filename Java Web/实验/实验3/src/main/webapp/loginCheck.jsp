<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="db_conn.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录校验页面</title>
</head>
<body>
	<%
	// 设置请求的编码格式，解决中文乱码问题
	request.setCharacterEncoding("UTF-8");
	//获取传递过来的用户名和密码
	String username = (String) request.getParameter("username");
	String password = (String) request.getParameter("password");
	//没有输入用户名和密码直接访问时，重定向到登录页
	if (username == null || password == null) {
		response.sendRedirect("index.jsp");
	}
	/*验证登录*/
	//实例化Statement对象
	Statement statement = connection.createStatement();
	//定义SQL语句
	String sqlString = "select * from user where username=" + "'" + username + "'" + "and password=" + "'" + password + "'";
	//执行sql语句返回结果集
	ResultSet rSet = statement.executeQuery(sqlString);
	// 展开结果集
	if (rSet.next()) {
		//新建cookie对象
		Cookie c = new Cookie("username", username);
		// 设置最大保存时间
		c.setMaxAge(60 * 60 * 24);
		//通过response对象将cookie设置到客户端
		response.addCookie(c);
		response.sendRedirect("loginSuccess.jsp");
	} else {
		out.println("<script type='text/javascript'>alert('该用户不存在或密码错误！');window.history.go(-1);</script>");
	}
	// 完成后关闭连接
	rSet.close();
	statement.close();
	connection.close();

	/* if (username == null || password == null) {
		//没有输入用户名和密码直接访问时，重定向到登录页
		response.sendRedirect("index.jsp");
	} else if (!username.equals("weiyuexin")) {
		out.println("<script type='text/javascript'>alert('用户名错误，请重新输入');window.history.go(-1);</script>");
	} else if (!password.equals("weiyuexin")) {
		out.println("<script type='text/javascript'>alert('密码错误，请重新输入');window.history.go(-1);</script>");
	} else {
		//新建cookie对象
		Cookie c = new Cookie("username", username);
		// 设置最大保存时间
		c.setMaxAge(60 * 60 * 24);
		//通过response对象将cookie设置到客户端
		response.addCookie(c);
		response.sendRedirect("loginSuccess.jsp");
	} */
	%>
</body>
</html>