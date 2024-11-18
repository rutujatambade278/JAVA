<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Demo</title>
</head>
<body>
<% String str = request.getParameter("num"); %>
	${str}
	<form action="add">
		Number1 <input type="text" name="num1"/> <br/>
		Number2 <input type="text" name="num2"/> <br/>
		<input type="submit" value="Submit Form"/>
	</form>
</body>
</html>