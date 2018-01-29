<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<s:form action="login">
<s:textfield label="Enter Username:" name="userName" id="userName"></s:textfield>

<s:textfield label="Enter password:" name="password" id="password"></s:textfield>
<s:submit value="login"></s:submit>
</s:form>

</body>
</html>