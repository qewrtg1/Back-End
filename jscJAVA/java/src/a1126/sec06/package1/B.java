package a1126.sec06.package1;

public class B{

    public static void main(String[] args) {
        
        A a = new A();
        a.field = "value";
        a.method();
        //값은 프로텍트 때문에 출력 안 되더라도 에러는 안 남.
    }
}
