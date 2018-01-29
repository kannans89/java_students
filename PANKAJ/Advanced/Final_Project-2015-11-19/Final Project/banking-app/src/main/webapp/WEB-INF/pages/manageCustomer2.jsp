<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="scripts/jquery.js"></script>
<script src="scripts/manageAccount.js"></script>
<sb:head includeScripts="true" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Account</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Manage Account</h2>
		<s:form action="manageCustomer" method="POST" style="width:30%" theme="bootstrap" class="form-horizontal">
			<s:textfield label="Account No." name="id" id="id" readonly="true" />
			<s:textfield label="Balance" name="balance" id="balance" readonly="true" />
			<s:select label="Action" list="#{'D':'Deposit','W':'Withdraw'}" id="action" headerKey="-1" headerValue="Select" />
			<s:textfield label="Amount" id="amount" />
			<s:submit value="Update Account" id="submit" class="btn btn-success" />
		</s:form>
		<div id="messege"></div>
	</div>
</body>
</html>