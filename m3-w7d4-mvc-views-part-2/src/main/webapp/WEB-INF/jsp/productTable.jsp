<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product Table View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li><a href="#">List Layout</a></li>
			<li><a href="#">Tile Layout</a></li>
			<li><a href="#">Table Layout</a></li>
		</ul>

	</nav>
	<section id="main-content">
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
					<td>${product.name }</td>

				</c:forEach>
			</tr>
			<tr>
				<td class="firstCol">Rating</td>
				<c:forEach var="product" items="${requestScope.productList }">
					<c:choose>
						<c:when test="${product.averageRating >4.5}">
							<td><img src="img/5-star.png" height="10" width="32"></td>
						</c:when>
						<c:when test="${product.averageRating > 3.5}">
							<td><img src="img/4-star.png" height="10" width="32"></td>
						</c:when>
						<c:when test="${product.averageRating > 2.5}">
							<td><img src="img/3-star.png" height="10" width="32"></td>
						</c:when>
						<c:when test="${product.averageRating > 1}">
							<td><img src="img/2-star.png" height="10" width="32"></td>
						</c:when>
						<c:otherwise>
							<td><img src="img/1-star.png" height="10" width="32"></td>
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
					<td id="weight"><strong>${product.weightInLbs }
						lbs</td>
				</c:forEach>
			</tr>

		</table>
	</section>
</body>
</html>