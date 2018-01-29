<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Account</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Manage Account</h2>
		<s:form action="manageCustomer" method="POST">
			<s:textfield label="User ID" name="id" />
			<s:select label="Select Action"
				list="#{'D':'Deposit','W':'Withdraw'}" />
			<s:textfield label="Amount" name="custForm.amount" />
			<s:submit label="Update Account" />
		</s:form>
	</div>
</body>
</html>