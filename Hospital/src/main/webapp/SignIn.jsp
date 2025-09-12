<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Log In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body class="text-dark"
      style="background: url('img.png') no-repeat center center fixed;
             background-size: cover;">
<nav class="navbar navbar-expand-lg bg-transparent bg-opacity-75 shadow-sm sticky-top">
    <div class="container justify-content-center">
        <a class="navbar-brand text-light fw-bold" href="index.jsp">
            <i class="fa fa-home me-2"></i> Home </a>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center min-vh-100">
    <div class="card shadow-lg border-4 rounded-4 text-dark p-4 bg-transparent" style="max-width: 420px; width: 100%;">
        <h2 class="text-center fw-bold text-primary mb-4">LOG IN</h2>

        <form action="signin" method="Post">
            <div class="mb-3">
                <label for="emailId" class="form-label">Email address</label>
                <input type="email" class="form-control" id="emailId" name="email"
                       value="${email}" placeholder="Enter your email" readonly>
                <span id="emailErrorId" class="text-danger small"></span>
            </div>

            <div class="mb-3">
                <label for="otpId" class="form-label">Enter OTP</label>
                <div class="input-group">
                    <input type="text" class="form-control" maxlength="6" id="otpId" name="otpname"
                           placeholder="Enter your OTP" >
                </div>
                <span id="OTPErrorId" class="text-danger small"></span>
            </div>

            <div class="text-center mb-3">
                <span class="fw-bold text-danger" id="timer">02:00</span>
            </div>

            <div class="d-grid">
                <button type="submit" id="loginBtn" class="btn btn-success btn-lg fw-semibold">Log In</button>
                <button id="resendBtn" formaction="sendotp" class="btn btn-primary btn-lg fw-semibold d-none mt-2">Resend OTP</button>
            </div>
        </form>

        <c:if test="${not empty result}">
            <div class="alert alert-warning mt-3 text-center p-1">${result}</div>
        </c:if>
    </div>
</div>

<script>
    let timerElement = document.getElementById("timer");
    let loginBtn = document.getElementById("loginBtn");
    let resendBtn = document.getElementById("resendBtn");
    let time = 120;

    let countdown = setInterval(() => {
        let minutes = Math.floor(time / 60);
        let seconds = time % 60;

        timerElement.textContent =
            (minutes < 10 ? "0" + minutes : minutes) + ":" +
            (seconds < 10 ? "0" + seconds : seconds);

        if (time <= 0) {
            clearInterval(countdown);
            timerElement.textContent = "Time expired!";
            loginBtn.classList.add("d-none");
            resendBtn.classList.remove("d-none");
        }
        time--;
    }, 1000);

    resendBtn.addEventListener("click", function () {
        alert("OTP resent!");
        window.location.href = "resendOtp?email=" + document.getElementById("emailId").value;
    });
</script>
</body>
</html>
