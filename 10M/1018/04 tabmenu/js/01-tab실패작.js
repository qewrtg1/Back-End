
const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
const tabContent=document.querySelectorAll('#tabContent>div');


// targetLInk 배열을 foreach로 순회 시켜야 함
targetLink.forEach(function(link){

    link.addEventListener('click',function(e){
        e.preventDefault(); 
        
        //링크 금지 시키는 명렁어
        let orgTarget = e.target.getAttribute('href');
        //클릭 (e.taget) = this로 변경이 가능함 똑같음.
        //getAttribute : 는 href, src 속성값을 읽어옴
        // alert(orgTarget); #tab1~3, 작동 잘 되는 지 확인용

        let tabTarget = orgTarget.replace("#","");
        //tab1에서 #을 빈문자열로 대체함 ("#"을 ""안에 들어 있는 걸로 대체한다는 뜻)
        // alert(tabTarget); 확인용


//목표1. 모든 tabContent의 내용을 안보이게 하는 것
tabContent.forEach(function(content){
    content.style.display = "none";
}); 
//클릭한 탭만 보이게 설정하려면
document.getElementById(tabTarget).style.display="block";
//tabTarget : let으로 선언한 걸 가져와서 " "를 안쓰나봄


    });
//여기까지 햇는데 뭔가 망가진 거 같아서 바꿈
// 스펠링 문제와 const tab all 마지막에서 실수했었음
});
