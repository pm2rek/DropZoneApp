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
<form:form method="post" modelAttribute="flight">
		<form:errors path="aircraft" cssClass="error" element="div" />
		Aircraft:<form:select path="aircraft.id" items="${aircrafts}" itemlabel="fullName" itemValue="id"/><br>
		<input type="submit" value="Submit">

	</form:form>
	<a href="../flights/list"> back</a>
</body>
</html>