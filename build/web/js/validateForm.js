var RegisterId = ["fname-error","lname-error","email-error","address-error","username-error","password-error","re-password-error","contact-error"];

var loginId = ["u-error","p-error"];

var resetId = ["uerror","eerror"];

var resetNewId = ["u-reset-error","e-reset-error","p-reset-error","c-reset-error"];

var commentError = ["e-name","e-comment"];

var updateIds = ["update-fname","update-lname","update-email","update-address","update-contact"];

var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

function validateRegister(){
    var fname = document.forms["registration"]["fname"].value;
    var lname = document.forms["registration"]["lname"].value;    
    var email = document.forms["registration"]["email"].value;
    var address = document.forms["registration"]["address"].value;
    var username = document.forms["registration"]["username"].value;
    var password = document.forms["registration"]["password"].value;
    var rePassword = document.forms["registration"]["re-password"].value;
    var contact = document.forms["registration"]["contact"].value;
    
    if(fname == null || fname == ""){
        document.getElementById("fname-error").innerHTML = "Enter First Name !";
        clearError("fname-error",RegisterId);
        return false;
    }else if(lname == null || lname == ""){
        document.getElementById("lname-error").innerHTML = "Enter Last Name !";
        clearError("lname-error",RegisterId);
        return false;
    }else if(email == null || email == ""){
        document.getElementById("email-error").innerHTML = "Enter Email !";
        clearError("email-error",RegisterId);
        return false;
    }else if(address == null || address == ""){
        document.getElementById("address-error").innerHTML = "Enter Address !";
        clearError("address-error",RegisterId);
        return false;
    }else if(contact == null || contact == ""){
        document.getElementById("contact-error").innerHTML = "Enter Contact No !";
        clearError("contact-error",RegisterId);
        return false;
    }else if(username == null || username == ""){
        document.getElementById("username-error").innerHTML = "Enter Username !";
        clearError("username-error",RegisterId);
        return false;
    }else if(password == null || password == ""){
        document.getElementById("password-error").innerHTML = "Enter Password !";
        clearError("password-error",RegisterId);
        return false;
    }else if(rePassword == null || rePassword == ""){
        document.getElementById("re-password-error").innerHTML = "Re-Enter Password !";
        clearError("re-password-error",RegisterId);
        return false;
    }else if(password != rePassword){
        document.getElementById("re-password-error").innerHTML = "Password does not match !";
        clearError("re-password-error",RegisterId);
        return false;
    }else if(!re.test(email)){
        document.getElementById("email-error").innerHTML = "Invalid Email Address !";
        clearError("email-error",RegisterId);
        return false;
    }else{
        return true;
    }
    return false;
}

function validateLogin(){
    var username = document.forms["login"]["login-username"].value;
    var password = document.forms["login"]["login-password"].value;
    if(username == null || username == ""){
        document.getElementById("u-error").innerHTML = "Invalid Username !";
        clearError("u-error",loginId);
        return false;
    }else if (password == null || password == ""){
        document.getElementById("p-error").innerHTML = "Invalid Password !";
        clearError("p-error",loginId);
        return false;
    }else{
        return true;
    }
}

function validateResetEmail(){
    var email = document.forms["reset-password"]["email"].value;
    var username = document.forms["reset-password"]["username"].value;    
    
    if(email == null || email == ""){
        document.getElementById("eerror").innerHTML = "Enter Email !";        
        clearError("eerror",resetId);
        return false;
    }else if(!re.test(email)){
        document.getElementById("eerror").innerHTML = "Invalid Email Address !";
        clearError("eerror",resetId);
        return false;
    }else if(username == null || username == ""){
        document.getElementById("uerror").innerHTML = "Enter Username !";
        clearError("uerror",resetId);
        return false;
    }else{
        return true;
    }    
}

function validateNewPassword(){
    var pass = document.forms["new-password"]["password"].value;
    var confirmPass = document.forms["new-password"]["confirmPassword"].value;
    if(pass == null || pass == ""){
        document.getElementById("new-password-error").innerHTML = "Enter New Password !";
        return false;
    }else if(confirmPass == null || confirmPass == ""){
        document.getElementById("new-password-error").innerHTML = "Re-Enter New Password !";
        return false;
    }else if(confirmPass != pass){
        document.getElementById("new-password-error").innerHTML = "Password does not match !";
        return false;
    }
}

