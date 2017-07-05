<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
Users: <select name="userId" multiple="true">
<c:forEach items="${jumpers }" var="jumper">
<option value="${jumper.id}">${jumper.id} ${jumper.firstName} ${jumper.lastName}</option>
</c:forEach>
</select>
Flight: <select name="flightId">
<c:forEach items="${flights }" var="flight">
<option value="${flight.id}">${flight.id} ${flight.aircraft}</option>
</c:forEach>
</select>
<input type="submit" value="Submit">
</form>
</body>
</html>