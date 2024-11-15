package a1115;

import java.util.Scanner;

//141p 7번 문제
public class B1_WhileEx07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menuNum = 0;
        String menuName = " ";


        while (run) {
            System.out.println("1. 예금 확인");
            System.out.println("2. 출금");
            System.out.println("3. 잔고 확인");
            System.out.println("4. 종료");


            menuNum = sc.nextInt();

            switch (menuNum) {
                case 1: menuName = "예금액 > ";
                    break;
                case 2: menuName = "출금 > ";
                    break;
                case 3: menuName = "잔고 > ";
                    break;
                default: menuName = "종료 > ";
                    break;
            }

            if(menuNum !=-0 && menuNum <=4) {//&&:and
                System.out.println("선택>" + menuNum);
            }else if(menuNum !=-0){
                System.out.println(menuName); //잘못 골랐을 때 일부로 대사가 안나오게 한다?
            }

        }
        




    }
}
