package a11.a1121.method06;

public class A1MethodTypeTest {
    
    public static void main(String[] args) {
        
        A1MethodType test = new A1MethodType();

//문제1
        test.printName(); //출력이 홍길동이 되게

        int t = test.printNumber(); // 10 나오게끔
        System.out.println("q반환값은 : "+ t);


        test.multiply(2, 4.5); // multiply의 함수로 곱샘하도록
    
    
    }
}
