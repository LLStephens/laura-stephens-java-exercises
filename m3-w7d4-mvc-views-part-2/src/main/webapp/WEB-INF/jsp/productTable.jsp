<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name="currentPage" value="productTable" />
</jsp:include>


<p id="title">Toy Department</p>
<table>
	<tr>
		<td></td>
		<c:forEach var="product" items="${requestScope.productList }">
			<td><image id="table-images" src="img/${product.imageName }"></td>
		</c:forEach>
	</tr>
	<tr>
		<td class="firstCol">Name</td>
		<c:forEach var="product" items="${requestScope.productList }">
			<c:url var="detailsURL" value="/productDetail">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<td><a class="product" href="${detailsURL}">${product.name }</a></td>

		</c:forEach>
	</tr>
	<tr>
		<td class="firstCol">Rating</td>
		<c:forEach var="product" items="${requestScope.productList }">
			<c:choose>
				<c:when test="${product.averageRating >4.5}">
					<td><img id="table-star" src="img/5-star.png"></td>
				</c:when>
				<c:when test="${product.averageRating > 3.5}">
					<td><img id="table-star" src="img/4-star.png"></td>
				</c:when>
				<c:when test="${product.averageRating > 2.5}">
					<td><img id="table-star" src="img/3-star.png"></td>
				</c:when>
				<c:when test="${product.averageRating > 1}">
					<td><img id="table-star" src="img/2-star.png"></td>
				</c:when>
				<c:otherwise>
					<td><img id="table-star" src="img/1-star.png"></td>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</tr>
	<tr>
		<td class="firstCol">Mfr</td>
		<c:forEach var="product" items="${requestScope.productList }">
			<td id="mfg">by ${product.manufacturer }</td>
		</c:forEach>
	</tr>
	<tr>
		<td class="firstCol">Price</td>
		<c:forEach var="product" items="${requestScope.productList }">
			<td id="price">$${product.price }</td>
		</c:forEach>
	</tr>
	<tr>
		<td class="firstCol">Weight</td>
		<c:forEach var="product" items="${requestScope.productList }">
			<td id="weight"><strong>${product.weightInLbs } lbs</td>
		</c:forEach>
	</tr>

</table>
<jsp:include page="footer.jsp" />