<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<center>
		<fieldset>
			<legend>Login Form</legend>
			<form action="${pageContext.request.contextPath}/login_action" method="POST">
			
				<input type="text" name="username" placeholder="UserName" autocomplete="off"/><br/>
				
				<input type="password" name="password" placeholder="password"/><br/>
				
				<input type="submit" value="Login"/>
			</form>
		</fieldset>
		
	</center>

</body>
</html>