var request;
var msg;
function checkUsername() {

    var username = document.forms["registration"]["username"].value;
    var url = "CheckUsername?username=" + username;
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    }
    try {
        request.onreadystatechange = getResponse;
        request.open("GET", url, true);
        request.send();
    } catch (e) {
        alert("Connection Error");
    }
    function getResponse() {

        if (request.readyState == 4) {
            msg = request.responseText;
            document.getElementById("username-error").innerHTML = msg;
        }
    }
    if (msg == null || msg == "") {
        return true;
    } else {
        return false;
    }
}

