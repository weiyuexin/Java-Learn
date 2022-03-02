<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>留言界面</title>
<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	<form action="addMessage.jsp" method="POST" onsubmit="return Check()">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" id="username"/></td>
			</tr>
			<tr>
				<td>留言:</td>
				<td><input type="text" name="message" id="message"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
				<td><a href="SeeMessage.jsp"><input type="button" value="查看所有留言" /></a></td>
			</tr>
		</table>
	</form>
</body>
</html>