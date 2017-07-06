<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DropZone Managment App</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../../resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../../resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<form:form method="post" modelAttribute="user">
		<form:errors path="email" cssClass="error" element="div"/>
		Email: <form:input path="email" /><br>
		<form:errors path="password" cssClass="error" element="div"/>
		Password: <form:password path="password" /><br>
		<form:errors path="firstName" cssClass="error" element="div" />
		First Name: <form:input path="firstName" /><br>
		<form:errors path="lastName" cssClass="error" element="div"/>
		Last Name: <form:input path="lastName" /><br>
		<form:errors path="insuranceNumber" cssClass="error" element="div"/>
		Insurance Number: <form:input path="insuranceNumber" /><br>
		Insurance Expiration Date: <input type="date" name="expiration"/><br>
		<input type="submit" value="Submit">

	</form:form>
	<a href="../list"> back</a>
</body>
</html>