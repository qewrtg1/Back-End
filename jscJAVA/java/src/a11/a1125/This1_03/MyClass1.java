package a11.a1125.This1_03;

public class MyClass1 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10); 
        obj1.myMethod();
        MyClass obj2 = new MyClass(); //다른 생성자 호출
        obj2.myMethod();//메서드 호출
    }
}


class MyClass {
    int myVariable;

    public MyClass(int myVariable9905) {
        this.myVariable = myVariable9905;
        //여기서 this는 obj1에 해당하는 객체를 가리킴
    }

    public MyClass(){
        this(0);
        //여기서 this는 다른 생성자를 호출한다. (????)

    }
    public void myMethod(){
        //여기서 this는 해당 객체를 가리킴
        System.out.println("My variable value is " + this.myVariable);
    }
}

//this와 this()는 각각 객체의 참조, 생성자 호출을 함. 요컨대 다르다
//this.myVariable 객체의 필드를 가리키고 있으며
//this()는 다른 생성자를 호출하는데 사용한다.
