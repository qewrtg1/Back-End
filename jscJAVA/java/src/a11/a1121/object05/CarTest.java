package a11.a1121.object05;

public class CarTest {
    public static void main(String[] args) {


        
        //객체 = 클래스에 설계된 내용을 바탕으로 생성하는 것.                            (2)
        // new 라는 태그를 이용해서 설계도를 통해 하나 찍어내야함.
        // 객체 = 인스턴스 (같은 개념으로 이해해. 동음이의어라고 생각해.)
        // 그래서 이걸(Car |'genesis'|) 표현할 때 인스턴스 변수, 라고 표현한다고 함.


        Car genesis = new Car("g80", "black", 1000); //<-- 객체 선언이라고 함(객체를 선언한다)
                                                                        // 근데 이걸 선언하려면 (3) 생성자부터 해야함


        System.out.println("모델명 : " + genesis.model);
        System.out.println("색상 : " + genesis.color);
        System.out.println("가격(단위: 만 원) : " + genesis.model);



        genesis.powerOn();                  //(4) 객체.메소드 : 이렇게 입력하면 그 메소드값을 불러오거나 실행할 수 있음.
        genesis.accelerate();
        genesis.stop();


        //(4-상세 설명)
        //genesis.powerOn();
        //생성된 객체를 사용하는 방법은, 포인트 연산자(    .     {온점}) 을 사용하여
        //객체에 접근할 수 있다.


    }
}
