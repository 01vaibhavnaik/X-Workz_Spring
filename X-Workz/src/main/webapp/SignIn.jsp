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
<body class="bg-dark text-white">


<nav class="navbar navbar-expand-lg bg-dark bg-opacity-75 shadow-sm sticky-top">
    <div class="container justify-content-center">
        <a class="navbar-brand text-light  fw-bold" href="index.jsp">
            <i class="fa fa-home me-2"></i> Home
        </a>
    </div>
</nav>

<div class="d-flex justify-content-center align-items-center min-vh-100">
    <div class="card shadow-lg border-0 rounded-4 bg-dark bg-opacity-75 text-light p-4" style="max-width: 420px; width: 100%;">
        <h2 class="text-center fw-bold mb-4">Log In</h2>


        <form action="signin" method="get" >
            <div class="mb-3">
                <label for="emailId" class="form-label">Email address</label>
                <input type="email" class="form-control" id="emailId" name="email"
                       oninput="validateEmail()" placeholder="Enter your email" required>
                <span id="emailErrorId" class="text-danger small"></span>
            </div>


            <div class="mb-3">
                <label for="passwordId" class="form-label">Password</label>
                <div class="input-group">
                    <input type="password" class="form-control" id="passwordId" name="password"
                           oninput="validatePassword()" placeholder="Enter your password" required>
                    <button class="btn btn-outline-secondary" type="button" onclick="passwordToggle()">
                        <i class="fa fa-eye"></i>
                    </button>
                </div>
                <span id="passwordErrorId" class="text-danger small"></span>
                <div class="mt-2">
                    <a href="ForgotPassword.jsp" class="text-decoration-none small text-info">Forgot Password?</a>
                </div>
            </div>

            <div class="form-check mb-3">
                <input type="checkbox" class="form-check-input" id="rememberId" name="remember">
                <label class="form-check-label" for="rememberId">Remember me</label>
            </div>


            <div class="d-grid">
                <button type="submit" class="btn btn-danger btn-lg fw-semibold">Log In</button>
            </div>
        </form>


        <div class="text-center mt-4">
            <small>Dont have an account? <a href="SignUp.jsp" class="text-warning text-decoration-none fw-semibold">Sign Up</a></small>
        </div>
        <c:if test="${not empty result}">
            <div class="alert alert-warning mt-3 text-center p-1">${result}</div>
        </c:if>
    </div>
</div>

<script src="signUp.js"></script>
</body>
</html>
