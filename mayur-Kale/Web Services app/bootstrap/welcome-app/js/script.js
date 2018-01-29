$(function() {

    $(".navbar li > a").click(function(event) {
        event.preventDefault();
        var hash = this.hash;
        
        window.location.hash = this.hash;
    });
    $(".navbar li").click(function(event) {
        event.preventDefault();
        $(".navbar li").removeClass('active');
        $(this).addClass('active');
    });

    $(".thumbnails").hover(function() {
        $(".thumbnails").css('opacity', '1');
        $(this).children('span').css('visibility', 'hidden');

        $(this).children("span").css({
            'position': 'absolute',
            'top': '0',
            'left': '0px',
            'opacity': '1',
     		'color' : '#fff',       
            'visibility': 'visible',
            'text-align': 'center'
        });
        $(this).css('opacity', '0.999').css('background-color', '#f4511e');

    }, function() {
        $(".thumbnails").css('opacity', '1');
        $(this).children('span').css('visibility', 'hidden');
    });




});
