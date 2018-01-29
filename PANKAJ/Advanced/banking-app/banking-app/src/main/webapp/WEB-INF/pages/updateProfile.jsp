<%@page import="com.techlabs.action.form.UserType"%>
<%@page import="com.techlabs.action.form.LoginForm"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Profile</title>
</head>
<body>
	<%
		LoginForm loginDetails = (LoginForm) session.getAttribute("user");
		if (loginDetails.getUserType() == UserType.CUSTOMER) {
	%>
	<%@ include file="customerNavigationBar.jsp"%>
	<s:form action="updateProfile" method="POST">
		<s:textfield label="Email ID" name="email" />
		<s:textfield label="Mobile No." name="mobile" />
		<s:textfield label="Occupation" name="occupation" />
		<s:submit value="Update" />
	</s:form>
	<%
		}
		if (loginDetails.getUserType() == UserType.EMPLOYEE) {
	%>
	<%@ include file="employeeNavigationBar.jsp"%>
	<s:form action="updateProfile" method="POST">
		<s:textfield label="Email ID" name="email" />
		<s:textfield label="Mobile No." name="mobile" />
		<s:textfield label="Qualification" name="qualification" />
		<s:textfield label="Department" name="department" />
		<s:textfield label="Address" name="address" />
		<s:submit value="Update" />
	</s:form>
	<%
		}
	%>
</body>
</html>