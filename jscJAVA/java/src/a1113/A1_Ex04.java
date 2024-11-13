package a1113;

public class A1_Ex04 {
    public static void main(String[] args) {
        Integer a = null; // 한자로는 없을무. 아무것도 없다 라는 의미
        int b = a;  // int는 null값을 받을 수 없다? Integer는 가능하다?

        System.out.println(b);

        //Integer는 객체 타입이므로 null값을 가질 수 있다.
        //int는 기본 타입임임으로 null이 허용이 안된다.
    }
}
