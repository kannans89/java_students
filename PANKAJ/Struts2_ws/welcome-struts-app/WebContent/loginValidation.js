$(document).ready(function() {
	$('#submit').click(function() {
		var uname = $('#userName').val();
		var pwd = $('#password').val();

		if (uname == "" || pwd == "") {
			$('#prompt').html("*");
			return false;
		} else if (uname == pwd) {
			$('#prompt').html("User-Name and Password cannot be same");
			return false;
		}
	});
});