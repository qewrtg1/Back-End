const btnCollapse = document.querySelector('#btn-collapse');//all버튼
const heading = document.querySelectorAll('.panel-heading');
const question = document.querySelectorAll('.panel-question');
// heading 과 body를 감싸는 qusstion
const p_body = document.querySelectorAll('.panel-body');


heading.forEach(function(headingElement){

    headingElement.addEventListener('click',function(e){
        question.forEach(function(q){
            q.classList.remove('on');//on을 없애게 만들어서 축소시키고
        });
        e.target.parentNode.classList.add('on'); //on추가해서 확대시키려고

    });

});
btnCollapse.addEventListener('click',function(){
    question.forEach(function(q){
        q.classList.remove('on');
    });
});