//예전에 했던 슬라이드 만들기랑은 다를 거임
$(function(){
    var visual = $('#brandVisual > ul > li'); // 큰 사진 들어있는 곳
    var button1 = $('#buttonList > li'); //pager 버튼
    var current = 0; //현재
    var id; //여기까진 전역변수다.(1)

    button1.click(function(){ 
//button1는 위에서 변수로 저장했으니까 $('button')이라고 안 써도 돼
//또 button이라는 변수는 이미 html 같은 곳에 존재하는 명렁어라 가급적 이름 그대로 쓰지 않는 게 좋음
    var i = $(this).index(); //i는 지역변수다.(1)
        // alert(i);
        button1.removeClass('on');
        button1.eq(i).addClass('on');

        move(i); 
//move는 지역변수를 다른 곳에서도 전달할 수 있도록 만들어주는 명령이다.
//그런데 굳이 따지면 다소 번거롭기에 차라리 처음부터 전역변수에 var i를 선언하는 것이 편하다?
    });

    function move(i){
        if(current == i ) return
        //현재 활성화된 button과 클릭한 버튼이 일치, 같을 경우 이 함수에서 빠져나간다, 라는 의미
//current = i = 0 일 수 있는 이유 :
    // 사진이 이동할 때(0,1,2) 화면이 이동하는 것이 아닌 사진이 기존 '0'번이 있는 위치,
    //left:0의 위치로 오는 것. 이전에 left:0에 있던 사진은 left: -(마이너스)의 영역으로 넘어가기 때문에 
    //보이는 사진의 위치는 계속해서 0. current = i = 0 이 성립된다.


//이 아래부턴 왼쪽으로(-마이너스 영억) 밀려난 사진을 오른쪽으로 옮기는 코딩
        var cu = visual.eq(current);
        var ne = visual.eq(i);

        cu.css('left', '0').stop().animate({'left':"-100%"},500);
        ne.css('left', '100%').stop().animate({'left':"0%"},500);
        //여기까지 하면 0~1까지 이동은 자연스러움. 2번이 좀 이상함

        current = i ; // 이렇게 해야 그때그때 값이 변경되면서 사진이 자연스럽게 넘어감.
        //장점 : 순서와 상관없이 아무때나 슬라이드를 불러올 수 있다
    };




});