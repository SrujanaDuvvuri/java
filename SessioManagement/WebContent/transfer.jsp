<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer</title>
</head>
<body>
<h1 align="center">Transfer Payee</h1>
<div align="center">
<form action="transfer" method="post">
	<table>
	<tr>
		<td><label>Enter Amount</label>
		<input type="text" name="amt"></td>
	</tr>
	<tr>
		<td><label>Enter OTP</label>
		<input type="text" name="otp"></td>
	</tr>
	<tr>
	<td><input type="submit" value="CONFIRM"></td>
	</tr>
	</table>

</form>
</div>
</body>
</html>