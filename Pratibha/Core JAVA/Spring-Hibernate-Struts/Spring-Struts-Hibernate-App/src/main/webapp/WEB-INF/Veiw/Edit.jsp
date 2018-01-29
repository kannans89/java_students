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

	<s:form action="edit">
		<pre>
			
First Name:    <input type="text" name="stud.firstname"
					value="<s:property value='stud.firstname' />">
Last Name:  <input type="text" name="stud.lastname"
					value="<s:property value='stud.lastname'/>">
Id:     <input type="text" name="stud.id"
					value="<s:property value='stud.id'/>">
<input type="submit" value="Edit Student">  <a href="display"><input
					type="submit" value="Back"></a>

		</pre>
	</s:form>


</body>
</html>