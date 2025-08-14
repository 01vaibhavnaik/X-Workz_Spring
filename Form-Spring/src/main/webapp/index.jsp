<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Form</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link text-light" href="PersonForm.jsp">Person Form</a>-->
<!--                </li>-->
                <li class="nav-item">
                    <a class="nav-link text-light" href="LoanForm.jsp">Loan Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <h2>Hello, Welcome To Form</h2>
    <p class="text-muted">View All Loan Details</p>
    <a href="getAllLoanDetails" class="btn btn-primary">
        <i class="bi bi-pencil-square"></i> View
    </a>
    <p class="text-muted">Edit Loan Details</p>
    <a href="Edit.jsp" class="btn btn-primary">
        <i class="bi bi-pencil-square"></i>Edit
    </a>
</div>

</body>
</html>

