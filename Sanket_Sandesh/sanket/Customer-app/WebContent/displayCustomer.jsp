<%@page import="java.io.PrintWriter"%>
<%@page import="com.techlabs.customer.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.customer.CustomerService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Display</title>
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
</head>
<body align="center" id="main">
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
	<h1>Customers Data</h1>

	<table border="1" class="table">
		<thead class="thead-inverse">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Option</th>
				<th>Option</th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<Customer> customers = (ArrayList<Customer>) request.getAttribute("data");
				if (customers == null)
					customers = new ArrayList<Customer>();

				for (Customer customer : customers) {
			%>
			<tr>
				<td><%=customer.id%></td>
				<td><%=customer.name%></td>
				<td><%=customer.address%></td>
				<td><a href=<%="/Customer-app/editCustomer?id=" + customer.id%>>Edit</a>
				</td>
				<td><a
					href=<%="/Customer-app/deleteCustomer?id=" + customer.id%>>Delete</a>
				</td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>

</body>
</html>