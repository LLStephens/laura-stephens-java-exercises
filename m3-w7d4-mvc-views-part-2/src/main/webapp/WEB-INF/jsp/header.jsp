<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />

<c:set var = "title" value = "${param.title}" />
<c:if test="${empty title }" >
	<c:set var = "title" value ="Product Page" />
</c:if>

<title>${title}</title>

<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<c:set var = "selected" value = ""/>
			<c:if test = "${param.currentPage == 'productList'}">
				<c:set var= "selected" value = "selected" />
			</c:if>
			
			<c:url var="listUrl" value = "/productList" /> 
			<li><a class = "${selected}" href="${listUrl}">Product List</a></li>
			
			<c:url var="tileUrl" value = "/productTiles" />
			<li><a href="${tileUrl}">Product Tile</a></li>
			
			<c:url var="tableUrl" value = "/productTable" />
			<li><a href="${tableUrl}">Product Table</a></li>
		</ul>

	</nav>
	<section id="main-content">