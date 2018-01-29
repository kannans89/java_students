<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update a Customer</title>
</head>
<body>
	<form action="updateCustomer" method="post">
	<br> Hello,
	<%=session.getAttribute("user")%>
	<br>
	<a href="logout">Logout</a>
	<br>
		<table align="center">
			<tr>
				<td>ID:
				<td><input type="text" name="id"
					value='<s:property value="updateCustDTO.id"/>' disabled="disabled" />
			</tr>
			<tr>
				<td>Name:
				<td><input type="text" name="name"
					value='<s:property value="updateCustDTO.name"/>' />
			</tr>
			<tr>
				<td>Location:
				<td><input type="text" name="location"
					value='<s:property value="updateCustDTO.location"/>' />
			</tr>
			<tr>
				<td colspan="2"><s:submit />
			</tr>
		</table>
	</form>
</body>
</html>