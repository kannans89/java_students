<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
if(request.getSession().getAttribute("userLogged")!=null)
{
response.sendRedirect("Home");
}
%>
<html>
<head>
<meta name="viewport" content="width=device-width , initial-scale=1">
<link rel="stylesheet" href="resources/styles/bootstrap.min.css">
<title>Login</title>
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
	<nav class="navbar navbar-default navbar-fixed-top ">
	<div class="container-fluid">
		<div class="navbar-header navbar-brand">Techlabs Portal</div>
	</div>
	</nav>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Login Portal</h1>
					<hr style="width: 10%;" />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" id="submit" action="authenticate"
					method="post">
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-user" aria-hidden="true"></span></span> <input
									type="text" class="form-control" name="uid" id="uid"
									placeholder="Enter User Id" />
							</div>
							<span id="alertId" style="color: red;"></span>
						</div>
					</div>
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-lock" aria-hidden="true"></span></span> <input
									type="password" class="form-control" name="password"
									id="password" placeholder="Enter password" />
							</div>
							<span id="alertpwd" style="color: red;"></span>
						</div>

					</div>
					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Login</button>
					</div>
			</div>
			</form>
		</div>
	</div>
	</div>
	<script src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/loginScript.js"></script>
</body>

</html>

