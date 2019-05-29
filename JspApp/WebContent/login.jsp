<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="auth" class="com.demo.security.Users" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Form</h1>
<hr>
<form action="processor.jsp">
Name:<input type="text" name="name"><br/>
Password:<input type="password" name="password"><br/>

<input type="submit" value="Login"><br/>
</form>
</body>
</html>