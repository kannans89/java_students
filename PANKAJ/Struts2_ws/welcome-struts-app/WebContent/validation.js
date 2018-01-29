$(document).ready(function() {
	$('#submit').click(function() {
		var yourName = $('#yourName').val();

		if (yourName == "") {
			$('#star').html("*");
			return false;
		}
	});
});