
function subscribe() {

    if (validateSubscribe()) {
        var name = document.forms["sub"]["newsletter-name"].value;
        var email = document.forms["sub"]["newsletter-email"].value;
        
        var data = {
            name: name,
            email: email
        };
        $("#loading").css("visibility", "visible");
        $.ajax({
            type: 'POST',
            url: "Subscribe",
            data: data,
            success: function (msg) {
                document.getElementById("sub-msg").innerHTML = msg;
            },
            error: function () {

            }
        });
    }
    return false;
}