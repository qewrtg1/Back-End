package a11.a1111;

public class Var1 {
    public static void main(String[] args) {

        // int value;  이렇게만 넣으면 값이 지정되지 않아서 에러가 남.
        // 초기화 되지 않은 변수는 연산식에서 사용할 수 없다.
        int value = 0 ; // 값을 넣어서 초기화? 시켜준다고 표현하는듯.
        int result = value + 10; // result는 안에 값이 들어가기에 ㄱㅊ

        System.out.println(result);
    }
    
}
