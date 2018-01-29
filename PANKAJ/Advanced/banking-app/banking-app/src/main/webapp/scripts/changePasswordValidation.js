$(document).ready(function() {
	$("#submit").click(function() {

		var password = $("#password").val();
		var newPassword = $("#newPassword").val();
		var newPasswordCopy = $("#newPasswordCopy").val();

		if (password == '' || newPassword == '' || newPasswordCopy == '') {
			$('#messege').html("Please enter all details");
			return false;
		}

		if (newPassword != newPasswordCopy) {
			$("#messege").html("New Passwords do not match.");
			return false;
		}
	})
})