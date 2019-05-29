<%@page import="com.demo.security.Users"%>
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
<jsp:setProperty property="name" name="auth" value="<%=request.getParameter(\"name\") %>"/>
<jsp:setProperty property="password" name="auth" value="<%=request.getParameter(\"password\") %>"/>

	<%
	Users u=(Users)session.getAttribute("auth");
	if(u.authenticate())
		 {
	%>
	<jsp:forward page="success.jsp" />
	<%
		} else {
	%>
	<jsp:forward page="failure.jsp" />
	<%
		}
	%>

</body>
</html>