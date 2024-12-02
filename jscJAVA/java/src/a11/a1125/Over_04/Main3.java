package a11.a1125.Over_04;

public class Main3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
// 오버로딩 : 
// println 라는 함수를 만들어서.
// 메서드를 각각, int boolean double string 타입으로 
// 오버로딩하여 선언?
class Printer{
    public void println(int value){
        System.out.println(value);
    }
    public void println(boolean value){
        System.out.println(value);
    }
    public void println(double value){
        System.out.println(value);
    }
    public void println(String value){
        System.out.println(value);
    }


}

// 이걸 왜 했는가.

// 메인을 보면 별도로 함수? 타입을 지정하지 않았는데

// 클래스에 있는 메소드를 알아서 잘 찾아감 가져감.

// 이런걸 오버로딩이라고 한다?