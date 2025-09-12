<html>
<head>
    <meta charset="UTF-8">
    <title>Navbar with Sidebar</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="text-dark"
      style="background: url('img_2.png') no-repeat center center fixed;
             background-size: cover;">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm fixed-top">
    <div class="container-fluid px-4">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="img_1.png" alt="Logo" width="100" height="35" class="me-2">
            <span class="fw-bold">MediCare Hospital</span>
        </a>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="d-flex gap-2">
                <a href="Home.jsp" class="btn btn-success">Home</a>
            </div>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center vh-100 pt-5">
    <div class="card shadow p-4 border rounded border-secondary bg-primary bg-opacity-10"
         style="width: 100%; max-width: 800px; margin-top: 80px;">
        <h3 class="text-center fst-italic text-light mb-4">Doctor Details</h3>
        <form action="doctordetails" method="POST"  >
            <div class="mb-3">
                <label for="docId" class="form-label text-dark">ID Number</label>
                <input type="text"  maxlength="6" class="form-control"  id="docId" name="docid"  required
                       placeholder="Enter your ID">
                <span id="docErrorId" class="text-danger"></span>
            </div>
            <div class="mb-3">
                <label for="nameId" class="form-label text-dark">Full Name</label>
                <input type="text" minlength="0" maxlength="25" class="form-control" oninput="validateName()" id="nameId" name="name" required
                       placeholder="Enter your name">
                <span id="nameErrorId" class="text-danger"></span>
            </div>

            <div class="mb-3">
                <label for="emailId" class="form-label text-dark">Email Address</label>
                <input type="email" class="form-control" oninput="validateEmail()" id="emailId" name="email"  required
                       placeholder="Enter your email">
            </div>
            <div class="mb-3">
                <label for="specialistId" class="form-label text-dark">Specialist</label>
                <input type="text" class="form-control" oninput="validateEmail()" id="specialistId" name="specialist"  required>
            </div>
            <div class="mb-3">
                <label for="ageId" class="form-label text-dark">Age</label>
                <input type="number" min="1" max="60" class="form-control" oninput="validateAge()" id="ageId" name="age" required
                       placeholder="Enter your Age">
                <span id="ageError" class="text-danger"></span>
            </div>

            <div class="mb-3">
                <label for="addressId" class="form-label text-dark">Address</label>
                <input type="text" class="form-control" id="addressId" name="address" required
                       placeholder="Enter your Address">
            </div>
            <br>
            <input type="file" id="image" value="choose profile">
            <br><br>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="termsId" required>
                <label class="form-check-label text-dark" for="termsId">I agree to the terms & conditions</label>
            </div>
            <div class="d-grid ">
                <button type="submit" class="btn btn btn-success">Update</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
