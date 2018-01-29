<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h2>Contact Details</h2>
<s:iterator value="list"><br>
ID : <s:property value="cont.id" /><br>
First Name : <s:property value="cont.firstName" /><br>
Last Name : <s:property value="cont.lastName" /><br>
Address : <s:property value="cont.address" /><br>
Contact : <s:property value="cont.mobile" /><br>
	</s:iterator>

</body>


</html>
