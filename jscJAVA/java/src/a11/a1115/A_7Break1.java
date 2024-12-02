package a11.a1115;

import java.util.Scanner;

public class A_7Break1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        while (true) {// true: 입력받은 것을 출력하라 = 무한 반복문이 되어버림
            // 이럴 경우 반드시 종료 조건을 추가해야한다(break)
            System.out.print("입력 : ");
            String str = sc.nextLine();


//문자열. equals("비교문자열")
//문자열이 비교 문자열과 일치하는지 여부를 알려주는 메소드이다.
            if(str.equals("q")){
                break;
            }

            System.out.println("입력받은 문자: "+ str);
        }
        System.out.println("프로그램을 종료합니다");
        sc.close();

    }
}
