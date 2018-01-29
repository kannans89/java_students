<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="update"  method="post"  theme="simple">
    Title <br/>
    <s:textfield name="title" required="required"  style="width:500px" />
    <p/>
    Note <br/>
    <s:textarea name="text" style="width:500px"  rows="8" required="required"/>
    <p/>
    <s:hidden name="id" />
    <p/>
    <s:submit value="Update"/>
    &nbsp;
    <s:submit value="Delete" 
      method="delete"  
      onclick="return confirm('Do you really want to delete this note?')" />
</s:form>
<p/>
<div class="error"><s:property value="message"/> </div>
