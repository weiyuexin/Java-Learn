<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.Date,java.text.DateFormat,java.text.SimpleDateFormat"%>
<%@ include file="db_conn.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册校验页面</title>
</head>
<body>
	<%
	// 设置请求的编码格式，解决中文乱码问题
	request.setCharacterEncoding("UTF-8");
	//获取传递过来的用户名和密码
	String username = (String) request.getParameter("username");
	String password = (String) request.getParameter("password");
	//是否已经注册的标志
	boolean isRegister = false;
	//获取一个Date对象
	Date date = new Date();
	//创建一个格式化日期对象
	DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//格式化当前时间
	String registerTime = simpleDateFormat.format(date);

	/*检查该用户是否注册，已经注册的不可以重复注册*/
	//实例化Statement对象
	Statement statement = connection.createStatement();
	//定义SQL语句
	String sqlString = "select username from user";
	//执行sql语句返回结果集
	ResultSet rSet = statement.executeQuery(sqlString);
	// 展开结果集
	while (rSet.next()) {
		String user = rSet.getString("username");
		if (user.equals(username)) {
			isRegister = true;//查询到该用户
			break;
		}
	}

	//没有输入用户名和密码直接访问时，重定向到登录页
	if (username == null || password == null) {
		response.sendRedirect("index.jsp");
	}
	//根据是否注册，执行后续操作
	if (isRegister == true) {
		out.println("<script type='text/javascript'>alert('该用户已经注册，不可重复注册');window.history.go(-1);</script>");
	} else {//执行注册
		try {
			//定义注册的SQL语句,SQL语句中字符串要有单引号
			String registerSQL = "insert into user (username,password,registerTime) values (" + "'" + username + "'" + ","
			+ "'" + password + "'" + "," + "'" + registerTime + "')";
			//out.print(registerSQL);
			//执行SQL语句
			PreparedStatement perStatement = connection.prepareStatement(registerSQL);
			perStatement.executeUpdate();
			out.println("<script type='text/javascript'>alert('注册成功');window.history.go(-1);</script>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 完成后关闭连接
	rSet.close();
	statement.close();
	connection.close();
	%>
</body>
</html>