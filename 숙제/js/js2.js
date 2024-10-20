


var list = document.getElementById('banner1');
var listLi = document.querySelectorAll('#banner1 li');
var prev = document.querySelector(".prev");
var next = document.querySelector(".next");


var show_num = 1; //보이는 사진의 갯수
var total = 4;
    //var total = listLi.length;
    // alert(total);
    //var li_width = document.querySelector("#banner > li").offsetWidth;
    //alert(li_width);
    var li_width = 400; //li크기 (이미지크기72 +8) 

    var num = 0;




    next.addEventListener('click',function(){
        if(num==5){
            num = 0;
            list.style.transition = 'none';
            list.style.marginLeft = 0;
        }

        setTimeout(function(){
            num++;
            list.style.transition = 'margin-left 0.5s';
            list.style.marginLeft = -li_width * num +"px";
        },50);
        
    });    

    prev.addEventListener('click',function(){
        if(num==0){
            num = 5;
            list.style.transition = 'none';
            list.style.marginLeft = -li_width * num + "px";
            // 맨 끝의 사진의 위 -400px
        }

        setTimeout(function(){
            num--;
            list.style.transition = 'margin-left 0.5s';
            list.style.marginLeft = -li_width * num +"px";
        },50);
        
    });    



function autoplay(){
      if(num==5){
            num = 0;
            list.style.transition = 'none';
            list.style.marginLeft = 0;
        }

        setTimeout(function(){
            num++;
            list.style.transition = 'margin-left 0.5s';
            list.style.marginLeft = -li_width * num +"px";
        },50);
}
setInterval(autoplay, 3000);
