<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
<style type="text/css">
th, td {
	padding: 7px;
}

th {
	padding: 8px;
	color: white;
	background-color: #0C976B
}

#submit, button {
	background-color: #1DC914;
	border: none;
	padding: 8px;
	color: white;
	cursor: pointer;
}

h1 {
	background-color: #1DC914;
	border: none;
	padding: 8px;
	color: white;
}

body {
	font-size: 130%;
}
</style>
</head>
<body>
	<center>
		<h1>home-mobile shopping</h1>
		<table>
			<tr>
				<td><s:form action="shopping" method="post">
						<s:hidden name="addOperation" value="true"></s:hidden>
						   Product:  <select name="productId" label="">
							<s:iterator value="productList">
								<option value=<s:property value='productId'/>><s:property
										value='productName' /></option>
							</s:iterator>
						</select>

						<s:textfield name="quantity" label="quantity" size="9" value="1"></s:textfield>
						<br>
						<s:submit value="add" align="left" id="submit"></s:submit>
					</s:form></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<th>mobile</th>
				<th>quantity</th>
				<th>price</th>
				<th>delete</th>
			</tr>

			<s:iterator value="lineItems" status="stat">
				<tr>
					<td><s:property value="Product.productName" /></td>
					<td><s:property value="quantity" /></td>
					<td><s:property value="Product.price" /></td>
					<td><s:url var="urlDel" action="shopping">
							<s:param name="deleteId">
								<s:property value="Product.productId" />
							</s:param>
						</s:url> <a href='<s:property value="#urlDel"/>'><button>DELETE</button></a></td>

				</tr>
			</s:iterator>

		</table>
		<s:form action="shopping">
			<s:hidden name="checkOutOperation" value="true"></s:hidden>
			<s:submit value="checkout" id="submit" labelposition="right"></s:submit>
		</s:form>

		your final total is:
		<s:property value="checkOutPrice" />
	</center>
</body>
</html>