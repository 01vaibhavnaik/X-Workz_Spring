<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
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
        <h3 class="text-center fst-italic text-light mb-4">Log In</h3>

        <form action="signin" method="get">
            <div class="mb-3">
                <label for="emailId" class="form-label text-light">Email address</label>
                <input type="email" class="form-control" id="emailId" name="email" required
                       placeholder="Enter your email">
            </div>
            <div class="mb-3">
                <label for="passwordId" class="form-label text-light">Password</label>
                <input type="password" class="form-control" id="passwordId" name="password" required
                       placeholder="Enter password">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="rememberId" name="remember">
                <label class="form-check-label text-light" for="rememberId">Remember me</label>
            </div>


            <div class="d-grid ">
                <button type="submit" class="btn btn-outline-danger ">Log In</button>
            </div>
        </form>

        <div class="text-center text-light mt-3">
            <small>Don't have an account? <a class="text-danger" href="SignUp.jsp">Sign Up </a></small>
        </div>
    </div>
</div>


</body>
</html>