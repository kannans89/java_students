$(document).ready(function() {
	$('#login').click(function() {

		var userid = $('#id').val();
		var password = $('#password').val();
		var userType = $('#userType').val();

		if (userid == '' || password == '' || userType == '-1') {
			$('#messege').html("Please enter all details");
			return false;
		}
	})
})