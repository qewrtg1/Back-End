package a1113;
//나
import java.util.Scanner;

public class B6_Q1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수(1)를 입력하세요 :");
        int dan1 = scanner.nextInt();
        System.out.print("정수(2)를 입력하세요 :");
        int dan2 = scanner.nextInt();
        System.out.print("정수(3)를 입력하세요 :");
        int dan3 = scanner.nextInt();


        int sum = dan1 + dan2 + dan3; // 합
        double ham = (double) sum / 3; //평균

        

        System.out.println("세 정수의 합: " + sum);
        System.out.println("세 정수의 평균: " + (double)dan1+dan2+dan3/3);
       };
    }
