<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST">
<% out.println("Goal set for today is "+session.getAttribute("Goal")+" minitues"); %>
<br><b>Track Minutes :</b><input type="text" id="trackMinitues" name="trackMinitues">
<select id="excercise" name="excercise">
<option>Running</option><option>Jumping</option><option>Weight Lifting</option>
</select>
<input type="submit" value="Add" name="add"> 
<a href="Logout">Logout</a>
<% 
		out.println("<br>Track "+session.getAttribute("trackMin")+" minutes");
	if(session.getAttribute("reachGoal")!=null)
		out.println("<br>"+session.getAttribute("reachGoal"));
	if(session.getAttribute("error")!=null)
		out.println("<br>"+session.getAttribute("error"));
	out.println("<br> Current user : "+session.getAttribute("CurrentUser"));		
%>
</form>
</body>
</html>