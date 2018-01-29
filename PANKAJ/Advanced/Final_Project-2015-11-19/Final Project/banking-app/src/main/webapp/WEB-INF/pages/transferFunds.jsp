<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="scripts/jquery.js">
	
</script>
<script src="scripts/transferFundsValidation.js"></script>
<sb:head includeScripts="true" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer Funds</title>
</head>
<body>
	<div align="center">
		<%@ include file="customerNavigationBar.jsp"%>
		<h2>Transfer Funds</h2>
		<div style="width: 30%;">
			<s:if test="hasActionErrors()">
				<div style="color: red;">
					<s:actionerror />
				</div>
			</s:if>
			<s:form action="transferFunds" method="POST" theme="bootstrap" class="form-horizontal">
				<s:select label="Select Account" headerKey="-1" headerValue="Select Account" list="accounts" name="fromAccount"
					id="fromAccount" />
				<s:select label="Select Payee" headerKey="-1" headerValue="Select Payee" list="payees" name="toAccount"
					id="toAccount" />
				<s:textfield label="Amount" name="amount" id="amount" />
				<div id="messege"></div>
				<s:submit class="btn btn-primary" />
			</s:form>
		</div>
	</div>
</body>
</html>