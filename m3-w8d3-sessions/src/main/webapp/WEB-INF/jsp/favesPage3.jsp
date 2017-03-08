<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your favorite season</title>
</head>
<body>
	<h1>Favorite Things Exercise</h1>
	<h3>What is your favorite season?</h3>
	
	<c:url var="formAction" value ="/favesPage3" />
	<form action="${formAction}" method ="POST">
		<input type="radio" name="faveSeason" value="Winter" >Winter<br>
		<input type="radio" name="faveSeason" value="Spring" >Spring<br>
		<input type="radio" name="faveSeason" value="Summer" >Summer<br>
		<input type="radio" name="faveSeason" value="Fall" >Fall<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>