<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="SetGoal">
	<b>Set Exercise goal in minutes :</b>
	<input type="text" name="minitues" placeholder="Enter minitues here">
	<input type="submit" value="Done">
	<a href="Logout">Logout</a>
	<% out.println("<br> Current user : "+session.getAttribute("CurrentUser")); %>
</form>
</body>
</html>