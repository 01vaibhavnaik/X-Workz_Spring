<html>
<head>
    <meta charset="UTF-8">
    <title>Navbar</title>

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

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="d-flex gap-2">
                <a href="OTP.jsp" class="btn btn-success">Admin LogIn</a>
            </div>
        </div>
    </div>
</nav>
<div class="container text-center py-5">
    <h1 class="text-primary">Welcome to MediCare Hospital</h1>
    <p class="lead text-secondary">Caring for you with compassion and excellence.</p>
</div>
</body>
</html>

