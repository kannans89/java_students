
<!DOCTYPE html>
<html>
<head>
	<title>Welcome JSP</title>
</head>
<body>
<%
for(int index = 0; index<10;index++){
	out.println("<h1>");
	out.println("Welcome to JSP:"+index);
	out.println("</h1>");

} 
%>
</body>
</html>