<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP tutorial</title>
</head>
<body>
	<%= "Hello World - JSP!" %>
	
	<form method="post" action="Demo">
	<input type="text" name="username"/>
	<input type="password" name="password"/>
	<input type="submit" value="submit" >
	</form>
	<br><br>
	<a href="Demo">GoTo Servlet</a>
</body>
</html>