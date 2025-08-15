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
    <h2 class="mb-4 text-center">Edit Loan Details</h2>

    <div class="card mb-4 shadow-sm">
        <div class="card-body">
            <h5 class="card-title">Update Address by ID</h5>
            <form action="updateAddressById" method="post">
                <div class="mb-3">
                    <label class="form-label">Loan ID</label>
                    <input type="number" name="id" class="form-control" placeholder="Enter Loan ID" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">New Address</label>
                    <textarea name="address" class="form-control" rows="3" placeholder="Enter New Address" required></textarea>
                </div>
                <button type="submit" class="btn btn-success">Update</button>
            </form>
        </div>
    </div>


    <div class="card mb-4 shadow-sm">
        <div class="card-body">
            <h5 class="card-title">Update Age, Address, Email by Name</h5>
            <form action="updateAAEByName" method="post">
                <div class="mb-3">
                    <label class="form-label">Full Name</label>
                    <input type="text" name="name" class="form-control" placeholder="Enter Full Name" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Age</label>
                    <input type="number" name="age" class="form-control" placeholder="Enter Age" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Address</label>
                    <input type="text" name="address" class="form-control" placeholder="Enter Address" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Enter Email" required>
                </div>
                <button type="submit" class="btn btn-primary">Update</button>
            </form>
        </div>
    </div>


    <div class="card shadow-sm">
        <div class="card-body">
            <h5 class="card-title">Delete Loan by ID</h5>
            <form action="deleteById" method="post"
                  onsubmit="return confirm('Are you sure you want to delete this record?');">
                <div class="mb-3">
                    <label class="form-label">Loan ID</label>
                    <input type="number" name="id" class="form-control" placeholder="Enter Loan ID" required>
                </div>
                <button type="submit" class="btn btn-danger">Delete</button>
            </form>
        </div>
    </div>

</div>
</body>
