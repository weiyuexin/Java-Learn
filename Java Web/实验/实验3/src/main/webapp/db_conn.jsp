<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//JDBC驱动名以及数据库URL
	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/javaweb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	// 数据库用户名和密码
    String USER = "root";
	String PASS = "root";
	// 声明connection对象
    Connection connection = null;
    try {
		// 加载驱动程序
		Class.forName(JDBC_DRIVER);
		// 连接数据库
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		if (!connection.isClosed()) {//数据库连接成功
			// 完成后关闭连接
			//rSet.close();
			//statement.close();
			//connection.close();
		}else{
			out.print("<script type='text/javascript'>alert('数据库连接失败')</script>");
		}
	} catch (SQLException se) {
		// 处理 JDBC 错误
		se.printStackTrace();
	} catch (Exception e) {
		// 处理 Class.forName 错误
		e.printStackTrace();
	} 
	%>
</body>
</html>