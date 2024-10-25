$(function(){
    var clone = $('.imgs li').eq(0).clone();
//.img 안에 li 중 첫번째(인덱스0) li를 복제 실행
    $(".imgs").append(clone);
//.imgs 선택자에서 자식요소로 clone에 저장된 요소를 추가함.
    var i = 0;

    var repeat;

    $('.pager li').click(function(){
        i = $(this).index();
        $(".imgs").stop().animate({"margin-left":-i*100+"%"});
        $(".pager li").removeClass("on");
        $(this).addClass("on");

    });


    $('.next').click(function(){
        if(i == 5){
            i = 0 ; 
            $(".paper li").eq(i).addClass("on");
            $('imgs').css('margin-left',0);
        }

        i++; // (3) 얘랑 아래 두개만 있을 때 이동은 잘함. [....]이 안따라옴
        $(".imgs").stop().animate({"margin-left":-n*100+"%"});

        $(".pager li").removeClass("on");
        $(".pager li").eq(i).addClass("on");


    });








//아래두개는 내가 혼자해보고 실패한 것
    // $('.next').click(function(){
    //     if( == 5){
    //          == 0 ; 
    //         $('imgs cf').css('margin-left','0');
    //     }
    //     ++;
    //     $('imgs cf').stop().animate({'margin-left':-n},-n*100+"%");
    //     return false;
    // });


    // $('#wrap p.prev').click(function(){
    //     i = $(this).index();
    //     $(".imgs").stop().animate({"margin-left":-i*100+"%"});
    //     $(".prev").removeClass("on");
    //     $(this).addClass("on");
    // });
});