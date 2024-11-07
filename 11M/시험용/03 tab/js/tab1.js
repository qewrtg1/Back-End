const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
const tabContent=document.querySelectorAll('#tabContent>div');
// 탭내용

//targetLink 배열을 forEach로 순회

// targetLink.forEach(function(link){

//     link.addEventListener('click',function(e){
//         e.preventDefault(); //링크금지
//         let orgTarget = e.target.getAttribute('href'); // #tab2 
       
//         let tabTarget = orgTarget.replace("#",""); // tab2
        
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         }); 
        
//         document.getElementById(tabTarget).style.display="block";

//         targetLink.forEach(function(link2){
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });

       
//     }); 

// });  // 자바스크립트로 하는 방법
//이하 제이쿼리로하는 방법
$(".tab_munu a").click(function(){
    // let orgTarget = e.target.getAttribute('href'); // 이 내용을 제이쿼리로 바꿔보면
    let orgTarget = $(this).attr('href'); // 이렇게 됨
    $('#tabContent > div').hiee();//컨텐츠의 내용을 숨김
    $(orgTarget).show(); //== $('#tabs2').show 

    //$("#tabs2").show();
    $(".tab_menu a").removeClass('active');
    $(this).addClass('active');

    return false;
    
});