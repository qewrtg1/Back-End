package a11.a1113;
//교수님 /71p의 실수 관련 %.x에 대해서 공부해두면 좋음
import java.util.Scanner;

public class B6_Q1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수(1)를 입력하세요 :");
        int num1 = scanner.nextInt();
        System.out.print("정수(2)를 입력하세요 :");
        int num2 = scanner.nextInt();
        System.out.print("정수(3)를 입력하세요 :");
        int num3 = scanner.nextInt();


        int sum = num1 + num2 + num3; // 합
        double avg = (double) sum / 3; //평균

        

        System.out.println("세 정수의 합: " + sum);
        System.out.printf("세 정수의 평균: %.2f\n" + avg);
        // System.out.printf("세 정수의 평균: %.1f\n" + (float)sum/3); // 도 가능하다. 71p 참고
       };
    }
