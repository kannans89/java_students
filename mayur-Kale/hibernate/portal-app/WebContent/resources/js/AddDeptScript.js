$(function() {
	var deptid = $("#deptid");
	var deptName = $("#deptname");
	var deptLocation = $("#deptlocation");
	var errorId = $("#errorId");
	var errorName = $("#errorName");
	var errorLocation = $("#errorLocation");
	var addDeptForm = $("#addDepartmentForm");
	addDeptForm.submit(function(event) {
		if (deptid.val().length != 0 && deptName.val().length != 0
				&& deptLocation.val().length != 0) {
			return;
		}
		if (deptid.val().length == 0)
			errorId.html("Field missing!");
		else
			errorId.html("");
		if (deptName.val().length == 0)
			errorName.html("Field missing!");
		else
			errorName.html("");
		if (deptLocation.val().length == 0)
			errorLocation.html("Field missing!");
		else
			errorLocation.html("");
		event.preventDefault();
	});
});