<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#main {
	background-color: #99ffff;
	border: 2px groove black;
}
#menu {
	background-color:#9AA795;
	border: 2px groove black;
	padding: 2;
}

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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Customer Home</title>
</head>
<body align="center" bgcolor="red" id="main">
	<h1 id="header">Welcome To Dynamic Customer App</h1>

	<ul class="nav nav-pills">
		<li><a href="Login">Login</a></li>
		<li><a href="#">About Us</a></li>
		<li><a href="#">Contact</a></li>
	</ul>
	</nav>
	<div>
		<h2>Here you can do following operations</h2>
		<div style="border: thick;" id="menu">
			<h3>Add Customer Details</h3>
			<h3>Remove Customer Details</h3>
			<h3>Update Customer Details</h3>
			<h3>Display Customer Details</h3>


		</div>
		<h3>
			<marquee>Please Click On Login Button To Go Further</marquee>
		</h3>

	</div>

</body>
</html>