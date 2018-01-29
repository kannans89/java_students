$(function() {
	var formSubmit = $("#submit");
	var oldPass = $("#oldpass");
	var newPass = $("#newpass");
	var alertOld = $("#alertOld");
	var alertNew = $("#alertNew");
	formSubmit.submit(function(event) {
		if (oldPass.val().length != 0 && newPass.val().length != 0) {
			return;
		}
		if (oldPass.val().length == 0)
			alertOld.html("Field missing!");
		else
			alertOld.html("");
		if (newPass.val().length == 0)
			alertNew.html("Field missing!");
		else
			alertNew.html("");
		event.preventDefault();
	});
});