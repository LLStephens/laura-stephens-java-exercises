<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product List View</title>
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

		<c:forEach var="product" items="${requestScope.productList }">
 			<div id="rows"><image id="images" src="img/${product.imageName }"></div>

		<div>
			<p>${product.name }</p>
			<p id = "mfg" >by ${product.manufacturer }</p>
			<p id = "price">$${product.price }</p>
			<p id = "weight"><strong>Weight</strong> ${product.weightInLbs } lbs</p>
			<c:choose>
				<c:when test="${product.averageRating >4.5}">
					<img src="img/5-star.png" height="20" width="92">
				</c:when>
				<c:when test="${product.averageRating > 3.5}">
					<img src="img/4-star.png" height="20" width="92">
				</c:when>
				<c:when test="${product.averageRating > 2.5}">
					<img src="img/3-star.png" height="20" width="92">
				</c:when>
				<c:when test="${product.averageRating > 1.5}">
					<img src="img/2-star.png" height="20" width="92">
				</c:when>
				<c:otherwise>
					<img src="img/1-star.png" height="20" width="92">
				</c:otherwise>
			</c:choose>
			</div>
			<hr width="90%">
		</c:forEach>

	</section>
</body>
</html>
