<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.errorMessage {
  font-weight: bold;
  color: red;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddContact</title>
</head>
<body>

<s:form  action="add" >
 <s:actionerror/><br>
  <s:textfield name="cont.firstName" label="First Name" />
  <s:textfield name="cont.lastName" label="Last Name"/>
<s:textfield name="cont.address" label="Address" />
  <s:textfield name="cont.mobile" label="Contact"/>
  <s:submit />
</s:form>
</body>
</html>