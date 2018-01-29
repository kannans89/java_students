<!DOCTYPE html>
<html>
<head>
	<title>Application</title>
</head>
<body>
<%
if(application.getAttribute("counter")==null){
	application.setAttribute("counter",0);
}
out.println("<h1> Old Value:"+application.getAttribute("counter")+"</h1>");
application.setAttribute("counter",Integer.parseInt(application.getAttribute("counter").toString())+1);
out.println("<h1> New Value:"+application.getAttribute("counter")+"</h1>");


%>
</body>
</html>