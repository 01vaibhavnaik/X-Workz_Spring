<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class=" d-flex justify-content-center align-items-center min-vh-100">
    <form class="w-50" action="loanform" method="post">
        <div class="mb-3">
            <label for="loanId" class="form-label">Loan Type</label>
            <input type="text" class="form-control" id="loanId" name="loantype" placeholder="eg(Education,Gold,Car..">
        </div>
        <div class="mb-3">
            <label for="nameId" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="nameId" name="name" >
        </div>
        <div class="mb-3">
            <label for="ageId" class="form-label">Age</label>
            <input type="number" class="form-control" id="ageId" name="age" >
        </div>
        <div class="mb-3">
            <label for="emailId" class="form-label">Email</label>
            <input type="email" class="form-control" id="emailId" name="email" >
        </div>
        <div class="mb-3">
            <label for="addressId" class="form-label">Address</label>
            <input type="text" class="form-control" id="addressId" name="address" >
        </div>
        <div class="mb-3">
            <label for="incomeId" class="form-label">Montly Income</label>
            <input type="number" class="form-control" id="incomeId" name="income" >
        </div>
        <div class="mb-3">
            <label for="amountId" class="form-label">Amount Required</label>
            <input type="number" class="form-control" id="amountId" name="amount" >
        </div>
        <div class="mb-3">
            <label for="repaymentId" class="form-label">Preferred Repayment Period (Months/Years):</label>
            <input type="text" class="form-control" id="repaymentId" name="repayment" >
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
