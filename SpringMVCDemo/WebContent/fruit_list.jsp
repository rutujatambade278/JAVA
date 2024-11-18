<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
<c:forEach var="local_variable" items="${fruits}">
	<li>${local_variable}</li>
</c:forEach>
</ul>

Fruit List
</br>
${fruit}
<br/>
${fruit_list}

</body>
</html>