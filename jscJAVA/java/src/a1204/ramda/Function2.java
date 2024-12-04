package a1204.ramda;

//696
//함수형 인터페이스.
interface Calculator {
    int sum(int a, int b);
    // int mul(int c, int d); 두개 는 못 만든다?
}
// Calculator 인터페이스(interface) 메서드가 1개 이상이면 람다 함수는 사용할 수 없다.


class MyCalculator implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a+b; //람다를 적용한 함수... 람다가 뭐꼬
        //괄호 사이의 int a,b는 calculator 인터페이스 sum함수의 입력항목이 배당된다.
        /// 뒤에 -> a+b가 리턴값에 해당된다
        /// 이렇게 람다 함수를 사용하면 MyCalbulator와 같이 실제 클래스가 없어도
        /// Calculator 객체를 생성할 수 있고 일반적인 코드보다 간단하다.
    
        
        int result =  mc.sum(3,4);
        System.out.println(result);
    }
}
