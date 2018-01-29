<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Customer Home</title>
</head>

<head>
<style type="text/css">
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

#main {
	background-color: #99ffff;
	border: 2px groove black;
}
</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Customer App Home</title>

</head>
<body align="center" bgcolor="red" id="main">
	<%
		if (session.getAttribute("userName") == null) {
			response.sendRedirect("/Customer-app");
		}
	%>
	<h1 id="header">Welcome To Dynamic Customer App</h1>
	<ul class="nav nav-pills">
		<li><a href="/Customer-app/addCustomer"><span
				class="glyphicon glyphicon-user">Add Customer</a></li>
		<li><a href="/Customer-app/displayCustomer"><span
				class="glyphicon glyphicon-list">Display Customer</a></li>
		<li><a href="/Customer-app/Logout"><span
				class="glyphicon glyphicon-list">Logout</a></li>

	</ul>
	<br>
	<br>
	<br>
	<h2>This Is Home Page of Customer App</h2>
</body>
</html>