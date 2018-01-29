<!DOCTYPE html>
<html>
<head>
	<title>Session</title>
</head>
<body>
<%
if(session.getAttribute("counter")==null)
{
session.setAttribute("counter",0);
}
out.println("<h2> Old Value:"+session.getAttribute("counter")+"</h2>");
session.setAttribute("counter",Integer.parseInt(session.getAttribute("counter").toString())+1);
out.println("<h2> New Value:"+session.getAttribute("counter")+"</h2>");
out.println("<h3> Session id:"+session.getId()+"</h3>");	
%>
</body>
</html>