<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-dark text-white">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
    <div class="container-fluid px-4">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="image/logo.png" alt="Logo" width="100" height="35" class="me-2">
        </a>
        <div class="ms-auto">
            <a href="userdetail" class="btn btn-outline-danger">Profile</a>
        </div>
    </div>
</nav>


<div class="container mt-5">

    <c:choose>

        <c:when test="${result eq 'fail'}">
            <div class="alert alert-danger text-center fw-bold shadow-sm rounded-3">
                ❌ Login Failed! Please try again.
            </div>
        </c:when>


        <c:otherwise>
            <div class="card text-center shadow-lg border-0 rounded-4 overflow-hidden">

                <div class="p-5" style="background: linear-gradient(135deg, #ff416c, #ff4b2b);">
                    <h1 class="display-5 fw-bold text-white mb-3">
                        Hi, ${results.name}!
                    </h1>
                    <p class="lead text-white-50 mb-4">
                        Welcome back to your dashboard.
                    </p>

                </div>
            </div>
        </c:otherwise>
    </c:choose>

</div>

</body>
</html>
