package a1113;
//나 근데 못풀어서 걍 교수님 답 그대로 쓸 생각.
import java.util.Scanner;

public class B4_Q1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 :");
        int num = scanner.nextInt();
        
        int sum = 0;

       for(int i = 1; i<=num;  i++ ){
        sum += i;
       };
       System.out.println("1부터 "+num+"합계 : " + sum);
    }
}
