package a1114;
// 2랑 3은 결과는 똑같음
import java.util.Scanner;

public class A_12_5Yun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력 : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("윤년 입니다.");
        }else
            System.out.println("윤년이 아닙니다."); 
//문장이 하나일 때는 중괄호 없어도 된다는 걸 보여주는 것 4와 별차이 없음

        

    }
}
