$(function(){




    var dTop = $('#floatdiv').offset().top; // 이 값이(1-1)
    // alert(dTop);




    $(window).scroll(function(){
       var sct = $(window).scrollTop();
       $('#sTop').text(sct);
       if(sct >= 100){
        $('nav').addClass('fixed');
       }else{
        $('nav').removeClass('fixed');
       }




       $('#floatdiv').stop().animate({top:dTop+sct}); // 여기에 도움을 줌(1-1)




       if(sct >= $('section>div').eq(0).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(0).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(0).addClass('on');
       }
       if(sct >= $('section>div').eq(1).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(1).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(1).addClass('on');
        }
        if(sct >= $('section>div').eq(2).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(2).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(2).addClass('on');
        }
        if(sct >= $('section>div').eq(3).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(3).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(3).addClass('on');
        }
        if(sct >= $('section>div').eq(4).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(4).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(4).addClass('on');
        }
        if(sct >= $('section>div').eq(5).offset().top){
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(5).addClass('on');

            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(5).addClass('on');
        }


    });

    $('nav ul li').click(function(){
        var i = $(this).index();
       // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
        //alert(offset_nav);
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        //스크롤을 offset_nav만큼움직인다.
       // $('nav ul li').removeClass('on');
        //$('nav ul li').eq(i).addClass('on');
        return false;
    });




    $('#floatdiv ul li').click(function(){
        var i = $(this).index();
        var offset_nav = $('section>div').eq(i).offset().top;
        $('html,body').stop().animate({scrollTop:offset_nav},1000);

        return false;
    });



// 한 번의 휠 움직임으로 한 화면씩 스크롤 하고 싶을 때 쓰는 방법임

    $('section > div ').mousewheel(function(event,d){
        //event : 마우스 휠의 정보를 갖고 있는 놈?
        //d는 이동방향에 대한 것?
        // console.log(d);// 휠 내리면-, 올리면 +으로 나올 것
        if(d > 0){//휠 위로
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1000, 'easeOutBounce');

        }
        if(d < 0){//휠 아래로
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1000, 'easeOutBounce');
        }
//한 번의 휠 움직임으로 한 화면씩 스크롤 하고 싶을 때 쓰는 방법이지만 jq기본만으론 사용이 안된다고 함.
//그래서html에 보면 평소보다 한 줄 더 추가되어 있음

    });

});