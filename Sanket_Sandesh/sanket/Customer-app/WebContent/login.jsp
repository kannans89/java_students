<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}
#main{
background-color: #99ffff;
border: 2px groove black;
}
#header{
background-color: #ffb366;
border: 1px groove black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body align="center" id="main">
	<h1 id="header">Welcome To Dynamic Customer App</h1>
	<h2>Login Module</h2>
	<div align="center">
		<form action="Login" method="post" class="form-horizontal">
		<div class="form-group">
      <label class="control-label col-sm-2" >Enter Username:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  placeholder="Enter Your Username" name="user">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >Enter Password:</label>
      <div class="col-sm-10">
        <input type="password" class="form-control"  placeholder="Enter Your Password" name="pass">
      </div>
      <br><br><br>
          <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>
		</form>
	</div>

</body>
</html>