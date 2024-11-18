<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition of Two Numbers</title>
</head>
<body>
<%
	int x = Integer.parseInt(request.getParameter("num1"));
	int y = Integer.parseInt(request.getParameter("num2"));
	
	int z = x + y;
%>

<h1>

<%= x %> + <%= y %> = <%= z%>

</h1>
</body>
</html>