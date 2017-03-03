<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name = "currentPage" value= "productTile"/>
</jsp:include>

		<p id="title">Toy Department</p>

		<c:forEach var="product" items="${productList}">
			<div id="groups"><image id="images" src="img/${product.imageName }">
			<c:url var="detailsURL" value="/productDetail">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<p><a class="product" href="${detailsURL}" >${product.name }</a></p>

			<p id = "mfg" >by ${product.manufacturer }</p>
			<p id = "price">$${product.price }</p>
			<p id = "weight"><strong>Weight</strong> ${product.weightInLbs } lbs</p>
			<c:choose>
				<c:when test="${product.averageRating >4.5}">
					<img id="tile-star" src="img/5-star.png">
				</c:when>
				<c:when test="${product.averageRating > 3.5}">
					<img id="tile-star" src="img/4-star.png">
				</c:when>
				<c:when test="${product.averageRating > 2.5}">
					<img id="tile-star" src="img/3-star.png">
				</c:when>
				<c:when test="${product.averageRating > 1}">
					<img id="tile-star" src="img/2-star.png">
				</c:when>
				<c:otherwise>
					<img id="tile-star" src="img/1-star.png">
				</c:otherwise>
			</c:choose>
			</div>
		</c:forEach>

<jsp:include page="footer.jsp" />
