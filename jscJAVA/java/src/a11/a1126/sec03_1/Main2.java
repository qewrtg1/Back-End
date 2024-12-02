package a11.a1126.sec03_1;

class Parent {
    int x = 10;
    void show(){
        System.out.println("Parent show()");
    }
}
class Child extends Parent {
    int x = 20;
    void display(){
        System.out.println("X in child: " + x);//자식 클래스의 X
        System.out.println("X in parent: " + super.x);//부모 클래스의 X
        super.show(); //부모클래스의 show()메소드 호출
    }
}
public class Main2 {
    public static void main(String[] args) {
        Child 만 = new Child();
        만.display();
    }
}
//super()는 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출한다

//부모 클래스의 기본 생성자가 없으면(매개변수를{만} 갖는 생성자만 존재하면) 
//자식 클래스에서  super() 사용해


//부모 클래스의 매개 변수를 받는 생성자를 명시적으로 호출 해야한다.

//super를 사용하여 부모 클래스의 필드나 매소드 접근이 가능
//super()는 자식 클래스의 생성자에서 첫번째로 호출해야함