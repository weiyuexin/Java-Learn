<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>1912020064-韦月鑫-实验2</title>
<link rel="stylesheet" href="css/style.css" />
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
				<td><input type="submit" value="提交查询" /></td>
			</tr>
		</table>
	</form>
</body>

</html>