<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html xmlns:form="http://www.w3.org/1999/xhtml">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 class="d-flex justify-content-center align-items-center">Shop</h1>
<div class="d-flex justify-content-center align-items-center min-vh-100">
    <form:form class="w-50" action="flower" method="post" modelAttribute="flowerdto">
        <div class="mb-3">
            <label for="nameId" class="form-label">Flower Name</label>
            <form:input  path="flowername" cssClass="form-control" id="nameId"/>
            <form:errors path="flowername" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="price" class="form-label">Flower Price</label>
            <form:input type="number" path="flowerprice" cssClass="form-control" id="price"/>
            <form:errors path="flowerprice" cssClass="text-danger"/>
        </div>
        <div class="mb-3">
            <label for="colorId" class="form-label">Flower Color</label>
            <form:input type="text" path="flowercolor" cssClass="form-control" id="colorId"/>
            <form:errors path="flowercolor" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>

</div>
</body>
</html>