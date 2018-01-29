$(document).ready(
		function() {
			$("#submit").click(
					function() {

						var name = $("#name").val();
						var gender = $("#gender").val();
						var dob = $("dob").val();
						var isMarried = $("#isMarried").val();
						var occupation = $("#occupation").val();
						var email = $("#email").val();
						var mobile = $("#mobile").val();
						var city = $("#city").val();
						var pin = $("#pin").val();
						var address = $("#address").val();

						if (name == '' || dob == "" || gender == '-1'
								|| isMarried == "-1" || occupation == ''
								|| email == '' || mobile == '' || city == ''
								|| pin == "" || address == "") {
							$("#messege").html("Please enter all details");
							return false;
						}
					})
		})