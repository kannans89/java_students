<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="TrackExercise">
<a href="LogoutController">LogOut</a><a href="http://localhost:8080/Fitness-tracker-app/SetGoal">Set Goal</a>
<%HttpSession session = request.getSession(true);%>
<h1>Hellow <%=session.getAttribute("user")%></h1>
Goal Set:<% int goal=(int)session.getAttribute("time"); int time=0; %><%=goal%>
<h2> Track minutes<input type="text" id="addtime" name="addtime" />
<select id="excercise" name="excercise">
<option>Running</option><option>Jumping</option><option>Weight Lifting</option>
</select><input type="submit" id="add" name="add" onclick="getTime()" value="Add"/>
<h2><%=session.getAttribute("excercise")%>
<h2><%if(session.getAttribute("msg")!=null) %><%=session.getAttribute("msg") %></h2>
</body>
</html>