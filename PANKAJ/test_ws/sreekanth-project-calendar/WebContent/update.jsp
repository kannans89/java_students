<script src="jquery-2.1.1.js" type="text/javascript"></script>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<sj:head />

<s:form id="update"
        action="updateprocess" method="post">
    <s:hidden name="id" />
    <s:textfield name="title" label="Event Title" size="100" />
    <sj:datepicker name="date" label="Event Date" displayFormat="yy-mm-dd" />
    <s:textfield name="time" label="Event Time" />
    <s:submit value="Update Event" />
</s:form>
<p/>
<div class="error">
    <s:property value="message" />
</div>    

