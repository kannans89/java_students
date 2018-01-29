<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
<form method="post" action="TrackExercise">
<a href="Logout">Logout</a>     <a href="setGoal">Set Goal</a>
<h1>Hellow <s:property value="#session.name" />

Goal: <s:property value="#session.time" /></h1>
<h2>Track minutes<input type="text" id="addtime" name="addtime" /><select id="excercise" name="excercise"><option>Running</option>
					<option>Jumping</option>
					<option>Weight Lifting</option></select><input type="submit" id="add"
					name="add" value="Add" />
Current Time:<s:property value="#session.timemsg" />

Total Time:<s:property value="#session.totaltime" />

<h2><font color="green"><s:property value="#session.msg" /></font></h2>
</h2>
		</form>
	</pre>
</body>
</html>