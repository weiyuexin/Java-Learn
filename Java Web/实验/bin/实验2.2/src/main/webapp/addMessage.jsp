<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加留言页面</title>
</head>
<body>
	<%
	// 设置请求的编码格式，解决中文乱码问题
	request.setCharacterEncoding("UTF-8");
	String username = (String) request.getParameter("username");
	String message = (String) request.getParameter("message");
	//定义字符数组保存留言内容
	ArrayList<String> messages = new ArrayList<String>();
	//String ip = (String) request.getRemoteAddr();
	String ip;
	if (request.getHeader("x-forwarded-for") == null) {
		ip = request.getRemoteAddr();
	} else {
		ip = request.getHeader("x-forwarded-for");
	}
	if ((username != null || "".equals(username)) && (message != null || "".equals(message))) {//这里不能使用null判断字符串空
		
		String temp = username + "@" + ip + "说: " + message + "<br/>";
		if(application.getAttribute("messageContent")!=null){//将第一条往后的留言保存
			messages=(ArrayList<String>) application.getAttribute("messageContent");
			messages.add(temp);//将新的留言信息拼接到arraylist后
			application.setAttribute("messageContent", messages);
		}else{//将第一条留言保存
			messages.add(temp);
			application.setAttribute("messageContent",messages);
		}
		out.println("<script type='text/javascript'>alert('留言成功');window.history.go(-1);</script>");
	} else {
		out.println("<script type='text/javascript'>alert('请检查用户名和留言是否填写!');window.history.go(-1);</script>");
		response.sendRedirect("index.jsp");
	}
	%>
</body>
</html>