<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="add"  method="post"  theme="simple">
    Title <br/>
    <s:textfield name="title" required="required"  style="width:500px" />
    <p/>
    Note <br/>
    <s:textarea name="text" label="Note" style="width:500px"  rows="8" required="required"/>
    <p/>
    <s:submit value="Add" />
</s:form>
<p/>
<div class="error"><s:property value="message"/> </div>
