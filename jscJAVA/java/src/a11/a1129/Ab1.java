package a11.a1129;

abstract class Animal{ // abstract : 추상적인,

    // 추상 클래스는 그 "설계도" 같은 역할을 한다
    // 자바에서 추상 클래스는 바로 이런 설계도처럼, 기본적인 틀을 제공하고, 
    // 구체적인 동작은 자식 클래스(자동차를 만든 사람들이)에게 맡기는 역할을 해

    int a = 10; // 일반 함수를 넣을 수 있다는 걸 보여준 예시.
    
    abstract void cry();
    //추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면 일반 클래스와 동일하다
    //즉 생성자와 필드, 일반 메소드를 포함할 수 있다.    
}


class Cat extends Animal{ //부모를 승계받고 반드시 오버라이드를 해줘야 함.
    @Override
    void cry() {
        System.out.println("냐옹냐옹!");
    }
}
class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("왈멍멍왈!");        
    }
}



public class Ab1 {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 추상 클래스는 이렇게 인스턴스(객체)를 생성할 수 없다.
        Cat c = new Cat(); // 자식으로 객체 생성
        Dog d = new Dog(); // 요컨대 부모 객체 생성이 안된다는 뜻

        c.cry();
        d.cry(); // cry 자체가 so값을 출력하는 메소드니까 

        Animal e = new Cat(); // 추상클래스를 직접 객체로 생성할 수는 없지만 이렇게 자식을 활요하여 객체를 생성할 수 있음
        Animal f = new Dog(); // 자식을 가져와 부모에 끼워서 객체를 생성하는 걸 업 캐스팅이라고한다?

        e.cry(); // 테스트용
        f.cry(); // 자식을 부모타입으로 업캐스팅 후, cry 메서드를 호출함(다운캐스팅 안해도 됨? <뭔말인지 모름)
        //이런걸 다형성? 이라고 하나봄.
    }
}
