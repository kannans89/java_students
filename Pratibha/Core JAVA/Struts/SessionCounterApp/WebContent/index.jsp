<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="stepCount">
		<s:textfield name="steps" id="steps" label="Enter No of steps "></s:textfield>

		<s:submit value="Add steps"></s:submit>

	</s:form>
	Current :
	<s:property value="#session.currentsteps" />
	<br></br> Total :
	<s:property value="#session.totalsteps" />
	Goal :
	<s:property value="GOAL" />
	<br></br>
	<h1><span style="background-color: #FFFFcc"><s:property value="message" /></span></h1>
	
	<br></br>
</body>
</html>