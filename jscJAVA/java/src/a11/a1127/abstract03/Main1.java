package a11.a1127.abstract03;
// 327p

abstract class Animal{ //추상 클래스 선언 = abstract

    //필드
    String name;
    //생성자
    public Animal(String name) {
        this.name = name;
    }


    // 아래는 일반 메서드
    public void sleep(){
        System.out.println(name + "이(가) 잠을 잡니다");
    }


    // 아래는 추상 메서드(반드시 자식 클래스에서 구현이 필요함)
    public abstract void sound(); //메소드 명만 쓴 상태. 뭘하는지 기능은 안 넣음.
}



//구체적인 자식 클래스를 만들 거임

class Dog extends Animal{ // 1 // 후 오버라이드 하면 밑줄이 사라질 거임 4

    public Dog(String name){ //부모의 생성자 초기화// 2
        super(name);// 3
    }
    @Override
    public void sound() {
        System.out.println(name + "이(가) 멍멍 짖는다.");
    }
}

//위와 동일한 순서
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "이(가) 야옹 운다.");

    }
}





public class Main1 {
    public static void main(String[] args) {
        // Animal animal = new Animal() 위를 다 만들고 이걸 넣어보면 안된다는 걸 알 수 있음.
        // 추상클래스는 객체가 생성이 불가능하다, 는 걸 보여준 예시임

        Animal dog = new Dog("강아지 1호기");
        Animal cat = new Cat("고양이 1호기");

        dog.sleep();//공통 메서드를 호출.
        dog.sound();//강아지만의 메서드 호출
                    //이게 아까는 안됐다, 라고 하는데 어딜 말하는지 모르겠음 여기 페이지는 아닌듯.
                    //아무튼 자식에 오버라이드를 가져다 쓰는 게 가능하다.
                    //그냥 어캐스팅된 건 못 쓴다.
                    //부모 타입에 sound가 있고 자식이 그걸 오버라이드해서 된다? 라고 함.
                    

        cat.sleep();
        cat.sound();
    }
}
