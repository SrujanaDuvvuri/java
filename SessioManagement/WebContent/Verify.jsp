<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer confirmation</title>
</head>
<body>
<h1 align="center">Payment done..</h1>
<div align="center">
<form action="updateserv" method="post">

<%
       String payee = request.getParameter("payee");
       String amt = request.getParameter("amt");
    %>
    <label>Amount transferred</label>
    <input type="text" name="amt" value=${sessionScope.amt}>
${sessionScope.amt}<br>
${sessionScope.payee.name}
<%
session.setAttribute("amt", amt);
%>
<input type="submit" value="SUBMIT">

</form>
</div>
</body>
</html>