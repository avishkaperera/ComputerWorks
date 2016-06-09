

function register() {       
    if (validateRegister()) {        
//        if (checkUsername()) {            
            var fname = document.forms["registration"]["fname"].value;
            var lname = document.forms["registration"]["lname"].value;
            var email = document.forms["registration"]["email"].value;
            var address = document.forms["registration"]["address"].value;
            var username = document.forms["registration"]["username"].value;
            var password = document.forms["registration"]["password"].value;
            var repassword = document.forms["registration"]["re-password"].value;
            var contact = document.forms["registration"]["contact"].value;

            var data = {
                fname: fname,
                lname: lname,
                email: email,
                address: address,
                username: username,
                password: password,
                repassword: repassword,
                contact : contact
            };

            $("#loading").css("visibility", "visible");

            $.ajax({
                type: 'POST',
                url: "Register",
                data: data,
                success: function (response) {
                    document.getElementById("msg").innerHTML = response;
                },
                error: function () {
                    $("#loading").css("visibility", "hidden");
                    document.getElementById("error").innerHTML = "Registration Unsuccessful! Please try again!";
                }
            });
//        } else {
//            return false;
//        }

    } else {
        return false;
    }
    return false;
}