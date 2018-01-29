
<html>  
<body>  
<%    if(session.getAttribute("count")==null)
session.setAttribute("count",0);  

int old=(int)session.getAttribute("count");  %><br>
<%out.print("old :"+old);  %><br>
<%    
session.setAttribute("count",(old+1));  
int num2=(int)session.getAttribute("count");  
out.print("new num:"+num2);  %><br>
Session ID: <%=session.getId()%>

</body>  
</html>  
