package a11.a1126.sec02;


class Parent {
    Parent(String name) {
        System.out.println();
        System.out.println("Parent constructor with name: " + name);
        System.out.println();
    }
}


class Child extends Parent {
    Child() {
        super("John");  // 부모 클래스의 생성자를 명시적으로 호출 (자동 호출됨)
        System.out.println("Child constructor");
        System.out.println();
    }
}


public class MNINHYG {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("실험결과 출력: " + child);
    }
}
