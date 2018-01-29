<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.techlabs.models.Book"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
<form method="post" action="EditController">

ISBN: <input type="number" name="isbn" value="<%=request.getAttribute("isbn")%>">
Title:        <input type="text" name="title" value="<%=request.getAttribute("title")%>"/><br>          
Image:       <input type="text" name="image" value="<%=request.getAttribute("image")%>"/><br>
Author:       <input type="text" name="author" value=<%=request.getAttribute("author")%> />
Description:      <input type="text" name="description" value="<%=request.getAttribute("description")%>"/><br><br>
Price:     <input type="number" name="price" value="<%=request.getAttribute("price")%>" /><br>
<input type="submit" name="Save" value="Save Changes"></td></tr>

</form></pre>
<div id="div1"></div>
</body>
</html>