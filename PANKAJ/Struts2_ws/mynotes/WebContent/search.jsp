<%@taglib  uri="/struts-tags" prefix="s" %>

<s:form action="search"  theme="simple">
    Note title or text :
    <input type="text" name="pattern" 
         required="required" size="20"></input>  
    <s:submit  value="Search"/>
    <p/>    
</s:form>

<s:if test="notes != null">
    <s:if test="message == null">  
        <table border="1" style="width:100%">                 
            <tr><th>Updated</th>
                <th>Title</th>
                <th>Text Preview</th>
                <th>&nbsp; </th>
            </tr>
            <s:iterator  value="notes" var="note">
                <tr>
                    <td>${note.updated.toString()}</td>
                    <td>${note.title} </td>
                    <td>${note.preview} </td>
                    <td><a href="edit?id=${note.id}">Details</a> </td>
                </tr>
            </s:iterator>
        </table>
    </s:if>
    <s:else>
            <div class="error"> <s:property value="message" /> </div>
    </s:else>
</s:if>