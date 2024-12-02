package a11.a1113;
//내가 푼 해답
import java.util.Scanner;

public class B2_Q1_0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("정수를 입력하세요: ");
		int a = scanner.nextInt(); 


        if(a % 2 == 0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");

        }
    }
}
