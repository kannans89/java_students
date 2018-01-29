$(document).ready(function() {
	$("#submit").click(function() {

		var balance = Number($("#balance").val());
		var amount = Number($("#amount").val());
		var action = $("#action").val();

		if (isNaN(amount) || action == "-1") {
			$("#messege").html("Please enter all details");
			return false;
		}

		if (action == 'W' && amount > balance) {
			$("#messege").html("Insufficient funds");
			return false;
		}

		if (action == 'D') {
			$("#balance").val(balance + amount);
		} else
			$("#balance").val(balance - amount);

	})
})