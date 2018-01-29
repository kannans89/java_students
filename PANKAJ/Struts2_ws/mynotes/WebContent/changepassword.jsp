<%@taglib  uri="/struts-tags" prefix="s" %>
<s:form action="changePassword"  method="post">
    <s:password name="oldpassword" label="Old Password"  required="required" />
    <s:password name="password" label="New Password"  required="required" />
    <s:password name="password2" label="Confirm Password"  required="required"/>
    <s:submit value="Change Password" />
</s:form>
<p/>
<div class="error"><s:property value="message"/> </div>
