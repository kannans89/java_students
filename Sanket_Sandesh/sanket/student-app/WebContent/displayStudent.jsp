<%@page import="com.techlabs.service.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Details</title>
</head>
<body>
	<h1>Customers Data</h1>

	<table border="1">
		<thead>
			<td>ID</td>
			<td>Name</td>
			<td>Address</td>
		</thead>
		<tbody>
			<%
			ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("data");
			if(students == null)
				students = new ArrayList<Student>();
			
				for(Student student : students) {
					%>
					<tr>
						<td>
							<%=student.getId()%>
						</td>
						<td>
							<%=student.getName()%>
						</td>
						<td>
							<%=student.getAddress()%>
						</td>
						<td>
							<a href=<%="/student-app/EditStudent?id=" + student.id%> >Edit</a>
						</td>
						<td>
							<a href=<%="/student-app/DeleteStudent?id=" + student.id%> >Delete</a>
						</td>
					</tr>
			<% } %>

		</tbody>
	</table>
	
</body>
</html>