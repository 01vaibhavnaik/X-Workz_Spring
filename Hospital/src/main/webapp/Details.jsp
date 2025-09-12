<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Doctor Details</title>
</head>
<body>
<h1>Doctor List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Profile</th>
    </tr>
    <c:forEach var="doctor" items="${show}">
        <tr>
            <td>${doctor.docid}</td>
            <td>${doctor.name}</td>
            <td>${doctor.email}</td>
            <td>
                <img src="download?fileName=${doctor.profile}" width="100" height="100">            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

