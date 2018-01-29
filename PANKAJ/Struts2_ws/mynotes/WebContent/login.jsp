<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="login"  method="post">
    <s:textfield name="email" label="Email Address" type="email" required="required" />
    <s:password name="password" label="Password" required="required" />
    <s:submit value="Login" />
</s:form>
<p/>
<a href="registerOpt">Register!</a>
<br/>
<a href="forgotOpt">Forgot Password?</a>
<p/>
<div class="error"><s:property value="message"/> </div>

