<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>NAME</th>
		<th>REGISTRATION</th>
		<th>MAX PASSANGERS</th>

	</tr>
	<c:forEach items="${aircraft}" var="aircraft">
		<tr>
			<td>${aircraft.name}</td>
			<td>${aircraft.registration}</td>
			<td>${aircraft.maxPassengers}</td>
			<td><a href="edit/${aircraft.id}" />edit </td>
			<td><a href="delete/${aircraft.id}" />delete </td>
		</tr>
	</c:forEach>

</table>
	<a href="add">Add new Aircraft</a>
	<br>
	<a href="../"> Back to main menu</a>
</body>
</html>