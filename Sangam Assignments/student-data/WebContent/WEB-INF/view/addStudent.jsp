<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Student</h1>
<s:form action="addAction">
<s:hidden name="postBack" value="true"></s:hidden>
<s:textfield name = "rollNo" label = "Roll No"></s:textfield>
<s:textfield name = "name" label = "Name"></s:textfield>
<s:textfield name = "age" label = "Age"></s:textfield>
<s:submit name = "submit" value = "Add"></s:submit>
</s:form>
</body>
</html>