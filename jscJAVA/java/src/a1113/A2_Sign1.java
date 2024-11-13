package a1113;

public class A2_Sign1 {
    public static void main(String[] args) {
        int x = -100;
        x = -x;  // -1 * 한 것과 같음
        System.out.println("x: "+ x);
       
        byte b = 100;
		int y = -b; 
		System.out.println("y: " + y);
    }
}
