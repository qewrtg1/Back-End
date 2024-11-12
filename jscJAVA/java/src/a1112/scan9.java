package a1112;

import java.util.Scanner;

public class scan9 {
    public static void main(String[] args) {

        // 입력을 A B를 입력했다고 가정할 때, 
        // 출력하는 값이 B A로 한 줄에 나오게 하고 싶음.


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("시(hour) 입력: ");
		String a = scanner.next();   
				
		System.out.print("분(minute) 입력: ");
		String b = scanner.next();   
        
        
        System.out.print(a + ":" + b); //한줄에 다 출력시키는 방법.


    }   
}
