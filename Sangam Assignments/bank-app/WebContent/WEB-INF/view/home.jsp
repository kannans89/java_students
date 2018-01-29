<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h2 style="text-align:center">Welcome <%out.println(session.getAttribute("user")); %></h2>
	<div style="text-align:center">
	<img src="${image}" alt="Image" width="150" height="150"><br><br>
	<a href="Passbook"><input type="button" value="Passbook"></a><br><br>
	<a href="Transaction"><input type="button" value="Transaction"></a><br><br>
	<a href="Balance"><input type="button" value="View Balance"></a><br><br>
	<a href="Logout"><input type="button" value="Logout"></a>
	</div>
</body>
</html>