<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change user status</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Change User Account Status</h2>
		<s:form action="changeStatus" method="POST" class="form-horizontal">
			<s:textfield label="User ID" name="id" />
			<s:select label="User Type" list="#{'CUSTOMER':'Customer','EMPLOYEE':'Employee'}" name="userType" />
			<s:select label="Status" list="#{'A':'Activate','I':'De-Activate','L':'Lock Account' }" name="status" />
			<s:submit class="btn btn-default" />
		</s:form>
	</div>
</body>
</html>