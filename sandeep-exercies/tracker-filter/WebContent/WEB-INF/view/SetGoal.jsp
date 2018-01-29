<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("<h2>Welcome " + session.getAttribute("validUser") + "</h2>");
	%>
	<a href="LogoutController">Logout</a>
	<form method="post" action="setGoal">
		<h1 align="center">Set Exercise Goal:</h1>
		<b>Set exercise time in minutes:</b> <input type="text" name="time"><br>
		<br> <input type="submit" value="Done">
	</form>
	<%
		out.println("<h2>" + session.getAttribute("errorMsg") + "</h2>");
	%>
</body>
</html>