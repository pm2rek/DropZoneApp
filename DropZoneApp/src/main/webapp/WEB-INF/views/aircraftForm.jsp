<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="aircraft">
		<form:errors path="name" cssClass="error" element="div" />
		Aircraft Name: <form:input path="name"/><br>
		<form:errors path="registration" cssClass="error" element="div" />
		Registration: <form:input path="registration"/><br>
		Passengers Limit: <input name="maxPassengers" type="number" /><br>
		<input type="submit" value="Submit">

	</form:form>
	<a href="../aircrafts/list"> back</a>
</body>
</html>