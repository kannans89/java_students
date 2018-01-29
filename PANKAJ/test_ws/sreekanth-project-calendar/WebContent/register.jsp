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

<s:form id="registerform"
        onsubmit="return validate()"
        action="registerprocess" method="post">
    <s:textfield id="username"  name="username" label="Username"  />
    <s:password  id="password"  name="password" label="Password"  />
    <s:password  id="password2" name="password2" label="Reenter Password"  />
    <s:textfield  name="email" label="Email Address"  />
    <s:submit value="Register" />
</s:form>
<p/>
<div class="error">
    <s:property value="message" />
</div>    
<p/>
<a href="login">Login</a>
