<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="forgot"  method="post">
    <s:textfield name="email" label="Email Address" type="email" required="required" />
    <s:submit value="Submit" />
</s:form>
<p/>
<a href="loginOpt">Login</a>
<p/>
<div class="error"><s:property value="message"/> </div>

