<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Loan Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 class="mb-4 text-center">Loan Details</h1>
    <div class="table-responsive">
        <table class="table table-bordered table-striped table-hover">
            <thead class="table-dark">
            <tr>
                <th>Loan Type</th>
                <th>Full Name</th>
                <th>Age</th>
                <th>Email</th>
                <th>Address</th>
                <th>Income</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="dto" items="${loandto}">
                <tr>
                    <td>${dto.loantype}</td>
                    <td>${dto.name}</td>
                    <td>${dto.age}</td>
                    <td>${dto.email}</td>
                    <td>${dto.address}</td>
                    <td>${dto.income}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
