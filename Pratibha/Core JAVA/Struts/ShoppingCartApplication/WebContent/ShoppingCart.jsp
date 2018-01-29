<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart Application</title>
</head>
<body>
	<h1>Welcome To Shopping Cart Application</h1>
	<br>
	<s:form action="add">
		<s:hidden name="firstcall" value="false" />
Product:<select name="id"><option>1111</option>
			<option>1112</option>
			<option>1113</option>
			</select>
 Quantity:<input type="number" name="quantity" />
		<input type="submit" name="submit" value="Add To Cart" />
		<br>
	</s:form>
	<br>
	<table border="1" cellpadding="20">
		<caption>Line Items</caption>
		<tr>
			<th>Name</th>
			<th>ID</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total</th>
		</tr>
		<s:iterator value="item">
			<tr>
				<td><s:property value="value.product.name" /></td>
				<td><s:property value="key" /></td>
				<td><s:property value="value.product.price" /></td>
				<td><s:property value="value.quantity" /></td>
				<td><s:property value="value.cost" /></td>

			</tr>
		</s:iterator>
	</table>

	<br>
	<a href="Checkout"><input type="button" name="checkout"
		value="Checkout"></a>
	<h1>
		<s:property value="checkout" />
	</h1>

</body>
</html>