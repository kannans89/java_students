<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.techlabs.models.Book"%>
  <%@ page import="java.util.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  name="form" method="post" action="GetbookController">

<table border="1">
<tr><th>ID</th><th>Name</th><th>Address</th><th>Email ID</th><th>Contact</th><th>Gender</th><th>Edit</th><th>Delete</th></tr>
<%
	List<Book> list=(List<Book>)request.getAttribute("list");
for (Book book: list) {
%>
<tr><td><%=book.getISBN()%></td><td><%=book.getTitle()%></td><td><%=book.getImage()%></td>
<td><%=book.getAuthor()%></td><td><%=book.getDescription()%></td><td><%=book.getPrice()%></td>
<td>
<button type="submit" id="<%=book.getISBN() %>"name="edit" value="<%=book.getISBN() %>">Edit</button></td>
<td><button type="submit" id="<%=book.getISBN() %>"name="delete" value="<%=book.getISBN() %>"
 onclick="return confirm('Are you sure you want to delete?')" >Delete</button></td></tr>
<%}%>
<%
String book= request.getParameter("isbn") ;
if(book!=null)
%>
</table>
</form>
</body>
</html> 