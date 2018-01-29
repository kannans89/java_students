<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Your Password?</title>
</head>
<body>
	<div align="center">
		<h2>Forgot Password</h2>
		<s:form action="validateForgotPassword" method="POST">
			<s:textfield label="User ID" name="id" />
			<s:select label="User Type" headerKey="-1" headerValue="Select"
				list="#{'EMPLOYEE':'Employee','CUSTOMER':'Customer'}"
				name="userType" />
			<s:textfield label="Mobile No." name="contact.mobile" />
			<s:textfield label="Email ID" name="contact.email" />
			<s:submit />
		</s:form>
	</div>
</body>
</html>