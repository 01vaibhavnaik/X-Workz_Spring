<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class=" d-flex justify-content-center align-items-center min-vh-100">
<form class="w-50" action="personform" method="post">
    <div class="mb-3">
        <label for="nameId" class="form-label">Name</label>
        <input type="text" class="form-control" id="nameId" name="name" >
    </div>
    <div class="mb-3">
        <label for="emailId" class="form-label">Email</label>
        <input type="email" class="form-control" id="emailId" name="email" placeholder="@example@.com">
    </div>
    <div class="mb-3">
        <label for="ageId" class="form-label">Age</label>
        <input type="number" class="form-control" id="ageId" name="age" >
    </div>
    <div class="mb-3">
        <label for="addressId" class="form-label">Address</label>
        <input type="text" class="form-control" id="addressId" name="address" >
    </div>
    <div class="mb-3">
        <label for="salaryId" class="form-label">Salary</label>
        <input type="number" class="form-control" id="salaryId" name="salary" >
    </div>
<button type="submit">Submit</button>
</form>
</div>
</body>
</html>