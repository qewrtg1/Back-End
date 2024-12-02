package a11.a1114;
// 2랑 3은 결과는 똑같음
import java.util.Scanner;

public class A_12_4Yun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력 : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("윤년 입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }

    }
}
