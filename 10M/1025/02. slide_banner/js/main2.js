$(function(){
    var visual = $('#brandVisual > ul > li');  //큰사진
    var button1 = $('#buttonList > li'); //pager 버튼
    var current = 0; //현재
    var id;
    
    button1.click(function(){
         var i = $(this).index();
         //alert(i);
         button1.removeClass('on');
         button1.eq(i).addClass('on');
         move(i); 
    });
 

//01엔 없던 추가 내용

function timer(){
    id = setInterval(function(){
        var n = current + 1;
        if(n == 3){
            n = 0;
        }
        button1.eq(n).trigger('click');
        //버튼1을 컴퓨터에게 3초마다 n에 값에 따라 클릭을 강제로 시킴
    },3000);
} 
// (2) 여기까진 만들어서 움직이지는 않음. 누군가 수동으로 움직여야 하는 상황 이걸 자동으로 움직여주게 함수를 만들 것.

timer(); // (2) 그게 이거임




/*아래는 동일? 할걸 */
    function move(i){
     if(current == i) return; 
     //현재 활성화된 button과 클릭한 버튼이 같은면 빠져 나간다.
     var cu = visual.eq(current); 
     var ne = visual.eq(i);
     cu.css('left','0').stop().animate({'left':"-100%"},500);
     ne.css('left','100%').stop().animate({'left':"0%"},500);
 
     current = i ;
 
    }
 
 
 
 
 });