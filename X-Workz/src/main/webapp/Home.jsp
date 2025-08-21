<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-dark text-white">
<nav class="navbar navbar-expand-lg shadow bg-dark">
    <div class="container ms-4">
        <a class="navbar-brand text-white" href="#">
            <img src="image/logo.png" alt="Logo" width="100" height="35">
        </a>
    </div>
    <div class="me-4">
        <a href="userdetail" class="btn btn-outline-danger">Profile</a>
    </div>
</nav>

<div class="container mt-5">
    <c:choose>
        <c:when test="${result eq 'fail'}">
            <div class="alert alert-danger text-center fw-bold">
                Login Failed! Please try again.
            </div>
        </c:when>
        <c:otherwise>
            <div class="card text-center bg-gradient p-5 shadow-lg rounded-4" style="background: linear-gradient(135deg, #ff416c, #ff4b2b);">
                <h1 class="display-5 fw-bold text-white">
                    Hi, ${results.name}!
                </h1>
                <p class="lead text-white-50">
                    Welcome back to your dashboard.
                </p>
                <a href="" class="btn btn-light btn-lg mt-3 rounded-pill px-4">Go to Dashboard</a>
            </div>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
