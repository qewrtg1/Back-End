package a11.a1115;


import java.util.Scanner;

public class A_10DoWhile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;

        do{
            System.out.print("숫자를 입력하시오: ");
            number = sc.nextInt();
            System.out.println("입력한 숫자: " +  number);

        }while(number != 0);
        System.out.println("프로그램 종료");
    }
}
