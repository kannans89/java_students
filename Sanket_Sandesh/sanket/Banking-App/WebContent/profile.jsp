<%@page import="com.techlabs.controllers.components.Customer"%>
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
		
		<title>Customer Profile</title>
	</head>

	<body>
		<script src="CONTAINER/jquery-3.2.1.min.js"></script>
    	<script src="CONTAINER/bootstrap/js/bootstrap.min.js"></script>
    	
    	<div class="menuDiv"></div>
    	
    	<div class="navbar navbar-fixed-top" style="width: 100%;">
            		<div class="container navbar-container" style="width: 100%; padding-left: 0px; padding-right: 0px;">
    	
    	
			<div class="menuDiv">
    		<div class="heading5" style="font-family: Georgia, serif;">
				
                		
                		<div class="collapse navbar-collapse">
                    		<ul class="nav navbar-nav">
                        		<li><a href="/Banking-App/" style="color: black;">Home</a></li>
                        		<li><a href="masterTable">Master Table</a></li>
                        		<li><a href="transactionsTable">Transactions Table</a></li>
								<li><a href="transaction">Make Transaction</a></li>
								<li><a href="passbook">Pass Book</a></li>
                    		</ul>
                    		
                    		<form class="form-inline waves-effect waves-light">
                				<a href="logout" class="menuButton"> Logout</a>
            				</form>
                		</div>
                		
                		
            		</div>
        		</div>
        	</div>
		</div>
		
		<div class="logoDiv">
			<div class="logo">
				<div style="color: orange; 	display: inline-block;">INDIAN</div>
				<div style="color: black; 	display: inline-block;"> Bank </div>
			</div>
		</div>
		
		<br><br>
		
		<% Customer customer = (Customer)request.getAttribute("user");%>
		<div class="container-fluid">
			<div class="row">
				
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="transBlockGray" style="min-height: 500px; padding-top: 20%">
					<div class="heading4" style="color: white;">Actions</div><br><br><br>
					<div class="heading5" style="color: white; text-align: left;">
						<ul>
                        	<li style="padding-top: 15px; padding-bottom: 0px;"><a href="masterTable" style="color: white">Open Master Table</a></li>
                        	<li style="padding-top: 15px; padding-bottom: 0px;"><a href="transactionsTable" style="color: white">Open Transactions Table</a></li>
							<li style="padding-top: 15px; padding-bottom: 0px;"><a href="transaction" style="color: white">Make Transaction</a></li>
							<li style="padding-top: 15px; padding-bottom: 0px;"><a href="passbook" style="color: white">Open Pass Book</a></li>
                    	</ul>
                    </div>
					</div>
				</div>
			
              	<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                    <div class="transBlockWhite" style="min-height: 500px;">
                    	<div class="heading2">Welcome <%= customer.getName()%></div><br><br>
                    	
                    	<div class="row">
							<div style="height: 20px;">
                    			<div class="heading3" style="font-family: Arial, Helvetica, sans-serif; text-align: left; float:left; padding-left: 50px;">
                    				Customer Information
                    			</div>
                    		
                    			<div class="heading5" style="font-family: Arial, Helvetica, sans-serif; text-align: right; float:right; padding-right: 50px;">
                    				<a href="editProfile"><img src="CONTAINER/CSS/edit.ico" width="30px" height="30px"> Edit Information</a>
                    			</div>
                    		</div>
                    		<br><br><br>
                    		
                    		<div class="col-lg-3 col-md-3 col-sm-4 col-xs-6 col-lg-offset-1 col-md-offset-1">	
                    			<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
                    				Customer ID<br>
                    				Name<br>
                    				Username<br>
                    				Password<br>
                    				Email ID<br>
                    				Balance<br>
                    			</div>
                    		</div>
                    		
                    		<div class="col-lg-8 col-md-8 col-sm-8 col-xs-6">
                    			<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
                    				:- <%= customer.getCustomerID()%><br>
                    				:- <%= customer.getName()%><br>
                    				:- <%= customer.getUsername()%><br>
                    				:- <%= customer.getPassword()%><br>
                    				:- <%= customer.getEmailID()%><br>
                    				:- <%= customer.getBalance()%> Rs.<br>
                    			</div>
                    		</div>
                    	</div>
                    </div>
              	</div>              	
             </div>
		</div>
	</body>
</html>