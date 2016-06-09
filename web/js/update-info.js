function updateProfile(){
    if(validateUpdate()){
        var fname = document.forms["update-form"]["fname"].value;
        var lname = document.forms["update-form"]["lname"].value;
        var email = document.forms["update-form"]["email"].value;
        var address = document.forms["update-form"]["address"].value;
        var contact = document.forms["update-form"]["contact"].value;
        var username = document.forms["update-form"]["username"].value;
        
        var data = {
            fname:fname,
            lname:lname,
            email:email,
            address:address,
            contact:contact,
            username:username
        };
        
        $("#loading").css("visibility", "visible");
        
        $.ajax({
            type: 'POST',
            url: "UpdateProfile",
            data: data,
            success: function (data) {
               if(data == "true"){
                   document.getElementById("msg").innerHTML = "Your profile information has been updated successfully !";
               }else{
                   document.getElementById("update-error").innerHTML = "Could not update your profile information. Please try again !";
               } 
            },
            error: function () {
                alert("Error connecting to server !");
            }
        });
    }
    return false;
}