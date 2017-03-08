<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your favorite food</title>
</head>
<body>
	<h1>Favorite Things Exercise</h1>
	<h3>What is your favorite food?</h3>
	
	<c:url var="formAction" value ="/favesPage2" />
	<form action="${formAction}" method ="POST">
		<input type="text" name="faveFood" id="faveFood" >
		<input type="submit" value="Next >>">
	</form>
</body>
</html>