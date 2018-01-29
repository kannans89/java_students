<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction</title>
</head>
<body>
<h1 align="center">Enter the amount : </h1>
<form method="post" action="Transaction">
<div style="text-align:center">
		<b>Enter amount : </b> <input type="text" name="amount"> <br> <br>
		<input type="radio" name="transaction" value="D"> Deposit<br><br>
  		<input type="radio" name="transaction" value="W"> Withdrawal<br><br>
		<input type="submit" value="Commit">
</div>
	</form>
	<a href="Logout"><input type="button" value="Logout"></a>
	<a href="Home"><input type="button" value="Back"></a>
	
	<%
		out.println("<h2>" + session.getAttribute("result") + "</h2>");
	%>
</body>
</html>