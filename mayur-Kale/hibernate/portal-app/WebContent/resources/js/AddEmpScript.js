$(function() {
	var empid = $("#empid");
	var empName = $("#empname");
	var errorId = $("#errorId");
	var errorName = $("#errorName");
	var addEmpForm = $("#addEmployeeForm");
	addEmpForm.submit(function(event) {
		if (empid.val().length != 0 && empName.val().length != 0) {
			return;
		}
		if (empid.val().length == 0)
			errorId.html("Field missing!");
		else
			errorId.html("");
		if (empName.val().length == 0)
			errorName.html("Field missing!");
		else
			errorName.html("");
		event.preventDefault();
	});
});