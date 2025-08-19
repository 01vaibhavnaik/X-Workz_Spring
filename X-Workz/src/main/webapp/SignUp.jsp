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
    <div class="card shadow p-4 border rounded border-secondary bg-transparent "
         style="width: 100%; max-width: 800px;">
        <h3 class="text-center fst-italic text-light mb-4">Sign Up</h3>

        <form action="signup" method="POST"  >
            <div class="mb-3">
                <label for="nameId" class="form-label text-light">Full Name</label>
                <input type="text" class="form-control" oninput="validateName()" id="nameId" name="name" required
                       placeholder="Enter your name">
                <span id="nameErrorId" class="text-danger"></span>
            </div>

            <div class="mb-3">
                <label for="emailId" class="form-label text-light">Email Address</label>
                <input type="email" class="form-control" oninput="validateEmail()" id="emailId" name="email" required
                       placeholder="Enter your email">
                <span id="emailErrorId" class="text-danger"></span>
            </div>
            <div class="mb-3">
                <label for="ageId" class="form-label text-light">Age</label>
                <input type="number" class="form-control" oninput="validateAge()" id="ageId" name="age" required
                       placeholder="Enter your Age">
                <span id="ageError" class="text-danger"></span>
            </div>
            <div class="mb-3">
                <label for="genderId" class="form-label">Gender</label>
                <select class="form-select" aria-label="Default select example" onchange="validateGender()" name="gender" id="genderId" required>
                    <option selected>Select Gender</option>
                    <option value="m">Male</option>
                    <option value="f">Female</option>
                    <option value="o">Other</option>
                </select>
                <span class="text-danger" id="genderErrorId"></span>

            </div>
            <div class="mb-3">
                <label for="addressId" class="form-label text-light">Address</label>
                <input type="text" class="form-control" id="addressId" name="address" required
                       placeholder="Enter your name">
            </div>
            <div class="mb-3 position-relative">
                <label for="passwordId" class="form-label" >Password</label>
                <div class="input-group">
                    <input type="password" class="form-control" oninput="validatePassword()" name="password" id="passwordId" required  placeholder="Enter the password">
                    <button type="button" onclick="passwordToggle()">
                        <i class="fa fa-eye"></i>
                    </button>
                </div>
                <span id="passwordErrorId" class="text-danger"></span>
            </div>

                <div class="mb-3 position-relative">
                    <label for="confirmId" class="form-label text-light">Confirm Password</label>
                    <div class="input-group">
                        <input type="password" class="form-control" oninput="validateCPassword()" id="confirmId" name="confirm" required
                               placeholder="Re-enter password">
                        <button type="button" onclick="CpasswordToggle()">
                            <i class="fa fa-eye"></i>
                        </button>
                    </div>
                    <span id="CpasswordErrorId" class="text-danger"></span>
                </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="termsId" required>
                <label class="form-check-label text-light" for="termsId">I agree to the terms & conditions</label>
            </div>
            <div class="d-grid ">
                <button type="submit" class="btn btn-outline-danger">Create Account</button>
            </div>

        </form>
        <div class="text-center text-light mt-3">
            <small>Already have an account? <a class="text-danger" href="SignIn.jsp">Log In</a></small>
        </div>
    </div>

</div>
<div>
    <c:if test="${not empty errors}">
        <c:forEach var="error" items="${errors}">
            <p>${error.defaultMessage}</p>
        </c:forEach>
    </c:if>
</div>
</body>
<script src="signUp.js"></script>
</html>