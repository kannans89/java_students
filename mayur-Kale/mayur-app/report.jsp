<%
String bgColor,name,age;
if(request.getCookies()!=null){
name =((request.getCookies())[0]).getValue();
age = ((request.getCookies())[1]).getValue();
bgColor = ((request.getCookies())[2]).getValue();

}else
bgColor=name=age=null;
%>


<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="bootstrap.css">
</head>
<body class="container-fluid">
<br>
<section class="jumbotron">
<h3>Session</h3>
<%
out.println("<br>Session id:"+session.getId()+"<br>");
out.println("Counter :"+session.getAttribute("counter")+"");
%>
</section>
<hr>
<section class="jumbotron">
<h3>Application</h3>

<%
out.println("<br>Counter :"+application.getAttribute("counter")+"");

%>
</section>
<hr>
<section class="jumbotron" style="background:<%= bgColor %>">
<h3>Cookies</h3>
	<h4>Name:<%= name %></h4>
	<h4>Age:<%= age %></h4>

</section>

</body>
</html>