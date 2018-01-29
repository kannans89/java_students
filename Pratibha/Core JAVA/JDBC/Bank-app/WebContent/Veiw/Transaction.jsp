<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="TransactionController" method="post">
		<pre>
Amount: <input type="text" name="amount" /><br>
Account Type: <input type="radio" name="transType" value="W">Withdraw    <input
				type="radio" name="transType" value="D">Deposit
<input type="submit" value="Submit">
</pre>
	</form>
</body>
</html>