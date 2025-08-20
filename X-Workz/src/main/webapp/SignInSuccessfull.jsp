<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SignUpSuccess</title>
</head>
<body>
<p>Result = ${result}</p>
<c:choose>
    <c:when test="${results}">
        <p class="text-success">Not Update</p>
    </c:when>
    <c:otherwise>
        <p class="text-warning">Update</p>
    </c:otherwise>
</c:choose>
</body>
</html>