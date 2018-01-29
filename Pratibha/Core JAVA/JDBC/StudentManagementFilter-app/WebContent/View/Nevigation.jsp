<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
.sf-menu {
	
    margin: 0;
    padding-top: 20px;
}
.sf-menu > li {
    position: relative;
    float: left;
    list-style: none;
    line-height: 20px;
    margin: 0 40px 0 0;
		

}
.sf-menu > li > a {
    text-decoration: none;
    display: block;
    font-size: 17px;
	

}
.
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="span9" >
<!-- Menu-->

<%=session.getAttribute("user") %>
<%=session.getAttribute("id") %>

<ul id="menu" class="sf-menu">
    <li ><h1><a href="http://localhost:8080/StudentManagement-app/AddController" class="sf-with-ul">HOME</a></h1></li>
    <li><h1><a  href="http://localhost:8080/StudentManagement-app/LoginController" class="sf-with-ul">Login</a></h1></li>                                                        
    <li><h1><a  href="http://localhost:8080/StudentManagement-app/GetStudentController" class="sf-with-ul">Get-Students</a></h1></li>
    <li><h1><a  href="http://localhost:8080/StudentManagement-app/AddController" class="sf-with-ul">Add-Student</a></h1></li>
 </ul>
 

 <!-- End Menu-->
</nav>
</body>
</html>