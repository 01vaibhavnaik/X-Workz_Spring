<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Log In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body class="text-dark"
      style="background: url('img.png') no-repeat center center fixed;
             background-size: cover;">
<nav class="navbar navbar-expand-lg bg-transparent bg-opacity-75 shadow-sm sticky-top">
    <div class="container justify-content-center">
        <a class="navbar-brand text-light fw-bold" href="index.jsp">
            <i class="fa fa-home me-2"></i> Home </a>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center   min-vh-100 ">
    <div class="card shadow-lg border-0 rounded-4 bg-white text-dark p-4 bg-transparent" style="max-width: 420px; width: 100%;">
        <h2 class="text-center fw-bold text-primary mb-4">LOG IN</h2>

        <form action="signin" method="get">
            <div class="mb-3">
                <label for="emailId" class="form-label">Email address</label>
                <input type="email" class="form-control" id="emailId" name="email"
                       oninput="validateEmail()" onchange="checkEmail()" placeholder="Enter your email" required>
                <span id="emailErrorId" class="text-danger small"></span>
            </div>
            <div class="form-check mb-3">
                <input type="checkbox" class="form-check-input" id="rememberId" name="remember">
                <label class="form-check-label" for="rememberId">Remember me</label>
            </div>

            <div class="d-grid">
                <button formaction="sendotp" class="btn btn-success btn-lg fw-semibold">Send OTP</button>
            </div>
        </form>

        <c:if test="${not empty result}">
            <div class="alert alert-warning mt-3 text-center p-1">${result}</div>
        </c:if>
    </div>
</div>
<script src="index.js"></script>
</body>
</html>
<!--<span id="OTPErrorId" class="text-danger small"></span>-->