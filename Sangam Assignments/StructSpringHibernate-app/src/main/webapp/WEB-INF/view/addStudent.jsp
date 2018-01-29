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
<s:form action="Add">
<s:hidden name="postBack" value="true"></s:hidden>
<s:textfield name = "rollNo" label = "Roll No"></s:textfield>
<s:textfield name = "name" label = "Name"></s:textfield>
<s:submit value = "Add"></s:submit>
</s:form>
<a href="display">Display</a>
</body>
</html>