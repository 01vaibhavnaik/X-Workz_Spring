<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 class="d-flex justify-content-center align-items-center">Shop</h1>
<div class="d-flex justify-content-center align-items-center min-vh-100">
    <form class="w-50" action="shop" method="post">
        <div class="mb-3">
            <label for="nameId" class="form-label">Shop Name </label>
            <input type="text" class="form-control" id="nameId" name="shopname" >
        </div>
        <div class="mb-3">
            <label for="locId" class="form-label">Shop Location </label>
            <input type="text" class="form-control" id="locId" name="shoploc" >
        </div>
        <div class="mb-3">
            <label for="emailId" class="form-label">Shop Email </label>
            <input type="text" class="form-control" id="emailId" name="shopemail" >
        </div>
        <div class="mb-3">
            <label for="phnoId" class="form-label">Shop PhNo </label>
            <input type="number" class="form-control" id="phnoId" name="shophno" >
        </div>
        <div class="mb-3">
            <label for="openId" class="form-label">Open Timing </label>
            <input type="number" class="form-control" id="openId" name="openingtime" >
        </div>
        <div class="mb-3">
            <label for="closeId" class="form-label">Close Timing </label>
            <input type="number" class="form-control" id="closeId" name="closingtime" >
        </div>
        <button type="submit">Submit</button>
        <button class="mt-5"><a href="index.jsp">Back</a></button>
    </form>
</div>
</body>
</html>