<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href=star.css type="text/css"></link>
</head>
<body>
	<script src="jquery.js"></script>
	<script src="validation.js"></script>
	<s:form>
		<p>
			Enter name:
			<s:textfield name="yourName" id="yourName"></s:textfield>
		</p>
		<div id="star" class="star"></div>
		<s:submit value="Wish" id="submit"></s:submit>
	</s:form>
	<s:property value="messege" />
</body>
</html>