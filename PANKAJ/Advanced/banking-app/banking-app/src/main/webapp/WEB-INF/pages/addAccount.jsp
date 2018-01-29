<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Customer Account</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Add a Customer</h2>
		<s:form action="addAccount" method="POST" class="form-horizontal">
			<s:textfield label="Name" name="name" />
			<sx:datetimepicker label="DOB" displayFormat="dd/MMM/yyyy" name="dob" />
			<s:select label="Gender" headerKey="-1" headerValue="Select" list="#{'M':'Male','F':'Female'}" name="gender" />
			<s:select label="Married?" headerKey="-1" headerValue="Select" list="#{'Y':'Yes','N':'No'}" name="isMarried" />
			<s:textfield label="Occupation" name="occupation" />
			<s:textfield label="E-Mail ID" name="contact.email" />
			<s:textfield label="Mobile No." name="contact.mobile" />
			<s:textfield label="City" name="contact.city" />
			<s:textfield label="Pin No." name="contact.pin" />
			<s:textfield label="Address" name="contact.address" />
			<s:submit class="btn btn-default" />
		</s:form>
	</div>
</body>
</html>