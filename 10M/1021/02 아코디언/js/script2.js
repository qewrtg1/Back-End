
var sub = document.querySelectorAll('.sub');
var menuLiA = document.querySelectorAll('.m_menu>li>a');




menuLiA.forEach(function(item){
    item.addEventListener('click', function(){
        var subHeight = getComputedStyle(this.nextElementSibling).height;
        // alert(subHeight);
//getComputedStyle: dom요소의 현재스타일을 가져오기 위한 메서드이다.
//이 메서드를 사용하면 특정 요소에 적용된 모든 스타일 속성과 값에 
//대한 정보를 얻을 수 있다. = 그래서 높이 0px를 alert로 볼 수 있었음

        if(subHeight === '0px'){ //0이면 닫혀있다는 의미로 보면 됨
            slideUp(); //다른 sub =0px로 만들어서 닫게 만드는 것
            this.nextElementSibling.style.height = '108px'; //열고
        }else{
            this.nextElementSibling.style.height = '0px'; //닫고
        }
    });
});

function slideUp(){    // js엔 슬라이드업이라는 명령어가 없어서 만들어버리는 중임
    sub.forEach(function(item){
        item.style.height='0px';
    }); //열려있을 슬라이드를 닫아버리게 명령어를 만들었음
};