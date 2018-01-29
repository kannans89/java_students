<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers</title>
</head>
<body>
	<a href="addCustomer">Add a customer</a>
	<table border="1" align="center" cellspacing="10" cellpadding="5">
		<caption>Customer Details</caption>
		<tr>
			<th>ID
			<th>Name
			<th>Location
			<th colspan="2">Functions
		</tr>
		<s:iterator value="customers">
			<tr>
				<td><s:property value="id" />
				<td><s:property value="name" />
				<td><s:property value="location" />
				<td><a href="deleteCustomer?id=<s:property value="id"/>">Delete</a>
				<td><a href="updateCustomer?id=<s:property value="id"/>">Update</a>
			</tr>
		</s:iterator>
	</table>
</body>
</html>