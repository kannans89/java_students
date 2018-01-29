<!DOCTYPE html>
<html>
<head>
	<title>Cookies</title>
</head>
<body>
<%
Cookie name = new Cookie("name","mayur");
Cookie age = new Cookie("age","21");
Cookie color = new Cookie("color","red");

name.setMaxAge(60*60*24);
age.setMaxAge(60*60*24);
color.setMaxAge(60*60*24);

response.addCookie(name);
response.addCookie(age);
response.addCookie(color);

   Cookie[] cookies = null;
   cookies = request.getCookies();
   if(cookies!=null){
   out.println("<h1>Name:"+cookies[0].getValue()+"</h1>");
   out.println("<h1>Age:"+cookies[1].getValue()+"</h1>");
   out.println("<h1>Color:"+cookies[2].getValue()+"</h1>");
}
%>
</body>
</html>