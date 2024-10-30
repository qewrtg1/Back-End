$(function(){



    $(window).scroll(function(){
        var sct = $(window).scrollTop();
        $('#sTop').text(sct);

        for (var i = 0; i < 6; i++) {
            if (sct >= $('section>div').eq(i).offset().top) {
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(i).addClass('on');
                $('#floatdiv ul li').removeClass('on');
                $('#floatdiv ul li').eq(i).addClass('on');
                }
            }//아래의 긴 내용을 이렇게 for문으로 축약할 수도 있고
    });



    $('nav ul li').click(function(){
        var i = $(this).index();
        var offset_nav = $('section>div').eq(i).offset().top;
        // alert(i);
        //alert(offset_nav);

        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        return false;
    });


});