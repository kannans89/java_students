<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>

<script>
	$(document).ready(function() {
		$('#name').change(function(event) {
			var username = $('#name').val();
			console.log(username);
			$.get('CheckAvailability', {
				name : username
			}, function(responseText) {
				$('#div1').text(responseText);
				console.log($("#div1").text());
				if ($("#div1").text() == "Available")
					$('#div1').class("greenClass");
			});
		});
	});
</script>
<style>
.redClass {
color: green;
}
.greenClass {
color: red;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="RegisterController">
		<pre>
<%
	if (request.getAttribute("status") != null) {
%><%=request.getAttribute("status")%>
			<%
				}
			%><br>
Name:  <input type="text" name="name" id="name"><br>
Email: <input type="text" name="email" id="email"><br>
Profile:<input type="file" name="profile" id="profile" accept="image/*"><br>
		<div id="div1" class="redClass"></div>

       <button type="submit" value="Register" id="btn">Register</button>
       </pre>
	</form>
</body>
</html>