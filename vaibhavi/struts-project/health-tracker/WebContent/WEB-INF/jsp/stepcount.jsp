<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>step count</title>
</head>
<body>
<s:form action="stepcount" method="post">
<s:textfield label="enter steps:" name="steps" id="steps"></s:textfield>
<s:submit ></s:submit>
</s:form>
current steps:
	<s:property value="steps" /><br>
	Total steps:
	<s:property value="totalSteps" /><br>
	Goal:10 k steps<br>
	<s:if test="totalSteps>=10000">
	congratulations...
	</s:if>

</body>
</html>