<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<h1>Welcome</h1>
	<table border="1">
		<tr>
			<th>FName</th>
			<th>LName</th>
			<th>ID</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="list">
			<tr>
				<td><s:property value="firstname" /></td>
				<td><s:property value="lastname" /></td>
				<td><s:property value="id" /></td>
				<td><s:url var="urlEdit" action="edit">
						<s:param name="editId">
							<s:property value="id" />
						</s:param>
					</s:url> <a href='<s:property value="#urlEdit"/>'><button>Edit</button></a></td>
				<td><s:url var="urlDel" action="delete">
						<s:param name="deleteId">
							<s:property value="id" />
						</s:param>
					</s:url> <a href='<s:property value="#urlDel"/>'><button>Delete</button></a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="addto"><button>Add Student</button></a>
	<br>
</body>
</html>