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

<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
    <div class="container-fluid px-4">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="img_1.png" alt="Logo" width="100" height="35" class="me-2">
            <span class="fw-bold">MediCare Hospital</span>
        </a>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="d-flex gap-2">
                <a href="DoctorInfo.jsp" class="btn btn-success">Profile</a>
            </div>
        </div>
    </div>
</nav>


<div class="container-fluid">
    <div class="row">
        <div class="col-3 col-md-2 bg-primary bg-opacity-10 text-white min-vh-100 p-3">
            <h5 class="mb-3">Menu</h5>
            <ul class="nav flex-column">
                <li class="nav-item">
                    <a class="nav-link text-white fw-bold" href="DoctorInfo.jsp">Doctor</a>
                    <a class="nav-link text-white fw-bold" href="viewdetail">View</a>
                </li>
            </ul>
        </div>

        <div class="col-9 col-md-10 text-center py-5">
            <h1 class="text-primary">Welcome</h1>
            <p class="lead text-secondary">Caring for you with compassion and excellence.</p>
        </div>
    </div>
</div>

</body>
</html>
