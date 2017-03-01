<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			  
		 <c:set var = "fib1" value = "0"></c:set> 
		 <c:set var = "fib2" value = "1"></c:set> 
		 <c:set var="count" value="0" ></c:set> 
		 
		<c:forEach begin="1" end="${count=26}" var="count">
			<c:set var = "fib1" value="${fib2}"></c:set>
			<c:set var = "fib2" value="${fib}"></c:set>
 			<c:set var = "fib" value ="${fib1 + fib2}" ></c:set>
 			<li>${fib}</li> 
			<c:set var="count" value="${count + 1}"></c:set> 

		</c:forEach>	 
		</ul>
	</body>
</html>