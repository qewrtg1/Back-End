package a1114;
// 2랑 3은 결과는 똑같음
import java.util.Scanner;

public class A_12_3Yun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력 : ");
        int a = sc.nextInt();
        if(a %400 == 0){
            System.out.println("윤년입니다.");
        }else if(a %100 == 0){
            System.out.println("윤년이 아닙니다.");
        }else if(a%4 == 0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }

    }
}
