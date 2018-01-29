<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyCalendar.Com</title>
<link href="styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <div class="banner">MyCalendar.Com</div>
  <div class="menu">
    [<a href="home">Home</a>]
    [<a href="search">Search Events</a>]
    [<a href="pastevents">Past Events</a>]
     <span class="user">
         <b>${sessionScope.username} </b>
         [<a href="changepassword">Change Password</a>]
         [<a href="logout">Logout</a>]
     </span>
  </div>
         
  <h3><tiles:insertAttribute name="title"></tiles:insertAttribute> </h3>
  <tiles:insertAttribute name="body"></tiles:insertAttribute>
</body>
</html>