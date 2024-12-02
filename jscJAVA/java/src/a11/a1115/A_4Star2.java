package a11.a1115;

import java.util.Scanner;

public class A_4Star2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // System.out.println("*"); //별 늘어나는지 확인
            for(int j = 5; j >= i; j--){ // 괄호 안에 세미클론 넣으면 고장남
                System.out.print("*"); 
            }
            System.out.println(); //줄바꿈용+ 별을 5개 찍고 줄바꾸게 하는용?
        }

    }
}
