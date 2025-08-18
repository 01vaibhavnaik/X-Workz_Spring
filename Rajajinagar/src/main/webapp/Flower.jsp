<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 class="d-flex justify-content-center align-items-center">Flower</h1>
<div class="d-flex justify-content-center align-items-center min-vh-100">
    <form class="w-50" action="flower" method="post">
        <div class="mb-3">
            <label for="nameId" class="form-label">Flower Name</label>
            <input type="text" class="form-control" id="nameId" name="flowername" >
        </div>
        <div class="mb-3">
            <label for="priceId" class="form-label">Flower Price</label>
            <input type="number" class="form-control" id="priceId" name="flowerprice" >
        </div>
        <div class="mb-3">
            <label for="colorId" class="form-label">Flower Color</label>
            <input type="text" class="form-control" id="colorId" name="flowercolor" >
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>
</body>
</html>