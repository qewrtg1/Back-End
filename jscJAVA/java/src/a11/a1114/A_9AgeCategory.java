package a11.a1114;
//106p
import java.util.Scanner;


public class A_9AgeCategory {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 나이를 입력해주세요: ");
        int age = scanner.nextInt();



        String grade = (age <= 12 && age >=0) ? "어린이" : (age <= 19 && age >=13) ? "청소년" : "성인";
        System.out.println(age + "세는 " + grade + "입니다.");

    }
}
