  <HTML>
    <HEAD>
     <TITLE>JSP: Scriptlets</TITLE>
    </HEAD>
     <%
        String bgColor = request.getParameter("COLOR");
       
        if (bgColor == null)
           bgColor = "WHITE";
        
     %>
    <BODY BGCOLOR="<%= bgColor %>" >
     <H1>Example Scriptlet: Sets background color</H1>
       
    </BODY>
   </HTML>