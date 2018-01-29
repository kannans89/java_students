<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<title>Summary</title>
</head>
<body><h1>
<%
 //Comment: This would return null for the first time
 Integer counter1= (Integer)application.getAttribute("numberOfVisits");
 Integer counter2= (Integer)session.getAttribute("count");%><br>
 Application Object Value:<%
 out.println(counter1);%><br>Session Object Value<%
 out.println(counter2);
 %>
</h1>
</body>
</html>