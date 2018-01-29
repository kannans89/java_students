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

<s:form action="editstudent"><pre><h1>
<input type="hidden"  name="id" value="<s:property value='id' />"/><br>
<s:hidden  name="postBack" value="true"/><br>

Name:    <input type="text" name="student.name" value="<s:property value='student.name' />">
Rollno:  <input type="text" name="student.rollno" value="<s:property value='student.rollno'/>">
Age:     <input type="text" name="student.age" value="<s:property value='student.age' />">
<input type="submit" value="Edit Student">  <a href="displaystudent"><input type="submit" value="Back"></a>
</h1></pre></s:form>

</body>
</html>