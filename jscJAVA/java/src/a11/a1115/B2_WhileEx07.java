package a11.a1115;

import java.util.Scanner;

//141p 7번 문제 정답
public class B2_WhileEx07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int balance = 0; //잔액임

       // int money = 0;(1-1)



        while (run) {
            System.out.println("=================================");
            System.out.println("1.예금 | 2.출금 |  3.잔고 |  4.종료 | ");
            System.out.println("=================================");
            System.out.println("선택>");
//sc 입력 변수 menuNum
            int menuNum = Integer.parseInt(sc.nextLine()); 
            //숫자로 입력한 것이 만일이라도 문자로 읽힐 수 있기에 이렇게 확실하게 숫자로 변환시키게 코딩해줌



            switch (menuNum) {
                case 1: 
                    System.out.print("예금액> ");
                    // money = Integer.parseInt(sc.nextLine()); 
                    // balance = balance+money;  //(1-1) : 변수를 따로 사용하여 입력받고 진행하는 방법1.
                    balance += Integer.parseInt(sc.nextLine()); //변수를 따로 만들고 싶지않을때 이렇게 한번에 요약해서 사용할 수 있음
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(sc.nextLine()); 
                    break;
                case 3: 
                    System.out.print("잔고>");
                    System.out.println(balance);
                    break;
                case 4: 
                    run = false; //위 while의 변수명에 false를 집어넣음으로서 종료시킴
                    break;

                default: 
                    System.out.println("잘못 입력하셨습니다 다시 입력해주세요>");
                    break;
            }
            System.out.println();

        }
        System.out.println("프로그램을 종료합니다.");
        // sc.close();

    }
  
}
