<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.techlabs.models.Student"%>
  <%@ page import="java.util.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<form  name="form" method="post" action="GetStudentController">

<table class="table table-hover">
<tr><th>ID</th><th>Name</th><th>Address</th><th>Email ID</th><th>Contact</th><th>Gender</th><th>Edit</th><th>Delete</th></tr>
<%
	List<Student> list=(List<Student>)request.getAttribute("list");
for (Student student: list) {
%>
<tr><td><%=student.getId()%></td><td><%=student.getName()%></td><td><%=student.getAddress()%></td>
<td><%=student.getEmail()%></td><td><%=student.getContact()%></td><td><%=student.getGender()%></td>
<td>
<button type="submit" id="<%=student.getId() %>"name="edit" value="<%=student.getId() %>">Edit</button></td>
<td><button type="submit" id="<%=student.getId() %>"name="delete" value="<%=student.getId() %>"
 onclick="return confirm('Are you sure you want to delete?')" >Delete</button></td></tr>
<%}%>
<%
String student= request.getParameter("id") ;
if(student!=null)
%>
</table>
</form>
</body>
</html> 