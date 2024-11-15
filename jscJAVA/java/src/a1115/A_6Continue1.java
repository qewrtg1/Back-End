package a1115;

import java.util.Scanner;

public class A_6Continue1 {
    public static void main(String[] args) {
        //5개의 정수를 입력 받아 받은 수 중 양수(+)만의 합계를 구하여 출력하시오

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < 5; i++){ //정수는 음수까지 포함한 수를 말한다. 그래서 양수만의 합을 구한다고 위에서 표현했음
            
            System.out.println("정수를 입력하시오: ");
            int n = sc.nextInt(); //for문 안에 넣어서 입력을 5번 받을 수 있게 된다.

//음수 거르는 코딩
            if(n < 0 ){
                continue;  // 이렇게 for문 안에 넣어두면 음수가 나왔을 시 되돌린다?
            } //남은 실행문을 무시하고 다음 반복으로 복귀 시킨다.
//음수일 때만 합계에 누적하지 않고 넘어가려면 이렇게 하면 된다.


//이하 두개는 반드시 구분할 줄 알아야 함.
//break : 여기서 안 알려줘서 A-7보셈
//continue : 반복하다가 조건에 부합되지 않으면 되돌리게 하는 것.



            sum += n; //이렇게 해야 됨 sum = sum + n

        }
        System.out.println("양수의 합은: " + sum + "입니다.");
        sc.close();



    }
}
