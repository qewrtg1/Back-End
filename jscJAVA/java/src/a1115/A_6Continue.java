package a1115;

import java.util.Scanner;

public class A_6Continue {
    public static void main(String[] args) {
        //5개의 정수를 입력 받아 받은 수 중 양수(+)만의 합계를 구하여 출력하시오

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < 5; i++){ //정수는 음수까지 포함한 수를 말한다. 그래서 양수만의 합을 구한다고 위에서 표현했음
            
            System.out.println("정수를 입력하시오: ");
            int n = sc.nextInt(); //for문 안에 넣어서 입력을 5번 받을 수 있게 된다.

            sum += n; //이렇게 해야 됨 sum = sum + n

        }
        System.out.println("양수의 합은: " + sum + "입니다.");
        sc.close();
                    //여기까지가 정수는 더하게 하는 것



    }
}
