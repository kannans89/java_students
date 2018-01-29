

<%@taglib prefix="s" uri="/struts-tags"%>

<table border="1" cellpadding="5pt" width="100%">
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
        <td>
            <a href='delete?id=${event.eventid}' onclick="return confirm('Do you want to delete this event?')">Delete</a>
            <a href='update?id=${event.eventid}'>Update</a>
        </td>
    </tr>
</s:iterator>
</table>