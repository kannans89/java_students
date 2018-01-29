<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="TransactionLogController">Passbook</a><br>
Profile: <img src="<%=session.getAttribute("profile") %>"/><br>
Hellow:  <%=session.getAttribute("name")%><br>
Balance: <%=session.getAttribute("balance") %><br>
<a href="TransactionController"><input type="button" value="Make Transaction"/></a>

</body>
</html>