



const targetLink = document.querySelectorAll('.t1 a'); //탭버튼
const tabContent = document.querySelectorAll('#middle>div'); // 메뉴 내용

    targetLink.forEach(function(link){

        link.addEventListener('click', function(test1){
            test1.preventDefault();
            let Target1 = test1.target.getAttribute('href');
            // alert(Target); 10.18 16:46 확인 완료.
            let Target2 = Target1.replace("#","");
            //이게 필요한지는 모르겠음
            // alert(Target2);   //일단 여기까진 이상무


        //모든 tabContent을 안보이게 설정
            tabContent.forEach(function(content){
                content.style.display = "none";
            });
            document.getElementById(Target2).style.display="block";
                    // querySelector   getElementById

            


        //     // targetLink.forEach(function(link2){
        //     //     link2.classList.remove('active');
        //     //     test1.target.classList.add('active');
        //     // });

        })
    });