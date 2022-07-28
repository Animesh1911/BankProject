<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OPEN AN ACCOUNT</title>
</head>
<body>
	<h1>OPEN</h1>
	<br>
	<h3><a href="Home.jsp">HOME</a></h3>
	<br>
	<br>
	<form action="/Open" method="post">
		<label>Enter Name:</label>
		<input type="text" name="cName"><br>
		<label>Enter First Deposit Amount:</label>
		<input type="text" name="bal"><br>
 		<input type="submit" value="Submit">
	</form>
	<br>
	<br>
	<h3>${Output}.</h3>
	
</body>
</html>