function validateResetPassword(){
    var username = document.forms["reset-new-password"]["username"].value;
    var email = document.forms["reset-new-password"]["email"].value;
    var password = document.forms["reset-new-password"]["password"].value;
    var conPassword = document.forms["reset-new-password"]["confirmPassword"].value;
    
    if(username == null || username == ""){
        document.getElementById("u-reset-error").innerHTML = "Enter Username !";
        clearError("u-reset-error",resetNewId);
        return false;
    }else if(email == null || email == ""){
        document.getElementById("e-reset-error").innerHTML = "Enter Email !";
        clearError("e-reset-error",resetNewId);
        return false;
    }else if(password == null || password == ""){
        document.getElementById("p-reset-error").innerHTML = "Enter Password !";
        clearError("p-reset-error",resetNewId);
        return false;
    }else if(conPassword == null || conPassword == ""){
        document.getElementById("c-reset-error").innerHTML = "Re-enter Password !";
        clearError("c-reset-error",resetNewId);
        return false;
    }else if(password != conPassword){
        document.getElementById("c-reset-error").innerHTML = "Passwords do not match !";
        clearError("c-reset-error",resetNewId);
        return false;
    }else if(!re.test(email)){
        document.getElementById("e-reset-error").innerHTML = "Enter valid Email !";
        clearError("e-reset-error",resetNewId);
        return false;
    }
    
}

function validateUpdate(){
    var fname = document.forms["update-form"]["fname"].value;
    var lname = document.forms["update-form"]["lname"].value;
    var email = document.forms["update-form"]["email"].value;
    var address = document.forms["update-form"]["address"].value;
    var contact = document.forms["update-form"]["contact"].value;
    
    if(fname == null || fname == ""){
        document.getElementById("update-fname").innerHTML = "Update First Name !";
        clearError("update-fname",updateIds);
        return false;
    }else if(lname == null || lname == ""){
        document.getElementById("update-lname").innerHTML = "Update Last Name !";
        clearError("update-lname",updateIds);
        return false;
    }else if(email == null || email == ""){
        document.getElementById("update-email").innerHTML = "Update Email !";
        clearError("update-email",updateIds);
        return false;
    }else if(address == null || address == ""){
        document.getElementById("update-address").innerHTML = "Update Address !";
        clearError("update-address",updateIds);
        return false;
    }else if(contact == null || contact == ""){
        document.getElementById("update-contact").innerHTML = "Update Contact No !";
        clearError("update-contact",updateIds);
        return false;
    }else if(!re.test(email)){
        document.getElementById("update-email").innerHTML = "Invalid Email !";
        clearError("update-email",updateIds);
        return false;
    }else{
        return true;
    }
}

function validateSubscribe(){
    
    var name = document.forms["sub"]["newsletter-name"].value;
    var email = document.forms["sub"]["newsletter-email"].value;
    
    if(name == null || name == ""){
        document.getElementById("sub-error").innerHTML = "Enter Name to Subscribe !";
        return false;
    }else if(email == null || email == ""){
        document.getElementById("sub-error").innerHTML = "Enter Email to Subscribe !";
        return false;
    }else if(!re.test(email)){
        document.getElementById("sub-error").innerHTML = "Invalid email address !";
        return false;
    }else{
        return true;
    }
}

function validateComment(){
    var name = document.forms["comment-form"]["commentor-name"].value;
    var comment = document.forms["comment-form"]["comment"].value;
    if(name == null || name == ""){
        document.getElementById("e-name").innerHTML = "Enter Name !";
        clearError("e-name",commentError);
        return false;
    }else if(comment == null || comment == ""){
        document.getElementById("e-comment").innerHTML = "Type Review";
        clearError("e-comment",commentError);
        return false;
    }else{
        return true;
    }
}

function clearError(id,array){
    for(var i=0;i<array.length;i++){
        if(array[i] == id){
            continue;
        }else{
            document.getElementById(array[i]).innerHTML = "";
        }
    }
}

