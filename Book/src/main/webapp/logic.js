function validName(){
let bookname=document.getElementById("booknameId").value;
let errName= document.getElementById("nameerrorId");
if(bookname.length < 3 || bookname.length >15){
errName.innerText="Name Error";
}else{
errName.innerText="";
}
}

function validPrice(){
let price=document.getElementById("bookpriceId").value;
let errprice=document.getElementById("priceerrorId");
if(price < 100){
errprice.innerText="Price Error";
}else{
errprice.innerText="";
}
}

function validemail(){
let email=document.getElementById("personemailId").value;
let erremail=document.getElementById("emailerrorId");
let pattern=/^[A-Za-z0-9]+@gmail\.com$/;
if(!pattern.test(email) ){
erremail.innerText="email Error";
}else{
erremail.innerText="";
}
}

function validPass(){
let pass=document.getElementById("passwordId").value;
let errpass=document.getElementById("passerrorId");
let passpattern=/^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\d){3,}).{3,15}$/;
if(!passpattern.test(pass)){
errpass.innerText="pattern";
}else{
errpass.innerText="";
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

function validCpass(){
let password=document.getElementById("passwordId").value;
let cpass=document.getElementById("cpasswordId").value;
let err=document.getElementById("cpasserrorId");
if(password!=cpass){
err.innerText="match";
}else{
err.innerText="";
}
}

function CpasswordToggle(){
let cpa=document.getElementById("cpasswordId");
if(cpa.type==="password"){
cpa.type="text";
}else{
cpa.type="password";
}
}
