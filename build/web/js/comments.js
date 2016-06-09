function insertComment(id) {

    if (validateComment()) {

        var name = document.forms["comment-form"]["commentor-name"].value;
        var comment = document.forms["comment-form"]["comment"].value;
        var data = {
            name: name,
            comment: comment,
            id: id
        };
        
        var redirect = "GetProduct?id="+id;
        
        $("#loading").css("visibility", "visible");

        $.ajax({
            type: 'POST',
            url: "InsertComment",
            data: data,
            success: function (data) {
                if (data == "true") {
                    document.getElementById("comment-frm").innerHTML = "Thank you for your review !";
                    setTimeout(function(){
                        window.location.href="GetProduct?id="+id;
                    }, 1500);
                } else {
                    alert("Error Occurred ! success");
                }
            },
            error: function () {
                alert("Error Occurred !");
            }
        });
        return false;
    }
    return false;
}