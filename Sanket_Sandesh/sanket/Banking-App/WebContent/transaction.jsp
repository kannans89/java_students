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
		
		<title>Transaction</title>
	</head>

	<body>
		<script src="CONTAINER/jquery-3.2.1.min.js"></script>
    	<script src="CONTAINER/bootstrap/js/bootstrap.min.js"></script>
    	
    	<script>
                $(domReady);
                
				var formName = '#transactionForm';
				var dateText = '#date';
                
				function domReady() {
                	$('input[type=submit]').click(function() {
                	      buttonpressed = $(this).attr('name')
                	 })
                	
                	$(dateText).hide();
                    $(formName).submit(submitted);
                	$("input:radio[name=dateChoice]").click(dateChoiceChanged);
                }            

                function submitted() {

                	if(buttonpressed == "cancel") {
                		return true;
                	}
                	
                	var amount = $('#amount').val();
                	var type = $('input[name=type]:checked', formName).val();
                	var dateChoice = $('input[name=dateChoice]:checked', formName).val();
                	var date = $(dateText).val();
                	
                	var validationFlag = 0;
                	
                	if(amount == "") {
                		$('#amountError').html(" * Please enter the amount");
                		validationFlag = 1;
                    }
                    else {
                    	var numberRegex = /^[+-]?\d+(\.\d+)?([eE][+-]?\d+)?$/;
                    	if(numberRegex.test(amount) == true) {
                    		$('#amountError').html("");
                    	} else {
                    		$('#amountError').html(" * Please enter valid amount");
                    		validationFlag = 1;
                    	}
                    }
                	
                	if(dateChoice == "Custom") {
                		if(date == "") {
                			$('#dateError').html(" * Please enter the date");
                            validationFlag = 1;
                        }
                        else {
                        	var dateRegex = /^(([0-9])|([0-2][0-9])|([3][0-1]))\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec|01|02|03|04|05|06|07|08|09|10|11|12|jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\-\d{4}$/;
                        	if(dateRegex.test(date) == true) {
                        		$('#dateError').html("");
                        	}
                        	else {
                        		$('#dateError').html(" * Please enter the date in format dd-mm-yyyy");
                        		validationFlag = 1;
                        	}
                        }
                	}
                	else {
                		$('#dateError').html("");
                	}
                	
                	if(validationFlag != 0) {
                		return false;
                	}
                }
                
                function dateChoiceChanged() {
                	var dateChoice = $('input[name=dateChoice]:checked', formName).val();
                	
                	if(dateChoice == "Custom") {
                		$('#dateError').show();
                		$(dateText).show();
                	}
                	if(dateChoice == "Current") {
                		$(dateText).hide();
                		$(dateText).val("");
                		$('#dateError').hide();
                	}
                		
                }
		</script>
    	
    	
    	<div class="menuDiv"></div>
    	
    	<div class="navbar navbar-fixed-top" style="width: 100%;">
            		<div class="container navbar-container" style="width: 100%; padding-left: 0px; padding-right: 0px;">
    	
    	
			<div class="menuDiv">
    		<div class="heading5" style="font-family: Georgia, serif;">
				
                		
                		<div class="collapse navbar-collapse">
                    		<ul class="nav navbar-nav">
                        		<li><a href="/Banking-App/">Home</a></li>
                        		<li><a href="masterTable">Master Table</a></li>
                        		<li><a href="transactionsTable">Transactions Table</a></li>
								<li><a href="transaction" style="color: black;">Make Transaction</a></li>
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
                    	<div class="heading2">Make Transaction </div><br><br>
                    		<br>
                    		
                    	<div class="container">
                    		<div class="row">
                    			<div class="col-lg-3 col-md-6 col-sm-12 col-xs-12 col-lg-offset-1">
									<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">Amount :- </div><br>
									<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">Type :- </div><br><br><br><br>
									<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">Date :- </div>
								</div>
                    			
                    			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                    				<form method="post" id="transactionForm" action="transaction" style="text-align: center; padding-left: 10%; padding-right: 10%;">
	    		                		<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
											<input type="text" name="amount" id="amount">
			    						</div>
										<label id="amountError" style="color:RED"></label><br><br>
							
										<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
											<input type="radio" name="type" value="Deposit" style="height: 20px; width: 20px;" checked="checked"> Deposit<br>
											<input type="radio" name="type" value="Withdraw"style="height: 20px; width: 20px;"> Withdraw<br>
										</div><br>
			
										<div class="heading4" style="font-family: Arial, Helvetica, sans-serif; text-align: left;">
											<input type="radio" name="dateChoice" id="dateChoice" value="Current" style="height: 20px; width: 20px;" checked="checked"> Current Date<br>
											<input type="radio"  name="dateChoice" id="dateChoice"  value="Custom" style="height: 20px; width: 20px;"> Custom Date<br>
											<input type="text" id="date" name="date">
										</div>
										<label id="dateError" style="color:RED"></label><br><br>
							
										<div class="heading4" style="font-family: Arial, Helvetica, sans-serif;">
											<input type="submit" value="Confirm" name="submit">
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
              	</div>         
        		
        	</div>
		</div>
	</body>
</html>