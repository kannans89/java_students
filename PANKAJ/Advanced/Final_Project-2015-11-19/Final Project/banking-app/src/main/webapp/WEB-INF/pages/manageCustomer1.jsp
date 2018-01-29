<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head includeScripts="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Account</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Manage Account</h2>
		<div style="width: 30%">
			<s:if test="hasActionErrors()">
				<s:actionerror theme="bootstrap" />
			</s:if>
			<s:form action="populateManageCustomerForm" method="POST" theme="bootstrap" class="form-horizontal">
				<s:textfield label="Account No." name="id" id="id" />
				<s:submit value="Next" class="btn btn-info"/>
			</s:form>
		</div>
	</div>
</body>
</html>