<%@taglib  uri="/struts-tags" prefix="s" %>


<s:if test="message != null">  
    <div class="error"> <s:property value="message" /> </div>
</s:if>    
<s:else>    
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
</s:else>
