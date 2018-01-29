<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div align="center">
		<%@ include file="customerNavigationBar.jsp"%>
		<h2>Account Details</h2>
		<table style="width: 30%; table-layout: fixed" class="table table-bordered">
			<tr>
				<th>Account No.
				<th>Balance
			</tr>
			<s:iterator value="accounts">
				<tr>
					<td><s:property value="accno" />
					<td><s:property value="balance" />
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>