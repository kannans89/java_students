$(document).ready(function() {
	$("#submit").click(function() {

		var fromAccount = $("#fromAccount").val();
		var toAccount = $("#toAccount").val();
		var amount = $("#amount").val();

		if (amount <= 0) {
			$("#messege").html("Please enter valid Amount !");
			return false;
		}

		if (fromAccount == "-1" || toAccount == "-1" || amount == "") {
			$("#messege").html("Please enter all details");
			return false;
		}
	})
})