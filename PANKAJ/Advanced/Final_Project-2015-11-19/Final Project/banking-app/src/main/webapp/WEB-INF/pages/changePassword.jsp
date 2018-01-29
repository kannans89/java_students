<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sb:head />
<script src="scripts/jquery.js"></script>
<script src="scripts/changePasswordValidation.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<div align="center">
		<h2>Change Your Password</h2>
		<div style="width: 30%;">
			<s:if test="hasActionErrors()">
				<s:actionerror theme="bootstrap" />
			</s:if>
			<s:form action="validateChangePassword" method="POST" theme="bootstrap" class="form-horizontal">
				<s:password label="Current Password" name="password" id="password" />
				<s:password label="New Password" name="newPassword" id="newPassword" />
				<s:password label="Re-Enter New Password" id="newPasswordCopy" />
				<div id="messege" style="color: red"></div>
				<s:submit value="Change" id="submit" class="btn btn-success" />
			</s:form>
		</div>
	</div>
</body>
</html>