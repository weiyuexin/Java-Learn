<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload" method="post" ENCTYPE="multipart/form-data">
    姓名：<input type="text" name="uname"><br>
    文件<input type="file" name="myfile"><br>
    <%--button默认的提交类型是submit--%>
    <button>提交</button>
</form>
</body>
</html>