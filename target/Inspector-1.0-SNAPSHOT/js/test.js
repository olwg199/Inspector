$(document).ready(function () {
    $(".logIN").bind("click", function () {
        if ($(".login").val().length != 0) {
            $.ajax({
                url: "Login",
                type: "POST",
                data: ({login: $(".login").val()}),
                dataType: "html",
                success: funcSuccess
            });
        }
    });
    
    $(".signUp").bind("click", function () {
        if ($(".login").val().length != 0) {
            $.ajax({
                url: "SignUp",
                type: "POST",
                data: ({login: $(".login").val()}),
                dataType: "html",
                success: funcSuccess
            });
        }
    });
    
    $(".topic").bind("click", function () {
        $.ajax({
            url: "Questions",
            type: "POST",
            data: ({topic: $(this).val()}),
            dataType: "html",
            success: getTopicList
        });
    });
    
    $("#add").bind("click", function () {
        $.ajax({
            url: "AddQuestion",
            type: "POST",
            data: ({topic: $(".add").val()}),
            dataType: "html",
            success: getAddQuestionForm
        });
    });
});

$(document).keypress(function(e) {
    if(e.which == 13 && $(".entryField").val().length != 0) {
        $.ajax({
            url: "Search",
            type: "POST",
            data: ({search: $(".entryField").val()}),
            dataType: "html",
            success: funcSuccessSearch
        });
    }
});

function getAddQuestionForm(data){
    $(".popup_content").html(data);
    $(".close_popup").bind("click", function () {
        $(".popup, .overlay").fadeOut(300);
        $(".popup_content").text("");
    });
}

function funcSuccess(data){
    $(".popup_content").html(data);  
    $(".close_popup").bind("click", function () {
        $(".popup, .overlay").fadeOut(300);
        $(".popup_content").text("");
    });
}

function funcSuccessSearch(data){
    $(".content").html(data);
}

function getTopicList(data){
    $(".content").html(data);
}

function funcBefore(){
    $(".content").html("Загружается");
}