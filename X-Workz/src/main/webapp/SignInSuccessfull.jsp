<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SignUpSuccess</title>
</head>
<body>
<c:if test="${not empty success}">
    <c:choose>
        <c:when test="${success==true}">
            <p class="text-success">Login Sucessfull</p>
        </c:when>
        <c:otherwise>
            <p class="text-warning">Invalid Credentials</p>
        </c:otherwise>
    </c:choose>
</c:if>
</body>
</html>