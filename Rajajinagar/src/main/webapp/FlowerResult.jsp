<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Flower</title>
</head>
<body>
<h1>Flower</h1>
<h5>${flowerdto.flowername}</h5>
<h5>${flowerdto.flowerprice}</h5>
<h5>${flowerdto.flowercolor}</h5>

<c:forEach var="error" items="${flowererrors}">
    <p>${error.defaultMessage}</p>
</c:forEach>

</body>
</html>