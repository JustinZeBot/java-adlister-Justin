<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products list</title>
</head>
<body>

<form method="POST" action="/products">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" />
    <label for="description">Description:</label>
    <input type="text"  name="description" id="description" />
    <label for="price">Price:</label>
    <input type="number"  name="price" id="price" />

    <button type="submit">Submit!</button>
</form>




<c:forEach var="product" items="${products}">
    <div class="product">
        <h2>${product.name}</h2>
        <p>Description: ${product.description}</p>
        <p>Price: $ ${product.priceInCents}</p>
    </div>
</c:forEach>

</body>
</html>
