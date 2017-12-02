$(document).ready(function () {
    $(".logIN").click(function () {
        if ($(".login").val().length != 0) {
            $(".popup, .overlay").fadeIn(300);
        }
    });

    $(".signUp").click(function () {
        if ($(".login").val().length != 0) {
            $(".popup, .overlay").fadeIn(300);
        }
    });
    
    $("#add").click(function () {
        $(".popup, .overlay").fadeIn(300);
    });
});