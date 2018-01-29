<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Health Tracker</title>
</head>
<body>
	<s:form action="checkhealth" method="post">
		<s:textfield label="Enter No. of steps" name="steps"></s:textfield>
		<s:submit></s:submit>
	</s:form>

	current steps:
	<s:property value="steps" /><br>
	Total steps:
	<s:property value="totalSteps" /><br>
	Goal:10,000 steps<br>
	<s:if test="totalSteps>=10000">
	Goal Achieved
	</s:if>
</body>
</html>