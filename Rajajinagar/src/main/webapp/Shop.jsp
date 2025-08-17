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
    <form:form class="w-50" action="shop" method="post" modelAttribute="shopdto">
        <div class="mb-3">
            <label for="nameId" class="form-label">Shop Name</label>
            <form:input path="shopname" cssClass="form-control" id="nameId"/>
            <form:errors path="shopname" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="locId" class="form-label">Shop Location</label>
            <form:input path="shoploc" cssClass="form-control" id="locId"/>
            <form:errors path="shoploc" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="emailId" class="form-label">Shop Email</label>
            <form:input path="shopemail" cssClass="form-control" id="emailId"/>
            <form:errors path="shopemail" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="phnoId" class="form-label">Shop Phone</label>
            <form:input path="shophno" cssClass="form-control" id="phnoId"/>
            <form:errors path="shophno" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="openId" class="form-label">Open Timing</label>
            <form:input path="openingtime" cssClass="form-control" id="openId"/>
            <form:errors path="openingtime" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            <label for="closeId" class="form-label">Close Timing</label>
            <form:input path="closingtime" cssClass="form-control" id="closeId"/>
            <form:errors path="closingtime" cssClass="text-danger"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>

</div>
</body>
</html>