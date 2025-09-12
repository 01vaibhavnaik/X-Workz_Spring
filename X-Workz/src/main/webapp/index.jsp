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
<div class="container mt-5">
    <div class="row align-items-center">
        <!-- Left Side Content -->
        <div class="col-lg-7 mb-4 mb-lg-0">
            <h2 class="fw-bold mb-3 text-warning">About Us</h2>
            <p class="lead text-light">
                We are professionals from the IT industry, having vast experience in development
                and training of <strong>JAVA</strong> and various <strong>UI related technologies</strong>.
            </p>
            <h4 class="fw-semibold text-danger mt-4">Enterprise Application Expertise Team</h4>
            <p>
                For over a decade, we have been training and placing students in leading organizations
                through various training institutes. We are pioneers in introducing innovative training
                models that emphasize not only theory but also <strong>practical implementations</strong>.
            </p>
            <p>
                Our focus is on delivering <strong>quality training</strong> in cutting-edge technologies
                that power real-world software solutions. We continuously evolve our methods to ensure
                learners are <em>job-ready and industry-relevant</em>.
            </p>
        </div>


        <div class="col-lg-5 text-center">
            <img src="image/logo.png" alt="About Us" class="img-fluid rounded-4 shadow-lg">
        </div>
    </div>
    <div class="d-flex justify-content-center mt-5">
        <img src="image/X-Workz-Image.jpg" alt="About Us" class="img-fluid rounded-4 shadow-lg" style="width:850px; height:auto;">
    </div>
</div>
</body>
</html>
