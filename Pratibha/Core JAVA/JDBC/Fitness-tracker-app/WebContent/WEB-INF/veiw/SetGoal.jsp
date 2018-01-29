<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SetGoal">
<h1>Hellow <%=session.getAttribute("user")%></h1>
<h1>Set Excersize Goal In Minutes<input type="text" id="time" name="time" >
<input type="submit" id="done" value="done" name="done" ></h1>
<a href="LogoutController">LogOut</a>
<h2><font color="red"><%if(session.getAttribute("error")!=null){ %><%=session.getAttribute("error")%><%}%></font></h2>
</form>
</body>
</html>