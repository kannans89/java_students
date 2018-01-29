<%@page import="com.techlabs.entity.User"%>
<%@page import="com.techlabs.services.DepartmentService"%>
<%@page import="com.techlabs.entity.Department"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	User userLogged = null;
	String isVisbile=null;
	if (request.getSession().getAttribute("userLogged") != null) {
		userLogged = (User) request.getSession().getAttribute(
				"userLogged");
		if(userLogged.getRole().equals("admin")) 
			isVisbile ="visbile";
		else isVisbile ="hidden"; 
	}
%>

<%
	List<Department> deptList = (List<Department>) request
			.getAttribute("deptList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width , initial-scale=1">
<link rel="stylesheet" href="resources/styles/bootstrap.min.css">
<style type="text/css">
.button-active {
color : #000;
text-decoration: underline;
}
</style>
<title>Manage Department</title>
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
						<button type="submit" class="button-active btn  btn-link btn-lg">Manage
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
	<div class="container">
		<form action="ManageDepartmentAdd" method="get" style="visibility:<%=isVisbile%>">
			<button type="submit" class="btn btn-default pull-right btn-lg">
				<span class="glyphicon glyphicon-plus"></span> Add Department
			</button>
		</form>
		<br> <br> <br> <br>
		<center class="panel panel-primary">
			<%
				if (deptList != null) {
			%>
			<div class="panel-heading">
				<h2>List of Departments</h2>
			</div>
			<div class="table-responsive">
				<table class="table table-striped table-hover">
					<tr>
						<th>Department Id</th>
						<th>Department Name</th>
						<th>Department Location</th>
						<th></th>
						<th></th>
					</tr>
					<%
						for (Department department : deptList) {
					%>
					<tr>
						<td><%=department.getDeptId()%></td>
						<td><%=department.getDeptName()%></td>
						<td><%=department.getDeptLocation()%></td>
						
						<td>
							<form style="visibility:<%=isVisbile%>"
								action="ManageDepartmentEdit?deptId=<%=department.getDeptId()%>"
								method="post">
								<button type="submit" class="btn btn-default btn-link">
									Edit <span class="glyphicon glyphicon-pencil"></span></a>
								</button>
							</form>
						</td>
						<td>
							<form style="visibility:<%=isVisbile%>"
								action="ManageDepartmentDelete?deptId=<%=department.getDeptId()%>"
								method="post">
								<button type="submit" class="btn btn-default btn-link">
									Delete <span class="glyphicon glyphicon-trash"></span></a>
								</button>
							</form>
						
						</td>
						
					</tr>
					<%
						}
					%>
				</table>
				<%
					} else {
						out.print("<h3>Sorry , there are no department present right now</h3>");
						out.print("To add department <a href='addDepartment.jsp'>click here</a>");
					}
				%>
			</div>
		</center>
	</div>

	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

</body>
</html>
