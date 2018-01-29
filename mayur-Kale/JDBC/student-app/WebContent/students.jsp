<%@page import="com.techlabs.student.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Students</title>
</head>
<body>
	List of Students:
	<br>
	<br>
	<table>
		<tr>
			<th>Roll No</th>

			<th>Name</th>

			<th>Age</th>
		</tr>
		<%
			List<Student> studentList = (List) request
					.getAttribute("studentList");
			for (Student student : studentList) {
				out.print("<tr>");
				out.print("<td>" + student.getRollNo() + "</td>");
				out.print("<td>" + student.getName() + "</td>");
				out.print("<td>" + student.getAge() + "</td>");
				out.print("</tr>");
			}
		%>

	</table>
</body>
</html>