<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="scripts/bootstrap-datetimepicker.css" rel="stylesheet">
<script src="scripts/jquery.js"></script>
<script src="scripts/addAccountValidation.js"></script>
<script src="scripts/bootstrap-datetimepicker.js"></script>
<script>
	$(function() {
		$("#dob").datetimepicker({
			format : "mm/dd/yyyy",
			minView : 2,
			startView : 4,
			autoclose : true
		});
	});
</script>
<sx:head />
<sb:head includeScripts="true" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Customer Account</title>
</head>
<body>
	<div align="center">
		<%@ include file="employeeNavigationBar.jsp"%>
		<h2>Add a Customer</h2>
		<div style="width: 30%;">
			<s:if test="hasActionErrors()">
				<s:actionerror theme="bootstrap" />
			</s:if>
			<s:div id="messege" style="color:red"></s:div>
			<s:form action="addAccount" method="POST" theme="bootstrap" class="form-horizontal">
				<s:textfield label="Name" name="name" id="name" />
				<s:textfield label="DOB" name="dob" id="dob" placeholder="mm/dd/yyyy" />
				<s:select label="Gender" headerKey="-1" headerValue="Select" list="#{'M':'Male','F':'Female'}" name="gender"
					id="gender" />
				<s:select label="Married?" headerKey="-1" headerValue="Select" list="#{'Y':'Yes','N':'No'}" name="isMarried"
					id="isMarried" />
				<s:textfield label="Occupation" name="occupation" id="occupation" />
				<s:textfield label="E-Mail ID" name="contact.email" id="email" />
				<s:textfield label="Mobile No." name="contact.mobile" id="mobile" />
				<s:textfield label="City" name="contact.city" id="city" />
				<s:textfield label="Pin No." name="contact.pin" id="pin" />
				<s:textfield label="Address" name="contact.address" id="address" />
				<s:submit id="submit" class="btn btn-primary" />
			</s:form>
		</div>
	</div>
</body>
</html>