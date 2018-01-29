
<%@taglib prefix="s" uri="/struts-tags"%>

<s:form  action="loginprocess" method="post">
    <s:textfield  name="username" label="Username"  />
    <s:password   name="password" label="Password"  />
    <s:submit value="Login" />
</s:form>

<div class="error">
    <s:property value="message" />
</div>    

<a href="register">New User? Register!</a>
