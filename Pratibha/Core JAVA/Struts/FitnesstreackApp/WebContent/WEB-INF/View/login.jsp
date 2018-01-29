<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="text/css">
.errorMessage {
  font-weight: bold;
  color: red;
}
</style>
<s:form action="loginaction">
<s:actionerror/>
<s:textfield name="name" label="Name"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:submit value="login"></s:submit>
</s:form>