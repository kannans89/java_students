<html>
<head><title>Welcome JSP Page</title></head>
<body><h1>
<%
String candidate= request.getParameter("name") ;
if(candidate==null)
candidate="Pratibha";
for(int i=0;i<10;i++){
%><br><%
out.println(candidate);
}
  %><h1
</body>
</html>