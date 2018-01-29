

<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<sj:head />

<s:form id="add"
        action="add" method="post">
    <s:textfield name="title" label="Event Title" size="100" />
    <sj:datepicker name="date" id="date" label="Event Date"  displayFormat="yy-mm-dd" />
    <s:textfield name="time" label="Event Time" />
    <s:submit value="Add Event" />
</s:form>

<p/>

<h3>Upcoming Events </h3>

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
        <td style="text-align:center">
            <a href='delete?id=${event.eventid}' onclick="return confirm('Do you want to delete this event?')">Delete</a>
            <a href='update?id=${event.eventid}'>Update</a>
        </td>
    </tr>
    
</s:iterator>
</table>