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
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
    <div id="wrapper">
        <div id="page-wrapper">
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Registration
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form:form role="form" method="post" modelAttribute="user">
                                        <div class="form-group">
                                            <label>Email</label>
                                            <form:errors path="email" cssClass="error" element="div"/>
                                            <form:input path="email" class="form-control" placeholder="Email"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Password</label>
                                            <form:errors path="password" cssClass="error" element="div"/>
                                            <form:password path="password" class="form-control" placeholder="Your Password"/>
                                        </div>
                                        <div class="form-group">
                                            <label>First Name</label>
                                            <form:errors path="firstName" cssClass="error" element="div"/>
                                            <form:input path="firstName" class="form-control" placeholder="Name"/>
                                        </div>
                                         <div class="form-group">
                                            <label>Last Name</label>
                                            <form:errors path="lastName" cssClass="error" element="div"/>
                                            <form:input path="lastName" class="form-control" placeholder="Last Name"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Insurance Number</label>
                                            <form:errors path="insuranceNumber" cssClass="error" element="div"/>
                                            <form:input path="insuranceNumber" class="form-control" placeholder="12345677544324"/>
                                        </div>
										<div class="form-group">
                                            <label>Insurance Expiration Date</label>
                                            <input type="date" name="expiration" class="form-control"/>
                                        </div>
										<!-- <input type="submit" class="btn btn-default" value="Submit"> -->
                                        <button type="submit" class="btn btn-default">Submit</button>
                                    </form:form>                                  
                                </div>
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="resources/dist/js/sb-admin-2.js"></script>

</body>
</html>