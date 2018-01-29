$(function() {
	var formSubmit = $("#submit");
	var uid = $("#uid");
	var password = $("#password");
	var alertId = $("#alertId");
	var alertPwd = $("#alertpwd");
	formSubmit.submit(function(event) {
		if (uid.val().length != 0 && password.val().length)
			return;
		if (uid.val().length == 0)
			alertId.html("Field is empty");
		else
			alertId.html("");
		if (password.val().length == 0)
			alertPwd.html("Field is empty");
		else
			alertPwd.html("");
		event.preventDefault();
	});
});