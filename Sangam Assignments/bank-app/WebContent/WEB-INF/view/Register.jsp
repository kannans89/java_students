<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	      $(document).ready(function() {
		$('#name').change(function(event) {
			var username = $('#name').val();
			console.log(username);
			$.get('CheckAvailability', {
				name : username
			}, function(responseText) {
				if (responseText == 'Available')
					$('#divId').text(responseText).css('color', 'green');
				else
					$('#divId').text(responseText).css('color', 'red');
				if ($("#divId").text() != "Available")
					$('#submitButton').disabled = true;
			});
		});
	});
</script>
</head>
<style>
#register{
	text-align: center;
}

.left {
	width: 30%;
	float: left;
	text-align: right;
}

.right {
	width: 65%;
	margin-left: 10px;
	float: left;
}
</style>
<body>
	<form method="post" action="Register">
		<h1 style="text-align: center">Registration Form</h1>
		<div id="register">
			<label class="left">Name :</label><input type="text" name="name"
				id="name" onkeyup="loadXMLDo()" class="right">
			<div id="divId"></div>
			<label class="left">E-mail :</label> <input type="text" name="email"
				class="right"><br> <label class="left">Image
				URL :</label> <input type="text" name="image" class="right"><br>
		</div>
		<div style="margin-top: 20px; text-align: center">
			<input type="submit" value="Submit" id="submitButton"
				style="text-align: center">
		</div>
	</form>
</body>
</html>