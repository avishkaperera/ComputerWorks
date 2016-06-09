var request;
function sendEmail() {
    if (validateResetEmail()) {
        var email = document.forms["reset-password"]["email"].value;
        var username = document.forms["reset-password"]["username"].value;
        var url = "ResetPassword?email=" + email + "&username=" + username;
        $("#loading").css("visibility","visible");
        if (window.XMLHttpRequest) {
            request = new XMLHttpRequest();
        }
        try {
            request.onreadystatechange = getResponse;
            request.open("GET", url, true);
            request.send();
        } catch (e) {
            alert("Unable to Connect");
        }
        function getResponse() {
            if (request.readyState == 4) {
                var msg = request.responseText;
                document.getElementById("display").innerHTML = msg;
            }
        }        
    }
    return false;
}