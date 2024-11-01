$(function(){
    var pc_prev = $('.pc-slide .prev-btn');
    var pc_next = $('.pc-slide .next-btn');
    var mo_prev = $('.mo-slide .prev-btn');
    var mo_next = $('.mo-slide .next-btn');

    var $slick =  $('.pc-slide ul');
// pc용
  $slick.slick({
    autoplay:true,
    prevArrow:pc_prev,
    nextArrow:pc_next,
    dots:true,
  });
//mobile용
  $('.mo-slide ul').slick({
    autoplay:true,
    prevArrow:mo_prev,
    nextArrow:mo_next,
  });


//resize:화면에 사이즈를 바꿨을때, 라는 뜻
  $(window).resize(function(){
    var w = $(this).width();
    console.log(w); // 윈도우, 화면의 넓이 수치가 즉각 보임
    if(w>=800){
      mo_prev.hide();
      mo_next.hide();
    }else{
      mo_prev.show();
      mo_next.show();
    }

  });
  $(window).trigger('resize'); //처음 실행시 최초에 리사이즈를 한 번 함 


  // slick 슬라이드 최초로 실행할 때 
  $slick.on('init',function(event, slick){
    //실행될 내용을 여기에 쓰면 되는데 이번 예제엔 쓸 내용이 없다.
  });
  //slick 슬라이드에서 바뀔 때 
  $slick.on('afterChange',function(event, slick, currentSlide){ //currentSlide: 현재 실행되고 있는 슬라이드 인덱스 번호
    $('.num p strong').html(currentSlide + 1);

  });
  $('.play').click(function(){
    if($(this).hasClass('on')==false){
      $(this).addClass('on');
      $slick.slick('slickpause'); // slick슬라이드를 멈춤
    }else{
      $(this).removeClass('on');
      $slick.slick('slickPlay'); // slick슬라이드를 재시작
    }
    return false;
  });





});