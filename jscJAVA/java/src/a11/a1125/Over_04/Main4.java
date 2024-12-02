package a11.a1125.Over_04;

public class Main4 {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        int result1 = calculator.add(3,4);//매개변수가 2개야.
        int result2 = calculator.add(3,4,5);//매개변수가 3개야.
        }
    }
                
                
    class Calculator {
        public int add(int i, int j) {
            return i+ j;
        }
        public int add(int i, int j, int k) {
            return i+ j + k;
        }
//함수명이 같다. 이걸 메소드 오버로딩이라고 한다....?
    
}