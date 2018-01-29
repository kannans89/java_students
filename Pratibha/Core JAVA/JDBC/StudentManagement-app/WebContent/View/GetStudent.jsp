<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.techlabs.models.Student"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
<form method="post" action="EditController">
<%String male1,female1; %>   
Roll Number: <input type="text" name="rollno" value="<%=request.getAttribute("rollno")%>">
Name:        <input type="text" name="name" value="<%=request.getAttribute("name")%>"/><br>          
Email:       <input type="text" name="email" value="<%=request.getAttribute("email")%>"/><br>
Gender:       <input type="radio" name="gender" value="Male"  <%if(request.getAttribute("address").equals("Male")){male1="checked"; }else{male1="unchecked";} %>checked="<%=male1%>" >Male
             <input type="radio" name="gender" value="Female" <%if(request.getAttribute("address").equals("Female")){female1="checked"; }else{female1="unchecked";} %>checked="<%=female1%>" >Female<br>
Address:      <input type="text" name="address" value="<%=request.getAttribute("address")%>"/><br><br>
Contact:     <input type="text" name="contact" value="<%=request.getAttribute("contact")%>" /><br>
<input type="submit" name="Save" value="Save Changes"></td></tr>

</form></pre>
<div id="div1"></div>
</body>
</html>