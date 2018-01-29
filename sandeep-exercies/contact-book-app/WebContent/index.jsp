<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index-student-list</title>
<style type="text/css">
table, th, td {
	padding: 6px;
}

body {
	font-size: 150%;
}

#add {
	font-size: 25px;
	padding: 5px;
	width: 100px;
}
</style>
</head>
<body>
	<center>
		<h3>index of fitness tracker</h3>
		<s:form action="Add" method="post" id="form">
			<s:textfield name="firstName" label="first Name: "></s:textfield>
			<s:textfield name="lastName" label="last Name: "></s:textfield>
			<s:textfield name="mobile" label="mobile No: "></s:textfield>
			<s:textfield name="email" label="email Id: "></s:textfield>
			<s:hidden name="postBack" value="true"></s:hidden>
			<s:submit value="add" id="add"></s:submit>
		</s:form>
	</center>
</body>
</html>