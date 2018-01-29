<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<%@taglib  uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
<head>
  <s:head />
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
  <link rel="stylesheet" href="styles.css" />
</head>

<body>
   <div class="banner">MyNotes.Com</div>
   <h2>  <tiles:insertAttribute name="title" ignore="true" /> </h2>
   <tiles:insertAttribute name="body" /><br/>

</body>
</html>
