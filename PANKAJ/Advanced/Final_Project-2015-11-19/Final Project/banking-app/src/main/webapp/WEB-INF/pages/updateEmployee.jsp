<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head includeScripts="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Update Profile</h2>
		<br>
		<s:form action="updateEmployee" method="POST" style="width:30%" theme="bootstrap" class="form-horizontal">
			<s:hidden name="id" />
			<s:textfield label="Email ID" name="contact.email" />
			<s:textfield label="Mobile No." name="contact.mobile" />
			<s:textfield label="Qualification" name="qualification" />
			<s:textfield label="Department" name="department" />
			<s:submit value="Update" class="btn btn-default" />
		</s:form>
	</div>
</body>
</html>