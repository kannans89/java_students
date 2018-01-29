<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>Contact Id</th><th>First Name</th><th>Last Name</th><th>Mob No</th><th>E-mail Id</th></tr>
<s:iterator value="personList">
<tr>
	<td><s:property value="contactId"/></td>
	<td><s:property value="firstName"/></td>
	<td><s:property value="lastName"/></td>
	<td><s:property value="mobNo"/></td>
	<td><s:property value="emailId"/></td>
</tr>
</s:iterator>
</table>
</body>
</html>