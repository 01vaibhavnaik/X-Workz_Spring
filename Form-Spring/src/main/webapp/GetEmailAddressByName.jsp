<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Edit Loan Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="mb-4 text-center">Retrive Data</h2>

    <div class="card mb-4 shadow-sm">
        <div class="card-body">
            <h5 class="card-title">Get Email Address By Name</h5>
            <form action="getEmailAddressByName" method="post">
                <div class="mb-3">
                    <label class="form-label">Full Name</label>
                    <input type="text" name="name" class="form-control" placeholder="Enter Name" required>
                </div>
                <button type="submit" class="btn btn-success">Search</button>
            </form>
        </div>
    </div>


</div>
</body>
