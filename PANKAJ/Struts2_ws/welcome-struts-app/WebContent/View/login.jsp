<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script src="jquery.js"></script>
	<script src="loginValidation.js"></script>
	<s:form action="welcome">
		<p>
			<s:textfield label="Enter Name" name="userName" id="userName"></s:textfield>
			<s:password label="Enter Password" name="password" id="password"></s:password>
		</p>
		<div id="prompt" class="notification"></div>
		<s:submit value="Login" id="submit"></s:submit>
	</s:form>
</body>
</html>