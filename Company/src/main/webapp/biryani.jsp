<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 class="d-flex justify-content-center align-items-center">Biryani</h1>
<div class="d-flex justify-content-center align-items-center min-vh-100">
    <form class="w-50" action="biryani" method="post">
        <div class="mb-3">
            <label for="nameId" class="form-label">Biryani Name</label>
            <input type="text" class="form-control" id="nameId" name="biryaniName" placeholder="eg(DumBiryani,ChickenBiryany)">
        </div>
        <div class="mb-3">
            <label for="priceId" class="form-label">Biryani Price</label>
            <input type="number" class="form-control" id="priceId" name="price">
        </div>
        <button type="submit">Submit</button>
        <button class="mt-5"><a href="index.jsp">Back</a></button>
    </form>
</div>

</body>
</html>

