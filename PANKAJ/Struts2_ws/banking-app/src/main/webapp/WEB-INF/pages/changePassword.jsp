<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="scripts/jquery.js"></script>
<script src="scripts/changePasswordValidation.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<div align="center">
		<h2>Change Your Password</h2>
		<s:form action="validateChangePassword" method="POST">
			<s:password label="Enter Current Password" name="password" id="password" />
			<s:password label="Enter New Password" name="newPassword" id="newPassword" />
			<s:password label="Re-Enter New Password" name="newPasswordCopy" id="newPasswordCopy" />
			<div id="messege" style="color: red"></div>
			<s:submit value="Change" id="submit" />
		</s:form>
	</div>
</body>
</html>