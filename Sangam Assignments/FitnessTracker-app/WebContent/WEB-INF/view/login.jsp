<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<h1 align="center">Login Page</h1>
	<form method="post" action="Login">
	<div style="text-align:center">
		Enter UserName: <input type="text" name="userName"> <br>
		<br> Enter Password: <input type="password" name="password"><br>
		<br> <input type="submit" value="Login">
	</div>
	</form>
	<%	if(session.getAttribute("AuthenticationError")!=null)	
		out.println("<br>"+session.getAttribute("AuthenticationError")); %>
</body>
</html>