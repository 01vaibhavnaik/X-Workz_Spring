function validateName(){
let userName=document.getElementById("nameId").value;
let nameError=document.getElementById("nameErrorId");
if(userName.length<3 || userName.length>26){
nameError.innerText="Name length between 3 and 25";
}else{
nameError.textContent="";
}
}

function validateEmail(){
let emailName=document.getElementById("emailId").value;
let emailError = document.getElementById("emailErrorId");
let emailPattern=/^[A-Za-z0-9]+@gmail\.com$/;
if(!emailPattern.test(emailName)){
emailError.innerText ="Email should be in this pattern [A-Za-z0-9]gmail.com";
}else{
emailError.innerText="";
}
}

function checkEmail(){
let emailName=document.getElementById("emailId").value;
let emailError=document.getElementById("emailErrorId");
const xhttp=new XMLHttpRequest();
xhttp.open("GET","http://localhost:8080/X-Workz/checkEmail/"+emailName);
xhttp.send();
xhttp.onload=function(){
emailError.innerHTML=this.responseText;
}
}



function validateAge(){
let age=document.getElementById("ageId").value;
let ageError=document.getElementById("ageError");
if(age < 17 || age > 61){
ageError.innerText="Age Should Be Above 18 Or Below 60";
}else{
ageError.innerText="";
}
}



function validatePassword(){
let password=document.getElementById("passwordId").value;
let passwordError=document.getElementById("passwordErrorId");
let passwordPattern=/^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\d){3,}).{3,15}$/;

if(!passwordPattern.test(password)){
passwordError.innerText="Must have 1 Special Char,1 Capital,3 Number";
}else{
passwordError.innerText="";
}
}

function passwordToggle(){
let password=document.getElementById("passwordId");
if(password.type==="password"){
password.type="text";
}else{
password.type="password";
}
}

function validateCPassword(){
let cpassword=document.getElementById("confirmId").value;
let password=document.getElementById("passwordId").value;
let cpasswordError=document.getElementById("CpasswordErrorId")
if(cpassword!=password){
cpasswordError.innerText="Password Should Match";
}else{
cpasswordError.innerText="";
}
}

function CpasswordToggle(){
let cpassword=document.getElementById("confirmId");
if(cpassword.type==="password"){
cpassword.type="text";
}else{
cpassword.type="password";
}
}

function validateGender(){
let gender=document.getElementById("genderId").value;
let gederError=document.getElementById("genderErrorId")
if(gender.type==="Select Gender"){
gederError.innerText="Please select Gender";
}else{
genderError.innerText="";
}
}

