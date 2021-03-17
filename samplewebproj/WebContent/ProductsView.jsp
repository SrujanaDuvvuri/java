<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
</head>
<body>
	<h2 align='center'>Product Records</h2>
	<div align=center>
		<table border=2>
			<tr>
				<th>ProductId</th>
				<th>Name</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
			<c:forEach items="${productsList}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.description}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>