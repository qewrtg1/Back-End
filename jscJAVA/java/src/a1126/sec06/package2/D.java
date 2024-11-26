package a1126.sec06.package2;

import a1126.sec06.package1.A;

public class D extends A{
    //생성자 선언
    public D(){
        //A() 생성자 호출
        super();
    }//폴더가 달라도 된다는 걸 보여주고 싶었다???


    public void method1(){
// A 필드값을 변경하자
        this.field = "vaule"; // 부모의 
        this.method(); //A에 있는 메소드를 호출하는거야 폴더가 달라도
    }//부모의 필드와 메소드를 사용할 수 있다 이걸 말하고 싶은 거 같은데.


    public void method2(){
        // A a = new A(); 이거 안됨.x
        // a.field = "value"
        // a.method()
        //이유는 305p 확인
        //요약하면 접근은 되는데 생성자를 직접 호출할 수는 없다.
        //super는 된다?
    }




}
