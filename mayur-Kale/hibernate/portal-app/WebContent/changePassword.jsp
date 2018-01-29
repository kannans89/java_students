<!DOCTYPE html>
<%@page import="com.techlabs.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% 
	User userLogged = null;
	if(request.getSession().getAttribute("userLogged")!=null)
		{
	userLogged = (User) request.getSession().getAttribute("userLogged");
	}
	%>

<html>

<head>
<meta name="viewport" content="width=device-width , initial-scale=1">
<link rel="stylesheet" href="resources/styles/bootstrap.min.css">
<title>Change Password</title>
</head>
<style type="text/css">
.main {
	margin-top: 70px;
}

.main-login {
	background-color: #fff;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}

.main-center {
	margin-top: 30px;
	margin: 0 auto;
	max-width: 330px;
	padding: 40px 40px;
}
</style>

<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"> Techlabs Portal </a>
			</div>
			<div id="navbar" class="navbar-collapse collaspse">

				<ul class="nav navbar-nav navbar-left ">
					<li class="active"><form action="Home" method="get">
							<button type="submit" class="btn btn-link btn-lg active">Home</button>
						</form></li>
					<li><form action="ManageEmployeeView" method="get">
							<button type="submit" class="btn  btn-link btn-lg">Manage
								Employee</button>
						</form></li>
					<li><form action="ManageDepartmentView" method="get">
							<button type="submit" class="btn  btn-link btn-lg">Manage
								Department</button>
						</form></li>

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false"><%=userLogged.getUid()%><span
							class="caret"></span> </a>

						<ul class="dropdown-menu">
							<li><form action="ChangePassword" method="get">
									<button type="submit" class="btn  btn-link btn-lg">Change
										Password</button>
								</form></li>
							<li><form action="Logout" method="post">
									<button type="submit" class="btn  btn-link btn-lg">Logout</button>
								</form></li>

						</ul></li>
				</ul>

			</div>
		</div>
	</nav>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Change Password</h1>
					<hr style="width: 10%;" />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" id="submit" action="ChangePassword"
					method="post">
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-lock" aria-hidden="true"></span></span> <input
									type="password" class="form-control" name="oldpass"
									id="oldpass" placeholder="Enter Old Password" />
							</div>
							<span id="alertOld" style="color: red;"></span>
						</div>
					</div>
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-lock" aria-hidden="true"></span></span> <input
									type="password" class="form-control" name="newpass"
									id="newpass" placeholder="Enter New password" />
							</div>
							<span id="alertNew" style="color: red;"></span>
						</div>

					</div>
					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Update</button>
					</div>
			</div>
			</form>
		</div>
	</div>
	</div>
	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="resources/js/changePasswordScript.js"></script>
</body>

</html>
