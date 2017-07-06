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
<p>${user.firstName} ${user.lastName} have ${user.accountBalance} PLN</p>
<form method="post">
		Payment: <input name="value" type="number" step="0.01"/><br>
		<input type="submit" value="Submit">
</form>
</body>
</html>