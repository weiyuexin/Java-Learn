<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看所有留言</title>
</head>
<body>
	<%
	if (application.getAttribute("messageContent") != null) {
		ArrayList<String> messages = new ArrayList<String>();
		messages =(ArrayList<String>) application.getAttribute("messageContent");
		Iterator message = messages.iterator();
		while(message.hasNext()){
			out.println(message.next());
		}
	} else {
		out.println("暂时还没有留言信息！");
	}
	%>
</body>
</html>