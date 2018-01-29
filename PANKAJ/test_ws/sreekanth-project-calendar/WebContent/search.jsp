<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<sj:head />

<s:form id="searchform"
        action="searchprocess" method="post">
    <sj:datepicker name="fromdate" id="fromdate" label="From  Date" 
                   displayFormat="yy-mm-dd" />
    <sj:datepicker name="todate" id="todate" label="To Date" 
                   displayFormat="yy-mm-dd" />
    <sj:submit value="Search"  id="btnSearch"  targets="result" />

</s:form>
<p/>
<div id="result">
</div>

