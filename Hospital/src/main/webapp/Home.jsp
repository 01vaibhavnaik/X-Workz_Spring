<html>
<head>
    <meta charset="UTF-8">
    <title>Navbar with Sidebar</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="text-dark"
      style="background: url('img_2.png') no-repeat center center fixed;
             background-size: cover;">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
    <div class="container-fluid px-4">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="img_1.png" alt="Logo" width="100" height="35" class="me-2">
            <span class="fw-bold">MediCare Hospital</span>
        </a>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="d-flex gap-2">
                <a href="DoctorInfo.jsp" class="btn btn-light btn-sm">Profile</a>
            </div>
        </div>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">

        <div class="col-12 col-md-3 col-lg-2 bg-primary bg-opacity-10 min-vh-100 p-3">
            <h5 class="text-primary fw-bold mb-4">Menu</h5>
            <ul class="nav flex-column">
                <li class="nav-item mb-2">
                    <a class="nav-link text-dark text-center fw-semibold bg-light" href="DoctorInfo.jsp">Doctor
                    </a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-dark text-center fw-semibold bg-light" href="viewdetail">View
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-12 col-md-9 col-lg-10 d-flex flex-column align-items-center justify-content-center py-5">
            <h1 class="text-primary fw-bold">Welcome</h1>
            <p class="lead text-secondary">Caring for you with compassion and excellence.</p>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
