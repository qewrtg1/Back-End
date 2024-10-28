$(function(){
    
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        $('.s_top').text(sct);




        if(sct >= 10){
            $('.area1').addClass('on');
            $('.area1 > h2').css('display','none');
        }else{
            $('.area1').removeClass('on');
        }
        if(sct >= 500){
            $('.area2').addClass('on');
            $('.area2 > h2').css('display','none');

        }else{
            $('.area2').removeClass('on');
        }
        if(sct >= 1200){
            $('.area3').addClass('on');
            $('.area3 > h2').hide("slow");

        }else{
            $('.area3').removeClass('on');
        }
        if(sct >= 1900){
            $('.area4').addClass('on');
            $('.area4 > h2').fadeOut(700);
        }else{
            $('.area4').removeClass('on');
        }
        if(sct >= 2500){
            $('.area5').addClass('on');
        }else{
            $('.area5').removeClass('on');
        }

    });

});