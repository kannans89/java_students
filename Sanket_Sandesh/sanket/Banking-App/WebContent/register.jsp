<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">

    	<link href="CONTAINER/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    	<link href="CONTAINER/CSS/Banking.css" rel="stylesheet">
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

		<title>Register</title>
	</head>

	<body>
		<script src="CONTAINER/jquery-3.2.1.min.js"></script>
    	<script src="CONTAINER/bootstrap/js/bootstrap.min.js"></script>
    	
    	<script>
                $(domReady);

                function domReady() {
                	$('input[type=submit]').click(function() {
                	      buttonpressed = $(this).attr('name')
                	 })
                	 
                    $('#registerForm').submit(submitted);
                }            

                function submitted() {

                	if(buttonpressed == "cancel") {
                		return true;
                	}
                	
                	var name = $('#name').val();
                	var emailID = $('#email').val();
                	var balance = $('#balance').val();
                	var userName = $('#userName').val();
                    var password = $('#password').val();
                    var confirmPassword = $('#confirmPassword').val();
                    
                    var nameError = $('#nameError');
                    var emailIDError = $('#emailError');
                    var balanceError = $('#balanceError');
                    var userNameError = $('#userNameError');
                    var passwordError = $('#passwordError');
                    var confirmPasswordError = $('#confirmPasswordError');
                    
                    var validationFlag = 0;

                    if(name == "") {
                        nameError.html(" * Please enter the name");
                        validationFlag = 1;
                    }
                    else
                        nameError.html("");
                    
                    if(emailID == "") {
                        emailIDError.html(" * Please enter the email ID");
                        validationFlag = 1;
                    }
                    else {
                        var pattern = /^[A-Z0-9._%+-]+@([A-Z0-9-]+\.)+[A-Z]{2,4}$/i;
                        if(pattern.test(emailID) == true)
                        	emailIDError.html("");
                        else {
                        	emailIDError.html(" * Please enter valid email ID");
                            validationFlag = 1;
                        }

                    }

                    if(balance == "") {
                    	balanceError.html(" * Please enter the initial deposit");
                        validationFlag = 1;
                    }
                    else {
                        var numberRegex = /^[+-]?\d+(\.\d+)?([eE][+-]?\d+)?$/;
                    	if(numberRegex.test(balance) == true) {
                    		balanceError.html("");
                    	} else {
                    		balanceError.html(" * Please enter valid initial deposit");
                    		validationFlag = 1;
                    	}
                    }
                    
                    if(userName == "") {
                        userNameError.html(" * Please enter the username");
                        validationFlag = 1;
                    }
                    else
                        userNameError.html("");

                    if(password == "") {
                        passwordError.html(" * Please enter the password");
                        validationFlag = 1;
                    }
                    else
                        passwordError.html("");
                    
                    if(confirmPassword == "") {
                    	confirmPasswordError.html(" * Please confirm the password");
                        validationFlag = 1;
                    }
                    else {
                    	if(password == confirmPassword) {
                    		confirmPasswordError.html("");
                    	} else {
                    		confirmPasswordError.html(" * Passwords do not match");
                    		validationFlag = 1;
                    	}
                    }

                    if(validationFlag != 0)
                        return false;
                }
                
                
                
            </script>
    	
    	<div class="menuDiv">
			<div class="heading3">Register</div>
		</div>
		
		<div class="logoDiv">
			<div class="logo">
				<div style="color: orange; 	display: inline-block;">INDIAN</div>
				<div style="color: black; 	display: inline-block;"> Bank </div>
			</div>
		</div>
		
		<br><br>
		
		<div class="container-fluid">
			<div class="row" style="height: 84vh;">
              	<div class="col-lg-6 col-md-8 col-sm-12 col-xs-12 col-lg-offset-3 col-md-offset-2" style="padding-left: 10%; padding-right: 10%">
                    <div class="transBlockWhite" style="min-height: 500px; padding-top: 20%">
                    	
                    	<form method="post" id="registerForm" action="register" style="text-align: center; padding-left: 10%; padding-right: 10%;">
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Name :- <input type="text" name="name" id="name">
							</div>
							<label id="nameError" style="color:RED"></label><br><br>
							
                    		
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Email ID :- <input type="text" name="email" id="email">
							</div>
							<label id="emailError" style="color:RED"></label><br><br>
							
                    		
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Initial Deposit :- <input type="text" name="balance" id="balance"> Rs.
							</div>
							<label id="balanceError" style="color:RED"></label><br><br>
							
                    		
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Username :- <input type="text" name="userName" id="userName">
							</div>
							<label id="userNameError" style="color:RED"></label><br><br>
							
							<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Password &nbsp;:- <input type="password" name="password" id="password">
							</div>
							<label id="passwordError" style="color:RED"></label><br><br>
							
							<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Confirm Password &nbsp;:- <input type="password" name="confirmPassword" id="confirmPassword">
							</div>
							<label id="confirmPasswordError" style="color:RED"></label><br><br>
							
							<div class="heading4" style="font-family: Arial, Helvetica, sans-serif;">
								<input type="submit" value="Register" name="submit">
								<input type="submit" value="Cancel" name="cancel">
							</div>
							
							<br><br>
                    		<label style="color:RED"><%if(request.getAttribute("error")!=null)
	                    		out.println((String)request.getAttribute("error"));%></label>
						</form>
                    
                    </div>
              	</div>              	
             </div>
		</div>
    	
	</body>
</html>