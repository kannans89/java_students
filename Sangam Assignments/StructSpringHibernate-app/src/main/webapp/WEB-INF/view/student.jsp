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
<h1>Student data</h1>
<table border="1">
<tr>
<th>Student Id</th>
<th>Name</th>
<th>Roll No</th>
<th>Edit</th>
<th>Delete</th>
</tr>
	<s:iterator value="studentList">
	<tr>
		<td><s:property value="id"></s:property></td>
		<td><s:property value="name"></s:property></td>
		<td><s:property value="rollNo"></s:property></td>
		<td><s:url var="urlEdit" action="editAction">
		<s:param name="editData">
		<s:property value="id"></s:property>
		</s:param></s:url>
		<a href="<s:property value="urlEdit" />">Edit</a></td>
		<td><s:url var="urlDelete" action="deleteAction">
		<s:param name="deleteData">
		<s:property value="id"></s:property>
		</s:param></s:url>
		<a href="<s:property value="urlDelete"/>">Delete</a></td>
	</tr>
	</s:iterator>
</table>
</body>
</html>