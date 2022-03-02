<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/index.js"></script>
<title>用户注册</title>
</head>
<body>
	<form action="registerCheck.jsp" method="POST" onsubmit="return Check1()">
		<table class="table">
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td><input type="password" name="pwd" id="pwd" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册" /></td>
				<td><a href="index.jsp"><input type="button" value="登录" /></a></td>
			</tr>
		</table>
	</form>
</body>
</html>