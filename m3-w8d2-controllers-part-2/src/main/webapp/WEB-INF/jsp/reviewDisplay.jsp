<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<h2>Reviews-</h2>
<a href = "reviewInput" >Post a review</a>
<hr></hr>

<c:forEach var="review" items="${reviews}">

	 <p><strong><c:out value="${review.title}" /></strong> (<c:out value="${review.username}" />)</p>
	 <p><c:out value="${review.dateSubmitted}" /></p>
	 <c:choose>
	 	<c:when test="${review.rating > 5}" >
	 		<img src="img/5-star.png" height="25" width="100"/>
	 	</c:when>
	 	<c:when test="${review.rating > 4}" >
	 		<img src="img/4-star.png" height="25" width="100"/>
	 	</c:when>
	 	<c:when test="${review.rating > 3}" >
	 		<img src="img/3-star.png" height="25" width="100"/>
	 	</c:when>
	 	<c:when test="${review.rating > 2}" >
	 		<img src="img/2-star.png" height="25" width="100"/>
	 	</c:when>
	 	<c:when test="${review.rating > 1}" >
	 		<img src="img/1-star.png" height="25" width="100"/>
	 	</c:when>
	 </c:choose>
	 <p><c:out value="${review.text}" /></p>
<hr></hr>
 </c:forEach>

</body>
</html>