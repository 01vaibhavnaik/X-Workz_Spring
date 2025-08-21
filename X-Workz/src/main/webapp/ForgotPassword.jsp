<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <title>Log In</title>
</head>
<body class="bg-dark text-white">
<nav class="navbar navbar-expand-lg bg-dark bg-opacity-50 shadow position-sticky top-0 z-3 backdrop-blur">
    <div class="container-fluid">
        <ul class="nav mx-auto">
            <li class="nav-item">
                <a class="nav-link text-light text-decoration-none" href="index.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow p-4 border rounded  bg-transparent "
         style="width: 100%; max-width: 400px;">
        <h3 class="text-center fst-italic text-light mb-4">Update Password</h3>

        <form action="forgotpass" method="get">
            <div class="mb-3">
                <label for="emailId" class="form-label text-light">Your Email </label>
                <input type="email" class="form-control" id="emailId" name="email" required
                       placeholder="Enter your email">
            </div>
            <div class="mb-3 position-relative">
                <label for="passwordId" class="form-label text-light" >New Password</label>
                <div class="input-group">
                    <input type="password" class="form-control" name="password" id="passwordId" required  placeholder="Enter the password">
                    <button type="button" onclick="passwordToggle()">
                        <i class="fa fa-eye"></i>
                    </button>
                </div>

            </div>
            <div class="d-grid ">
                <button type="submit" class="btn btn btn-success ">Update</button>
            </div>
        </form>
    </div>
</div>


</body>
<script src="signUp.js"></script>
</html>