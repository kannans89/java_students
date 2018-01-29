    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page import="java.util.List"%>
     <%@ page import="com.techlabs.bankapp.services.PassbookDto"%>
     <%@ page import="java.io.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Passbook">
<h1 align="center">Passbook Entries</h1>
<h3 style="text-align:center">Welcome <%out.println(session.getAttribute("user")); %></h3>
<table border="1">
<tr>
<th>Transaction Id</th>
<th>Account No</th>
<th>Amount</th>
<th>Transaction Type</th>
<th>Date and Time</th>
</tr>
<c:forEach items="${passbook}" var="passDto">
        <tr>
            <td> <c:out value="${passDto.getTransId()}"/></td>
            <td> <c:out value="${passDto.getAccNo()}"/></td>
            <td> <c:out value="${passDto.getAmount()}"/></td>
            <td> <c:out value="${passDto.getTransactionType()}"/></td>
            <td> <c:out value="${passDto.getTransactionDate()}"/></td>   
        </tr>
    </c:forEach>
</table>

<br>
<input type="submit" value="Download">
</form>
<br>
<a href="Logout"><input type="button" value="Logout"></a>
<a href="Home"><input type="button" value="Back"></a>

</body>
</html>