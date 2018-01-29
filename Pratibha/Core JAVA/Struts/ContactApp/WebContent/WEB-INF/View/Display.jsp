<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h2>Contact Details</h2>
<s:iterator value="list">
ID : <s:property value="id" /><br>
First Name : <s:property value="firstName" /><br>
Last Name : <s:property value="lastName" /><br>
Address : <s:property value="address" /><br>
Contact : <s:property value="mobile" /><br>
	</s:iterator>

</body>


</html>
