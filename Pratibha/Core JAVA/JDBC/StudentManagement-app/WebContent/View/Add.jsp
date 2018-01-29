<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<form method="post" action="AddController">
Name:        <input type="text" name="name" /><br>          
Email:       <input type="text" name="email" /><br>
Gender      <input type="radio" name="gender" value="Male">Male
            <input type="radio" name="gender" value="Female">Female<br>
Address        <input type="text" name="address" /><br><br>
Contact: <input type="text" name="contact" /><br>
<input type="submit" value="Add Student" />  
</form></pre>
<div id="div1"></div>
</body>
</html>