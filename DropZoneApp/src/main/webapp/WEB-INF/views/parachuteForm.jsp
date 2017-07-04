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
<form:form method="post" modelAttribute="parachute">
		<form:errors path="mainParachuteName" cssClass="error" element="div" />
		Main Parachute: <form:input path="mainParachuteName"/><br>
		<form:errors path="reserveParachuteName" cssClass="error" element="div" />
		Reserve Parachute: <form:input path="reserveParachuteName"/><br>
		<form:errors path="ADDName" cssClass="error" element="div" />
		ADD: <form:input path="ADDName"/><br>
		Reserve Parachute Expiration Date: <input type="date" name="expiration"/><br>
 		<form:errors path="user" cssClass="error" element="div" />
		Owner: <form:select path="user.id" items="${users}" itemlabel="fullName" itemValue="id"/><br> 
		<input type="submit" value="Submit">

	</form:form>
	<a href="../aircrafts/list"> back</a>
</body>
</html>