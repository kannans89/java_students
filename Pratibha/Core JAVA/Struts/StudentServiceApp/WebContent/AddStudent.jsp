<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StudentService</title>
</head>
<body>
<form action="addstudent"><pre><h1>

Name:    <input type="text" name="student.name" value=<s:property value="student.name"/>><br>
Rollno:  <input type="text" name="student.rollno"><br>
Age:     <input type="text" name="student.age"><br>
<input type="submit" value="Add Student">  <a href="displaystudent"><input type="submit" value="Display Records"></a>
</h1></pre></form>
</body>
</html>