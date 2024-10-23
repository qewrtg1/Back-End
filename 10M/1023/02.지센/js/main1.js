$(function(){

//화면의 사이즈를 조절하면 
    $(window).resize(function(){
        var w = $(this).width(); 
        //현재 넓이를 w에 저장.       
        console.log(w);
        if(w < 850){
//작은 건 문제가 없으니 일부로 비우고, 아닐 경우 else
        }else{
            if($('.mobile_nav').hasClass('active')==true){
                $('.mobile_nav').removeClass('active');
                $('.transparency').removeClass('active');
                $('.mobile_nav .sub').css('display','none'); 
            }
        }
    });










    $('.nav > ul').mouseenter(function(){
        $(this).addClass('over');
    });
    $(".nav ul").mouseleave(function(){
        $(this).removeClass('over');
    });

    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
        return false;
    });
    $('.close').click(function(){
        $('.mobile_nav').removeClass('active');
        $('.transparency').removeClass('active');
        $('.mobile_nav .sub').css('display','none');
        return false;
    });

    $('.mobile_nav > ul > li >a').click(function(){

        if($(this).next('.sub').css('display') == 'none'){
            $('.mobile_nav .sub').slideUp(300);
            $(this).next('.sub').slideDown(300);
        }else{
            $(this).next('.sub').slideUp(300);
        }
        return false;

    });

    // $('.mobile_nav > ul > li >a').click(function(){
    //     var aaa =  $(this).next().css('display');
    //     // alert(aaa);
    //     if(aaa ==='none'){
    //      $('.sub').slideUp();
    //      $(this).next('.sub').slideDown();
    //     }else{
    //      $(this).next('.sub').slideUp();
    //     } 
    //      return false;
    //  }); 나는 이렇게 했음
});