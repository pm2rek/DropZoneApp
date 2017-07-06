<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>MAIN PARACHUTE</th>
		<th>RESERVE PARACHUTE</th>
		<th>ADD</th>
		<th>RESERVE EXPIRATION DATE</th>
		<th>OWNER</th>

	</tr>
	<c:forEach items="${parachute}" var="parachute">
		<tr>
			<td>${parachute.mainParachuteName}</td>
			<td>${parachute.reserveParachuteName}</td>
			<td>${parachute.ADDName}</td>
			<td><fmt:formatDate value="${parachute.expirationDate}" pattern="yyyy-MM-dd"/></td>
			<td>${parachute.user}</td>
			<td><a href="edit/${parachute.id}" />edit </td>
			<td><a href="delete/${parachute.id}" />delete </td>
		</tr>
	</c:forEach>

</table>
	<a href="add">Add new Parachute</a>
	<br>
	<a href="../"> Back to main menu</a>
</body>
</html>