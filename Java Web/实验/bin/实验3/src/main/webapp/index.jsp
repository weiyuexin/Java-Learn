<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>1912020064-韦月鑫-实验3-JDBC</title>
<script type="text/javascript" src="js/index.js"></script>
</head>

<body>
	<form action="loginCheck.jsp" method="POST" onsubmit="return Check()">
		<table class="table">
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /></td>
				<td><a href="register.jsp"><input type="button" value="注册" /></a></td>
			</tr>
		</table>
	</form>
</body>

</html>