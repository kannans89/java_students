<%@ page language="java"
import="com.techlabs.model.Employee"
 contentType="text/html; charset=ISO-8859-1" 
      pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>view</h1>
<%
Employee emp=(Employee)request.getAttribute("employees");
out.println(emp.getId());
out.println(emp.getName());
%>
</body>
</html>