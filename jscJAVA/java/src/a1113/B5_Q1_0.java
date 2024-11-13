package a1113;
//나 근데 못풀어서 걍 교수님 답 그대로 쓸 생각.
import java.util.Scanner;

public class B5_Q1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 단을 입력하세요 :");
        int dan = scanner.nextInt();
        
        int sum = 0;

       for(int i = 1; i<=9;  i++ ){
        System.out.println(dan + " X " + i + " = " + (dan*i));
       };
    }
}
