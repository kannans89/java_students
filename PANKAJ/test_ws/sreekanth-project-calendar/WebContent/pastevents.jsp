
<%@taglib prefix="s" uri="/struts-tags"%>

<table border="1" cellpadding="5pt">
<s:iterator value="events" var="event">
    <tr>
        <td>
            ${event.date}
        </td>
        
        <td>
            ${event.time}
        </td>
        
        <td>
            ${event.title}
        </td>
     </tr>
    
</s:iterator>
</table>