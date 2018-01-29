<%@page import="java.util.ArrayList"%>
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
	<%
		List<Student> studentList = (ArrayList) request
				.getAttribute("studentList");
		for (Student student : studentList) {
			out.println("{ Roll No : " + student.getRollNo() + " ");
			out.println(", Name : " + student.getName() + " ");
			out.println(", Age : " + student.getAge() + " }<br>");
		}
	%>


</body>
</html>