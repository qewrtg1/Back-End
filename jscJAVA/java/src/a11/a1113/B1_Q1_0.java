package a11.a1113;
 //내가 푼 해답

import java.util.Scanner;

public class B1_Q1_0 {
    public static void main(String[] args) {
        
        // int a = 20;
        // int b = 10;
        // System.out.println(a + b);

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("첫 번째 정수를 입력하세요: ");
		int a = scanner.nextInt();   
				
		System.out.print("두 번째 정수를 입력하세요: ");
		int b = scanner.nextInt();  
        

        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));
    }
    
}
