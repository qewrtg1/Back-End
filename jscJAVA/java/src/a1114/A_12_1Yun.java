package a1114;
// 풀이 1
import java.util.Scanner;

public class A_12_1Yun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("올해 연도를 입력해 주세요: ");
        int a = sc.nextInt();

        if (a%4 == 0) {
            if(a%400 !=0 &&a%100 == 0){ // 2100
                System.out.println("윤년이 아닙니다.");
            }else{
                System.out.println("윤년입니다.");
            }
    
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
