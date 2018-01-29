<!DOCTYPE html>
<html>

<head>
    <title>Query</title>
</head>

<body>
    <%
String dno = request.getParameter("deptno");
if(dno==null)
{out.println("<h1> No employees for the deptno</h1>");
	out.println("<h2> No query String </h2>");
}else
{
out.println("<h1>");
out.println("Displaying employees for Department No : "+dno);
out.println("</h1>");

}
%>
</body>

</html>
