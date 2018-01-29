<%@page import="com.techlabs.controllers.components.Customer"%>
<%@page import="java.util.List"%>
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
		
		<title>Master Table</title>
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
                        		<li><a href="/Banking-App/">Home</a></li>
                        		<li><a href="masterTable" style="color: black;">Master Table</a></li>
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
		
		<div class="container-fluid" >
			<div class="row">
				
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="transBlockGray" style="min-height: 500px; padding-top: 20%;">
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
                    <div class="transBlockWhite" style="min-height: 500px; padding-left: 20px; padding-right: 20px; padding-bottom: 40px;">
                    	<div class="heading2">Master Table </div><br><br>
                    		<br>
                    		
                    	<div class="table-responsive" style="text-align: left; border: 2px solid black;">
        					<table class="table" style="font-size: 20px; font-weight: 700">
            					<thead>
               						<tr>
                   						<th  style="border-bottom: 3px solid black;">Customer ID</th>
                   						<th  style="border-bottom: 3px solid black;">Name</th>
                   						<th  style="border-bottom: 3px solid black;">Username</th>
                   						<th  style="border-bottom: 3px solid black;">Password</th>
                   						<th  style="border-bottom: 3px solid black;">Email ID</th>
                   						<th  style="border-bottom: 3px solid black;">Balance</th>
               						</tr>
           						</thead>
           						
           						<tbody>
           							<%
           								@SuppressWarnings("unchecked")
										List<Customer> customers = (List<Customer>) request.getAttribute("customers"); 			
											for(Customer customer : customers) {
									%>
                						
                					<tr>
                    					<td><%= customer.getCustomerID()%></td>
                    					<td><%= customer.getName()%></td>
                    					<td><%= customer.getUsername()%></td>
                   						<td><%= customer.getPassword()%></td>
                   						<td><%= customer.getEmailID()%></td>
                   						<td>Rs. <%= customer.getBalance()%></td>
               						</tr>
                						
               						<% }%>
            					</tbody>
        					</table>
    					</div>
    					
    					<br><br>
    					<form method="post" action="masterTable" style="text-align: center; padding-left: 10%; padding-right: 10%;">
                    		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif;">
								<input type="submit" value="OK" style="width: 150px;">
							</div>
						</form>
                    
                    </div>
              	</div>         
        		
        	</div>
		</div>
			
	</body>
</html>