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
	
		<title>Login</title>
	</head>

	<body>
		<script src="CONTAINER/jquery-3.2.1.min.js"></script>
    	<script src="CONTAINER/bootstrap/js/bootstrap.min.js"></script>
		
		<script>
                $(domReady);

                function domReady() {
                    $('#loginForm').submit(submitted);
                }            

                function submitted() {
                    var userName = $('#userName').val();
                    var password = $('#password').val();
                    
                    var userNameError = $('#userNameError');
                    var passwordError = $('#passwordError');
                    
                    var validationFlag = 0;

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

                    if(validationFlag != 0)
                        return false;
                }
        </script>
            
		<div class="menuDiv">
			<div class="heading3">Login</div>
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
                    	
                    	<form method="post" id="loginForm" action="login" style="text-align: center; padding-left: 10%; padding-right: 10%;">
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Username :- <input type="text" name="userName" id="userName">
							</div>
							<label id="userNameError" style="color:RED"></label><br><br>
							
							<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
								Password &nbsp;:- <input type="password" name="password" id="password">
							</div>
							<label id="passwordError" style="color:RED"></label><br><br>
							
							<div class="heading4" style="font-family: Arial, Helvetica, sans-serif;">
								<input type="submit" value="Login">
							</div>
							
							<br><br>
                    		<label style="color:RED"><%if(request.getAttribute("error")!=null)
	                    		out.println((String)request.getAttribute("error"));%></label>
						</form>
                    
                    	<p style="text-align:right; margin-right: 5px;">Not a member? <a href="/Banking-App/register">Register</a></p>
                    </div>
              	</div>              	
             </div>
		</div>
	
		
		
	</body>
</html>