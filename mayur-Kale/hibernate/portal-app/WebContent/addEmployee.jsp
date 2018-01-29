<%@page import="com.techlabs.entity.User"%>
<%@page import="com.techlabs.services.DepartmentService"%>
<%@page import="com.techlabs.entity.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.techlabs.services.EmployeeService"%>
<%@page import="com.techlabs.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	User userLogged = null;
	if (request.getSession().getAttribute("userLogged") != null) {
		userLogged = (User) request.getSession().getAttribute(
				"userLogged");
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
<title>Add Employee</title>
<style type="text/css">
.button-active {
color : #000;
text-decoration: underline;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
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
						<button type="submit" class="button-active btn  btn-link btn-lg">Manage
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

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h1>Employee Details</h1>
			</div>
			<div class="panel-body">
				<form action="ManageEmployeeAdd" method="post" id="addEmployeeForm">
					<div class="form-group">
						<label for="empid">Employee Id</label> <br> <input
							type="number" name="empid" class="form-group" id="empid"
							placeholder="Employee Id"> <span id="errorId"
							style="color: red;"></span>
					</div>
					<div class="form-group">
						<label for="empname">Employee Name</label> <br> <input
							type="text" name="empname" class="form-group" id="empname"
							placeholder="Employeee Name"> <span id="errorName"
							style="color: red;"></span>
					</div>
					<div class="form-group">
						<label for="empDeptNo">Department Name</label> <br> <select
							id="empDeptNo" name="empDeptNo">
							<%
								if (deptList != null) {
									for (Department department : deptList) {
							%>
							<option value="<%=department.getDeptId()%>"><%=department.getDeptName()%></option>
							<%
								}
								} else {
							%>
							<option value="100">100</option>
							<%
								}
							%>
						</select> <span id="errorLocation" style="color: red;"></span>
					</div>
					<div class="form-group">
						<center>
							<button type="submit" class="btn btn-success btn-lg" id="submit">Add
								Employee</button>
						</center>
					</div>
				</form>
			</div>
		</div>
	</div>



	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/AddEmpScript.js"></script>
</body>
</html>