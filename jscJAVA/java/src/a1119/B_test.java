package a1119;

import java.util.Arrays;
import java.util.Scanner;
//실패함. 답안지는 test1에 보냅니다
public class B_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int number = scan.nextInt();
        System.out.print(">>" + number);



        int[] nums = new int[6];


        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        int a8 = 0;
        int a9 = 0;
        int a10 = 0;

        // int numbers = 0;


        nums[0] = number/100000; //만의 자리 수가 추출됨.
        nums[1] = (number/10000)%10;
        nums[2] = (number/1000)%10;
        nums[3] = (number/100)%10;
        nums[4] = (number/10)%10;
        nums[5] = (number/1)%10;

        for(int i = 0; i < 6;i++){
            if(nums[i] >= 1){
                a1 =nums[i];
            }
        }
        System.out.println("오만원권"+ a1 + "매");
        System.out.println("만원권"+ a2 + "매");
        System.out.println("오천원권"+ a3 + "매");
        System.out.println("천원권"+ a4 + "매");
        System.out.println("오백원"+ a5+ "매");
        System.out.println("백원"+ a6+ "매");
        System.out.println("오십원"+ a7+ "매");
        System.out.println("십원"+ a8 + "매");
        System.out.println("오원"+ a9 + "매");
        System.out.println("일원"+ a10 + "매");



    }


}



// m을 5만원으로 나눠
// 5만원으로 나눈걸 만원으로 또 나눠.