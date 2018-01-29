<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>books show</title>
<style type="text/css">
table, th, td {
	border: 2px solid grey;
	padding: 4px;
	border-collapse: collapse;
}

body {
	font-size: 150%;
}
</style>
</head>
<body>
<a href="index.jsp">back to add page</a>
	<center>
		<table>
			<thead>
				<tr>
					<th>contact id</th>
					<th>first Name</th>
					<th>last Name</th>
					<th>mobile</th>
					<th>email</th>
				</tr>
			</thead>
			<s:iterator value="books" status="stats">
				<tr>
					<td><s:property value="contactId" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="mobile" /></td>
					<td><s:property value="email" /></td>
				</tr>

			</s:iterator>


		</table>
	</center>
</body>
</html>