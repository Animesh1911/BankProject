<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WITHDRAW MONEY</title>
</head>
<body>
	<h1>WITHDRAW</h1>
	<br>
	<h3><a href="Home.jsp">HOME</a></h3>
	<br>
	<br>
	<form action="/Withdraw" method="post">
		<label for="accNum">Account Number:</label>
		<input type="text" name="aNum"><br>
		<label for="">Enter Withdrawal Amount:</label>
		<input type="text" name="Bal"><br>
 		<input type="submit" value="Submit">
	</form>
	<br>
	<br>
	<h3>${Output}</h3>
	
</body>
</html>