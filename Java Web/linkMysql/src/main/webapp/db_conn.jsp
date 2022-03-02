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
	String DB_URL = "jdbc:mysql://localhost:3306/alumni?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	// 数据库用户名和密码
    String user = "root";
	String password = "root";
	// 声明connection对象
    Connection connection = null;
    try {
		// 加载驱动程序
		Class.forName(JDBC_DRIVER);
		// 连接数据库
		connection = DriverManager.getConnection(DB_URL, user, password);
		if (!connection.isClosed()) {
			out.print("数据库连接成功<br/>");
			// 执行查询
			// 实例化Statement对象
			Statement statement = connection.createStatement();
			// 定义SQL语句
			String sqlString = "select * from user";
			// 执行sql语句返回结果集
			ResultSet rSet = statement.executeQuery(sqlString);
			// 展开结果集
			int sum =0;
			while (rSet.next()) {
				sum++;
				String id = rSet.getString("id");
				String studentId = rSet.getString("studentId");
				String name = rSet.getString("name");
				String sex = rSet.getString("sex");
				String major = rSet.getString("major");
				String classString = rSet.getString("class");
				String college = rSet.getString("college");
				// 输出结果集
				out.println(id + "\t" + studentId + "\t" + name + "\t" + sex + "\t" + major + "\t"
						+ classString + "\t" + college + "<br/>");
			}
			out.println("一共" + sum +"条记录");
			// 完成后关闭连接
			rSet.close();
			statement.close();
			connection.close();
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