<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer Funds</title>
</head>
<body>
	<div align="center">
		<%@ include file="customerNavigationBar.jsp"%>
		<h2>Transfer Funds</h2>
		<s:form action="transferFunds" method="POST" class="form-horizontal">
			<s:select label="Select Account" headerKey="-1" headerValue="Select Account" list="accounts" name="fromAccount" />
			<s:select label="Select Payee" headerKey="-1" headerValue="Select Payee" list="payees" name="toAccount" />
			<s:textfield label="Amount" name="amount" />
			<s:submit class="btn btn-default"/>
		</s:form>
	</div>
</body>
</html>