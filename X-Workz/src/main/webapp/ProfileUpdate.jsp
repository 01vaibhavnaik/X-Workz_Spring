<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
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
                <a class="nav-link text-light text-decoration-none" href="Home.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow p-4 border rounded border-secondary bg-transparent "
         style="width: 100%; max-width: 800px;">
        <c:if test="not empty userSigInData">
            <p class="text-success">${userSigInData}</p>
        </c:if>
        <h3 class="text-center fst-italic text-light mb-4">Update Profile</h3>

        <form action="updateprofile" method="POST"  >
            <div class="mb-3">
                <label for="nameId" class="form-label text-light">Full Name</label>
                <input type="text" minlength="0" maxlength="25" class="form-control" oninput="validateName()" id="nameId" name="name" value="${dto.name}" required
                       placeholder="Enter your name">
                <span id="nameErrorId" class="text-danger"></span>
            </div>


            <div class="mb-3">
                <label for="emailId" class="form-label text-light">Email Address</label>
                <input type="email" class="form-control" oninput="validateEmail()" id="emailId" name="email" value="${dto.email}" readonly
                       placeholder="Enter your email">

            </div>
            <div class="mb-3">
                <label for="ageId" class="form-label text-light">Age</label>
                <input type="number" min="1" max="60" class="form-control" oninput="validateAge()" id="ageId" name="age" value="${dto.age}" required
                       placeholder="Enter your Age">
                <span id="ageError" class="text-danger"></span>
            </div>
            <div class="mb-3">
                <label for="genderId" class="form-label text-light">Gender</label>
                <select class="form-select "  onchange="validateGender()" name="gender" id="genderId" value="${dto.gender}"  readonly >
                    <option selected disabled value="${dto.gender}">${dto.gender}</option>
                </select>
                <input type="hidden" name="gender" value="${dto.gender}">
            </div>
            <div class="mb-3">
                <label for="addressId" class="form-label text-light">Address</label>
                <input type="text" class="form-control" id="addressId" name="address" value="${dto.address}" required
                       placeholder="Enter your name">
            </div>

            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="termsId" required>
                <label class="form-check-label text-light" for="termsId">I agree to the terms & conditions</label>
            </div>
            <div class="d-grid ">
                <button type="submit" class="btn btn btn-success">Update </button>
            </div>

        </form>
    </div>

</div>

</body>
<script src="signUp.js"></script>
</html>