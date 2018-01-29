<script src="jquery-2.1.1.js" type="text/javascript"></script>
<script type="text/javascript">
    function validate() {
        if ( $("#password").val() !== $("#password2").val())
        {
            alert("Confirm password and password do not match!");
            return false; 
        }
    }
</script>
    
<%@taglib prefix="s" uri="/struts-tags"%>

<s:form id="chgpwdform"
        onsubmit="return validate()"
        action="changepasswordprocess" method="post">
    <s:password  id="oldpassword"  name="oldpassword" label="Old Password"  />
    <s:password  id="password"  name="password" label="New Password"  />
    <s:password  id="password2" name="password2" label="Reenter New Password"  />
    <s:submit value="Change Password" />
</s:form>
<p/>
<div class="error">
    <s:property value="message" />
</div>    

