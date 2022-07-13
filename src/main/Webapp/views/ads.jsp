<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Ads!!!</h1>

<c:forEach items="${ads == }" var="ad">
    <div>
        <h3>${ad.name}</h3>
        <p>${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>