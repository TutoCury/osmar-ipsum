!function (e) {
    "use strict";
    e('a.js-scroll-trigger[href*="#"]:not([href="#"])').click(function () {
        if (location.pathname.replace(/^\//, "") == this.pathname.replace(/^\//, "") && location.hostname == this.hostname) {
            var a = e(this.hash);
            if ((a = a.length ? a : e("[name=" + this.hash.slice(1) + "]")).length) return e("html, body").animate({scrollTop: a.offset().top - 70}, 1e3, "easeInOutExpo"), !1
        }
    }), e(".js-scroll-trigger").click(function () {
        e(".navbar-collapse").collapse("hide")
    }), e("body").scrollspy({target: "#mainNav", offset: 100});

    function a() {
        100 < e("#mainNav").offset().top ? e("#mainNav").addClass("navbar-shrink") : e("#mainNav").removeClass("navbar-shrink")
    }

    a(), e(window).scroll(a)
}(jQuery);

function gerar() {

    let paragrafos = $("#paragrafos").val();

    $("#container-erro").addClass("hidden");
    $("#container-erro").removeClass("animate-opacity");

    if (paragrafos < 1) {
        $("#container-erro p").html("Que tipo feio!");
        $("#container-erro").removeClass("hidden");
        $("#container-erro").addClass("animate-opacity");
    } else {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/paragrafo"
            // url: "http://localhost:8080/paragrafo/"+ paragrafos
        }).done(function (msg) {
            $("#lorem").html(msg.paragrafo);
        }).fail(function (jqXHR, textStatus, msg) {
            $("#container-erro p").html("");
            $("#container-erro p").html(msg.erro);
            $("#container-erro").removeClass("hidden");
            $("#container-erro").addClass("animate-opacity");
        });
    }

}