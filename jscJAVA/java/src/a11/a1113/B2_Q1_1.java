package a11.a1113;
//교수님이 만든 해답
import java.util.Scanner;

public class B2_Q1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int num = scanner.nextInt();

       if(num % 2 == 0){
           System.out.println(num + "은 짝수입니다.");
       }else{
           System.out.println(num + "은 홀수입니다.");
       }
    }
}
