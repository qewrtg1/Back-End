


var ham = document.querySelector('.ham');
var nav = document.querySelector('.nav');
ham.addEventListener('click',function(){
    if(ham.classList.contains('on')){ //ham 클래스 on있으면
        slideUp();
        ham.classList.remove('on');
        nav.classList.remove('active');
    }else{
        ham.classList.add('on');
        nav.classList.add('active');
    }

});
var menuLiA = document.querySelectorAll('.nav>ul>li>a');
var sub = document.querySelectorAll('.sub');
menuLiA.forEach(function(item){
    item.addEventListener('click',function(){
        var subHeight = getComputedStyle(this.nextElementSibling).height;

// 여기 0px을 주는걸로 메뉴가 들어갈때 초기화 시켜서 처음과 같은 상태로 다시 나오게 하는 걸 넣었는데 어딘질 모르겠음
// 3-2와의 차이점

        if(subHeight == '0px'){  
            slideUp();
            this.nextElementSibling.style.height = '120px';
        }else{
            this.nextElementSibling.style.height = '0px';
        }
    });
});
function slideUp(){
    sub.forEach(function(item){
        item.style.height = '0px';
    });
}