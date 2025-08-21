<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SignUpSuccess</title>
</head>
<body>

<c:choose>
    <c:when test="${result==null}">
        <p class="text-warning">Invalid Credentials</p>
    </c:when>
</c:choose>
</body>
</html>