<html>
<head>
    <meta charset="UTF-8">
    <title>Navbar</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-dark text-white">


<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
    <div class="container-fluid px-4">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="image/logo.png" alt="Logo" width="100" height="35" class="me-2">
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="d-flex gap-2">
                <a href="SignIn.jsp" class="btn btn-outline-danger">Sign In</a>
                <a href="SignUp.jsp" class="btn btn-outline-danger">Sign Up</a>
            </div>
        </div>
    </div>
</nav>
</body>
</html>
