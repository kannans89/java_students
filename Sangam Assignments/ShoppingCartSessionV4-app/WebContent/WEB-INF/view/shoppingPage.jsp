<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping</title>
</head>
<body>
<form action="ShoppingAction">
		<table>
			<tr>
				<td><s:form action="ShoppingAction">
						<s:hidden name="addOperation" value="true"></s:hidden>						
						<select  name="productName" >
						<s:iterator value="optionList">
						<option value='<s:property/>'><s:property/></option>	
						</s:iterator>
						</select>
						<s:textfield name="quantity" label="Quantity"></s:textfield>
						<s:submit value="Add to Cart"></s:submit>						
					</s:form></td>
			</tr>
		</table>
		<br>
	</form>
	<table border="1">
	<tr>
		<th>Product Id</th><th>Product Name</th><th>Quantity</th><th>Price</th><th>Total</th><th>Delete</th>
	</tr>
	<s:iterator value="productList">
	<tr>
			<td><s:property value="product.productId"></s:property><br></td>
			<td><s:property value="product.productName"></s:property><br></td>
			<td><s:property value="quantity"></s:property><br></td>
			<td><s:property value="product.productPrice"></s:property><br></td>
			<td><s:property value="total"></s:property><br></td>
			<td><s:url var="urlDelete" action="ShoppingAction">
			<s:param name="deleteItem">
			<s:property value="product.productName"></s:property>
			</s:param></s:url>
			<a href="<s:property value="urlDelete" />">Delete</a></td>
	</tr>
	</s:iterator>
	</table>
	Checkout Price : <s:property value="checkOutPrice"/>
</body>
</html>