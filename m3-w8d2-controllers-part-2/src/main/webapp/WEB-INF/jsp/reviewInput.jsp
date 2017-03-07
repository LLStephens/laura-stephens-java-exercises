<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="site.css"></link>
	</head>
<body>
		<div id="main_content">
			<h1>Review</h1>
			<c:url var="formAction" value= "/reviewInput" />
			<form method="POST" action="${formAction}">
				<div class="formGroup">		
					<label for="reviewTitle">Review title: </label>
					<input type="text" name="title" id="reviewTitle" />
				</div>
				<div class="formGroup">
					<label for="username">Username: </label>
					<input type="text" name="username" id="username" />
				</div>
				<div class="formGroup">
					<label for="rating">Rating: </label>
					<input type="text" name="rating" id="rating" />
				</div>		
				<div class="formGroup">		
					<label for="reviewText">Review text: </label>
					<input type="text" name="text" id="text" />
				</div>
	
				<div class="formGroup">
					<input type="submit" value="Review" />
				</div>		
			</form>
		</div>

</body>
</html>