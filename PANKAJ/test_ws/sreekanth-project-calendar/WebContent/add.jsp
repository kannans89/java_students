<script src="jquery-2.1.1.js" type="text/javascript"></script>
<%@taglib prefix="s" uri="/struts-tags"%>

<s:form id="add"
        action="add" method="post">
    <s:textfield name="title" lable="Event Title" size="50" />
    <s:textfield name="date" lable="Event Date" />
    <s:textfield name="time" lable="Event Time" />
    <s:submit value="Add Event" />
</s:form>
<p/>
<div class="error">
    <s:property value="message" />
</div>    

