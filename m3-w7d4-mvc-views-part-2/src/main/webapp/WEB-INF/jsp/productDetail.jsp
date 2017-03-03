<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name="currentPage" value="productList" />
</jsp:include>

	<div id="image-block">
		<img id="details-images" src="img/${product.imageName}" />
	</div>
	
	<div class="details-body">
	
	<p>${product.name}</p>
	<p>by ${product.manufacturer}</p>
	<c:choose>
		<c:when test="${product.averageRating >4.5}">
			<img id="details-star" src="img/5-star.png">
		</c:when>
		<c:when test="${product.averageRating > 3.5}">
			<img id="details-star" src="img/4-star.png">
		</c:when>
		<c:when test="${product.averageRating > 2.5}">
			<img id="details-star" src="img/3-star.png">
		</c:when>
		<c:when test="${product.averageRating > 1.5}">
			<img id="details-star" src="img/2-star.png">
		</c:when>
		<c:otherwise>
			<img id="details-star" src="img/1-star.png">
		</c:otherwise>
	</c:choose>
	<p>Price: ${product.price}</p>
	<p>
		<strong>Weight:</strong> ${product.price} lbs
	</p>
	<p>Description: ${product.description}</p>
	</div>

<jsp:include page="footer.jsp" />