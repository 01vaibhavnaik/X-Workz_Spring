function validateEmail(){
let email=document.getElementById("emailId").value;
let emailError=document.getElementById("emailErrorId");
let emailPattern=/^[A-Za-z0-9]+@gmail\.com$/;
if(!emailPattern.test(email)){
emailError.innerText="Email Should be in this pattern [A-Za-z0-9]gmail.com";
}else{
emailError.innerText="";
}
}

  function checkEmail() {
    let emailName = document.getElementById("emailId").value;
    let emailError = document.getElementById("emailErrorId");
    const xhttp = new XMLHttpRequest();
    xhttp.open("GET", "http://localhost:8080/Hospital/checkEmail/" + emailName);
    xhttp.send();
    xhttp.onload = function() {
        emailError.innerHTML = this.responseText;
    }
}

