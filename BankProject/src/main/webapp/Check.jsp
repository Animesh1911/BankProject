<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CHECK BALANCE</title>
</head>
<body>
	<h1>CHECK</h1>
	<br>
	<h3><a href="Home.jsp">HOME</a></h3>
	<br>
	<br>
	<form action="/Check" method="post">
		<label for="accNum">Account Number:</label>
		<input type="text" name="aNum">
		<br>
 		<input type="submit" value="Submit">
	</form>
	<br>
	<br>
	<h3>${Output}</h3>
</body>
</html>