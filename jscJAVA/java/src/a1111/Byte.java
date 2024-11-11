package a1111;
//41p의 타입과 메모리 크기에 대한 공부임
public class Byte {
    public static void main(String[] args) {
        byte a = 25;
        byte b = 110;
        // byte result = a + b; //크기에 문제가 있어서 안된다? -128~127까지만 저장되기 때문.
        int result = a + b;
        System.out.println(result);
        
    }
}
