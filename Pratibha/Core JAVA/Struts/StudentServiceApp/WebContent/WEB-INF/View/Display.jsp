<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table{
color:blue
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<table border="1" cellpadding="20">
	<tr>
			<th >Name</th>
		<th>RollNo</th>
		<th>Age</th>
<th>Edit</th>
<th>Delete</th>

		</tr>
	
	<br><%int i=0;%>
	<s:iterator value="list">
			<td><s:property value="name" /></td>
			<td><s:property value="rollno" /></td>
			<td><s:property value="age" /></td>
			<td><a href="edit?id=<%=i%>"><input type="button" name="edit" value="Edit"></a></td>
			<td><a href="deletestudent?id=<%=i%>" value="<s:property value='rollno' />"><input type="button" value="Delete"/></a></td>
		</tr><%i=i+1;%>
		<br>
	</s:iterator>
</table>
<a href=""><input type="button" value="Add Student"></a>

</body>
</html>