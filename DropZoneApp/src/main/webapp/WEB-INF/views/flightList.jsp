<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DropZone Flight List</title>

    <!-- Bootstrap Core CSS -->
    <link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="../resources/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="../resources/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<%-- 	<table>
		<tr>
			<th>DATE</th>
			<th>AIRCRAFT</th>

		</tr>
		<c:forEach items="${flight}" var="flight">
			<tr>
				<td><fmt:formatDate value="${flight.date}" pattern="yyyy-MM-dd HH:mm" /></td>
				<td>${flight.aircraft}</td>
				<td><a href="start/${flight.id}" />Start</td>
				<td><a href="stop/${flight.id}" />Stop</td>
				<td><a href="edit/${flight.id}" />edit</td>
				<td><a href="delete/${flight.id}" />delete</td>
			</tr>
			<c:forEach items="${flight.users}" var="jumper">
				<tr>
					<td>${jumper }</td>
					<td>${jumper.jumpsNumber }</td>
				</tr>
			</c:forEach>
							<tr>
							<td>
				<form method="post">
					<input type="hidden" name="flightId" value="${flight.id}">
					Users: <select name="userId">
						<c:forEach items="${jumpers }" var="jumper">
							<option value="${jumper.id}">${jumper.id}
								${jumper.firstName} ${jumper.lastName}</option>
						</c:forEach>
					</select>
					<input type="submit" value="Submit">
				</form>
				</td>
				</tr>
		</c:forEach>
	</table> --%>
<div id="wrapper">	
<!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="./">Main</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="./logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="../"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="./flights/list"><i class="fa fa-paper-plane fa-fw"></i> Loads<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="../flights/list">List</a>
                                </li>
                                <li>
                                    <a href="../flights/add">Add Load</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="../users/list"><i class="fa fa-users fa-fw"></i> Users</a>
                        </li>
                        <li>
                            <a href="../parachutes/list"><i class="fa fa-soundcloud fa-fw"></i> Parachutes<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="../parachutes/list">List</a>
                                </li>
                                <li>
                                    <a href="../parachutes/add">Add Parachute</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="../aircrafts/list"><i class="fa fa-plane fa-fw"></i> Aircrafts<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="../aircrafts/list">List</a>
                                </li>
                                <li>
                                    <a href="../aircrafts/add">Add Aircraft</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Loads</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>DATE</th>
											<th>AIRCRAFT</th>
                                            <th></th>
                                            <th></th>
                                            <th></th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${flight}" var="flight" varStatus="i1">
										<tr>
										<td>#</td>
											<td><fmt:formatDate value="${flight.date}" pattern="yyyy-MM-dd HH:mm" /></td>
											<td>${flight.aircraft}</td>
											<td><a href="start/${flight.id}" />Start</td>
											<td><a href="stop/${flight.id}" />Stop</td>
											<td><a href="edit/${flight.id}" />edit</td>
											<td><a href="delete/${flight.id}" />delete</td>
										</tr>
										<c:forEach items="${flight.users}" var="jumper" varStatus="i">
											<tr>
												<td>${i.index }</td>
												<td>${jumper }</td>
												<td>${jumper.jumpsNumber }</td>
											</tr>
										</c:forEach>
														<tr>
														<td></td>
														<td>
											<form method="post">
												<input type="hidden" name="flightId" value="${flight.id}">
												Users: <select name="userId">
													<c:forEach items="${jumpers }" var="jumper">
														<option value="${jumper.id}">${jumper.id}
															${jumper.firstName} ${jumper.lastName}</option>
													</c:forEach>
												</select>
												</td>
												<td>
												<input type="submit" value="Submit">
											</form>
											</td>
											</tr>
									</c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-612 -->
            </div>
        </div>
                <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="../resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="../resources/vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../resources/dist/js/sb-admin-2.js"></script>

</body>
</html>