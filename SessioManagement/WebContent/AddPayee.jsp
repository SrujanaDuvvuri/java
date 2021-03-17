<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Add Payee</h2>
	<div align="center">
		<form action="addPayeeServlet" method="post">
			<table>
				<tr>
					<td><label>Payee Name</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Account no</label></td>
					<td><input type="text" name="accno"></td>
				</tr>
				<tr>
					<td><label>Branch Name</label></td>
					<td><input type="text" name="bname"></td>
				</tr>
				<tr>
					<td><input type="submit" value="ADD PAYEE"></td>
				</tr>
			</table>
		</form>

	</div>

</body>
</html>