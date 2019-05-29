<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>
<h2>Name:<%=request.getParameter("name") %></h2>
<h2>City:<%=request.getParameter("city") %></h2>
<h2>Hobby:<%=request.getParameter("hobby") %></h2>

</body>
</html>