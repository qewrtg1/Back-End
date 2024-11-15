package a1115;

import java.util.Scanner;

public class A_7Break {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        while (true) {// true: 입력받은 것을 출력하라 = 무한 반복문이 되어버림
            // 이럴 경우 반드시 종료 조건을 추가해야한다(break)
            System.out.print("입력 : ");
            String str = sc.nextLine();

            System.out.println("입력받은 문자: "+ str);
        }

    }
}
