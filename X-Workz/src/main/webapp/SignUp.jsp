<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-dark text-white">

<nav class="navbar navbar-expand-lg bg-dark bg-opacity-75 shadow-sm sticky-top">
    <div class="container justify-content-center">
        <a class="navbar-brand text-light fw-bold" href="index.jsp">
            <i class="fa fa-home me-2"></i> Home
        </a>
    </div>
</nav>


<div class="d-flex justify-content-center align-items-center min-vh-100">
    <div class="card shadow-lg border-0 rounded-4 bg-dark bg-opacity-75 text-light p-4" style="max-width: 700px; width: 100%;">
        <h2 class="text-center fw-bold mb-4">Create Account</h2>


        <form action="signup" method="POST" >

            <div class="mb-3">
                <label for="nameId" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="nameId" name="name"
                       oninput="validateName()" placeholder="Enter your full name" required>
                <span id="nameErrorId" class="text-danger small"></span>
            </div>

            <div class="mb-3">
                <label for="emailId" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="emailId" name="email"
                       oninput="validateEmail()" placeholder="Enter your email" required>
                <span id="emailErrorId" class="text-danger small"></span>
            </div>


            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="ageId" class="form-label">Age</label>
                    <input type="number" class="form-control" id="ageId" name="age"
                           oninput="validateAge()" placeholder="Enter your age" required>
                    <span id="ageError" class="text-danger small"></span>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="genderId" class="form-label">Gender</label>
                    <select class="form-select" id="genderId" name="gender" onchange="validateGender()" required>
                        <option selected disabled>Select Gender</option>
                        <option value="m">Male</option>
                        <option value="f">Female</option>
                        <option value="o">Other</option>
                    </select>
                    <span id="genderErrorId" class="text-danger small"></span>
                </div>
            </div>


            <div class="mb-3">
                <label for="addressId" class="form-label">Address</label>
                <input type="text" class="form-control" id="addressId" name="address"
                       placeholder="Enter your address" required>
            </div>

            <div class="mb-3">
                <label for="passwordId" class="form-label">Password</label>
                <div class="input-group">
                    <input type="password" class="form-control" id="passwordId" name="password"
                           oninput="validatePassword()" placeholder="Enter password" required>
                    <button class="btn btn-outline-secondary" type="button" onclick="passwordToggle()">
                        <i class="fa fa-eye"></i>
                    </button>
                </div>
                <span id="passwordErrorId" class="text-danger small"></span>
            </div>


            <div class="mb-3">
                <label for="confirmId" class="form-label">Confirm Password</label>
                <div class="input-group">
                    <input type="password" class="form-control" id="confirmId" name="confirm"
                           oninput="validateCPassword()" placeholder="Re-enter password" required>
                    <button class="btn btn-outline-secondary" type="button" onclick="CpasswordToggle()">
                        <i class="fa fa-eye"></i>
                    </button>
                </div>
                <span id="CpasswordErrorId" class="text-danger small"></span>
            </div>

            <div class="form-check mb-3">
                <input type="checkbox" class="form-check-input" id="termsId" required>
                <label class="form-check-label" for="termsId">
                    I agree to the <a href="#" class="text-info text-decoration-none">Terms & Conditions</a>
                </label>
            </div>


            <div class="d-grid">
                <button type="submit" class="btn btn-danger btn-lg fw-semibold">Create Account</button>
            </div>
        </form>

        <div class="text-center mt-4">
            <small>Already have an account?
                <a href="SignIn.jsp" class="text-warning fw-semibold text-decoration-none">Log In</a>
            </small>
        </div>

    </div>
</div>

<script src="signUp.js"></script>
</body>
</html>
