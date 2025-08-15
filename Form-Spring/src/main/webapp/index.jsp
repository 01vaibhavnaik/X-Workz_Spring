<html>
<head>
    <title>Form Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="#">Form Management</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link text-light" href="LoanForm.jsp">
                        <i class="bi bi-file-earmark-text"></i> Loan Form
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="text-center mb-5">
        <h2 class="fw-bold">Welcome to the Loan Form Portal</h2>
        <p class="text-muted">Manage loan records easily from here</p>
    </div>

    <div class="row g-4">
        <!-- View All Loan Details -->
        <div class="col-md-6">
            <div class="card shadow-sm h-100 text-center">
                <div class="card-body">
                    <i class="bi bi-table fs-1 text-primary mb-3"></i>
                    <h5 class="card-title fw-bold">View All Loan Details</h5>
                    <p class="text-muted">Check the complete list of all loan applications.</p>
                    <a href="getAllLoanDetails" class="btn btn-primary">
                        <i class="bi bi-eye"></i> View
                    </a>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card shadow-sm h-100 text-center">
                <div class="card-body">
                    <i class="bi bi-pencil-square fs-1 text-success mb-3"></i>
                    <h5 class="card-title fw-bold">Edit Loan Details</h5>
                    <p class="text-muted">Update loan records by providing ID or Name.</p>
                    <a href="Edit.jsp" class="btn btn-success">
                        <i class="bi bi-pencil-square"></i> Edit
                    </a>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card shadow-sm h-100 text-center">
                <div class="card-body">
                    <i class="bi bi-calendar-range fs-1 text-warning mb-3"></i>
                    <h5 class="card-title fw-bold">View Loan Details (Age 20-28)</h5>
                    <p class="text-muted">Check the list of loan applications for applicants aged between 20 and 28.</p>
                    <a href="getAgeBetLoanDetails" class="btn btn-warning text-dark">
                        <i class="bi bi-eye"></i> View
                    </a>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card shadow-sm h-100 text-center">
                <div class="card-body">
                    <i class="bi bi-search fs-1 text-info mb-3"></i>
                    <h5 class="card-title fw-bold">Retrieve Details By Name</h5>
                    <p class="text-muted">Find email and address by providing the applicant's name.</p>
                    <a href="GetEmailAddressByName.jsp" class="btn btn-info text-white">
                        <i class="bi bi-search"></i> Check
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
