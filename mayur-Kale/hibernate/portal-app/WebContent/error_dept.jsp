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

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width , initial-scale=1">
<link rel="stylesheet" href="resources/styles/bootstrap.min.css">
<title>Error!</title>
</head>
<body>
	<nav class="navbar navbar-default ">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"> Techlabs Portal </a>
		</div>
		<div id="navbar" class="navbar-collapse collaspse">

			<ul class="nav navbar-nav navbar-left">
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
					aria-expanded="false"> <%=userLogged.getUid()%><span
						class="caret"></span>
				</a>

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

	<br>
	<br>
	<br>
	<center>
		<div class="container">

			<h1>Department already exists!</h1>
			<a href="addDepartment.html">Try again</a>
		</div>
	</center>
	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

</body>
</html>