<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Doctor Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container my-5">
    <h1 class="text-center mb-4">Doctor List</h1>

    <div class="table-responsive">
        <table class="table table-bordered table-hover align-middle">
            <thead class="table-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Specialist</th>
                <th scope="col">Profile</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="doctor" items="${show}">
                <tr>
                    <td>${doctor.docid}</td>
                    <td>${doctor.name}</td>
                    <td>${doctor.email}</td>
                    <td>${doctor.specialist}</td>
                    <td>
                        <img src="download?fileName=${doctor.profile}"
                             alt="Doctor Profile"
                             class="img-thumbnail"
                             style="width:100px; height:100px; object-fit:cover;">
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
