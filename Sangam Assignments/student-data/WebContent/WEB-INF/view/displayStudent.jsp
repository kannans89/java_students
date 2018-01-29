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
	<tr>
		<th>Roll No</th><th>Name</th><th>Age</th><th>Edit</th><th>Delete</th>
	</tr>
	<s:iterator value="studMap" var="studElement">
	<s:set  var="studKey" value="#studElement.key"></s:set>
	<s:set  var="studValue" value="#studElement.value"></s:set>
	<tr>
			<td><s:property value="#studKey"></s:property><br></td>
			<td><s:property value="#studValue.name"></s:property><br></td>
			<td><s:property value="#studValue.age"></s:property><br></td>
			<td><a href="editAction?rollNo=${studKey}">Edit</a></td>
			<td><a href="deleteAction?rollNo=${studKey}">Delete</a></td>
	</tr>
	</s:iterator>
	</table>
	
	</body>
</html>