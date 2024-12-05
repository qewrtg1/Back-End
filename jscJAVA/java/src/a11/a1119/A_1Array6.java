package a11.a1119;

import java.util.Random;

public class A_1Array6 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];

        Random random = new Random();
        //랜덤한 숫자를 생성하는 클래스를 객체로 생성함.

        for(int i = 0; i<numbers.length; i++){
            numbers[i]=random.nextInt(100);
        };
        //컴퓨터에게 숫자 배열의 i번째 자리에서 0~99 사이의
        //랜덤한 숫자를 하나 넣어줌
        for (int num : numbers) {
            System.out.print(num + " ");
        }//중복되서 나오긴 함.
            
        int max = numbers [0]; 
        int min = numbers [0];
        
        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
    }
}