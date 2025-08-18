<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Bag</title>
</head>
<body>
<h1>Flower</h1>
<h5>${bagdto.bagname}</h5>
<h5>${bagdto.bagprice}</h5>
<h5>${bagdto.bagcolor}</h5>

<c:forEach var="error" items="${errors}">
    <p>${error.defaultMessage}</p>
</c:forEach>

</body>
</html>