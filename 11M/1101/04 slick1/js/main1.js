$(function(){
//visual-item을 감싸는 .visual-img 변수 $slick에저장    
var $slick = $('.visual-img');




//slick 슬라이드 최초로 실행할때 (최초 실행시 첫페이지엔 적용되지 않는 것을 강제로 적용하게 만드는 곳)
$slick.on('init',function(event, slick){
    //실행될내용
    $(".visual-item").eq(0).addClass("active");
});





$slick.on('afterChange',function(event,slick, currentSlide){
    // event 객체 : 이벤트 정보
    // console.log('이벤트 위치 정보', event.clientX, event.clientY)
    //$slick 다양한 메서드나 속성 접근
    //currentSlide:내가 활성한 ? x에 인덱스번호를 가져온다??
    console.log('total slide',slick.slideCount); // 전체슬라이드의 개수
     $(".visual-item").removeClass("active");
     $(this).find(".visual-item").eq(currentSlide).addClass('active');
     //currentSlide - 현재 활성화된 슬라이드 번호
});

$slick.slick({
    dots:false,
    infinite:true,
    arrows:true,
    autoplay:true,
    fade:true,
    autoplaySpeed: 5000,

});


});