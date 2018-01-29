<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    

<!DOCTYPE HTML>
<html>
<head>
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
  <link rel="stylesheet" href="styles.css" />
</head>

<body>
   <div class="banner">MyNotes.Com</div>
   <div class="menu">
       <a href="home">Home</a> &nbsp;
       <a href="addOpt">Add</a> &nbsp;
       <a href="searchOpt">Search</a>
       <span style="float: right">
           ${sessionScope.user.fullname}
           <a href="changePasswordOpt">Change Password</a>
           &nbsp;
           <a href="logout">Logout</a>
       </span>
   </div>
   <h2> <tiles:insertAttribute name="title" ignore="true" /> </h2>
   <tiles:insertAttribute name="body" /><br/>

</body>
</html>
