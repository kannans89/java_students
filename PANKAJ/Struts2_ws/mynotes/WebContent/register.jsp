<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="register"  method="post">
    <s:textfield name="email" label="Email Address" type="email" />
    <s:password name="password" label="Password"  required="required" />
    <s:password name="password2" label="Confirm Password"  required="required"/>
    <s:textfield name="fullname" label="Fullname"  required="required"/>
    <s:submit value="Register" />
</s:form>
<p/>
<a href="loginOpt">Login</a>
<p/>
<div class="error"><s:property escape="false" value="message"/> </div>
