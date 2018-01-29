<%@page import="com.techlabs.action.form.UserType"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="scripts/jquery.js"></script>
<script src="scripts/loginvalidation.js"></script>
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<div align="center">
		<h2>Banking Application Login</h2>
		<s:form action="validatelogin" method="post" class="form-horizontal">
			<s:textfield label="User ID" name="id" id="id" />
			<s:password label="Password" name="password" id="password" />
			<s:select label="User Type" headerKey="-1" headerValue="Select" list="#{'EMPLOYEE':'Employee','CUSTOMER':'Customer'}"
				name="userType" id="userType" />
			<div id="messege" style="color: red"></div>
			<s:submit value="Login" id="login" class="btn btn-default" />
		</s:form>
		<a href="forgotPassword">Forgot Password?</a>
	</div>
</body>
</html>