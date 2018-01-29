
<!DOCTYPE html>
<%@page import="com.techlabs.entity.User"%>
<% 
	User userLogged = null;
	if(request.getSession().getAttribute("userLogged")!=null)
	{
	userLogged = (User) request.getSession().getAttribute("userLogged");
	}
	%>

<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width , initial-scale=1">
<link rel="stylesheet" href="resources/styles/bootstrap.min.css">
<title>Add Department</title>
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
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h1>Department Details</h1>
			</div>
			<div class="panel-body">
				<form action="ManageDepartmentAdd" method="post"
					id="addDepartmentForm">
					<div class="form-group">
						<label for="deptid">Department Id</label> <br> <input
							type="number" name="deptid" class="form-group" id="deptid"
							placeholder="Department Id"> <span id="errorId"
							style="color: red;"></span>
					</div>
					<div class="form-group">
						<label for="deptname">Department Name</label> <br> <input
							type="text" name="deptname" class="form-group" id="deptname"
							placeholder="Department Name"> <span id="errorName"
							style="color: red;"></span>
					</div>
					<div class="form-group">
						<label for="deptlocation">Department Location</label> <br> <input
							type="text" name="deptlocation" class="form-group"
							id="deptlocation" placeholder="Department Location"> <span
							id="errorLocation" style="color: red;"></span>
					</div>
					<div class="form-group">
						<center>
							<button type="submit" class="btn btn-success btn-lg" id="submit">Add
								Department</button>
						</center>
					</div>
				</form>
			</div>
		</div>
	</div>



	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/AddDeptScript.js"></script>
</body>
</html>