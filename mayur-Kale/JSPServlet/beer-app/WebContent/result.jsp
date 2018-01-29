<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
<%
List<String> styles = (List) request.getAttribute("styles");
for(String string : styles){
	out.print("<br>Try: " + string);
}
%>
</body>
</html>