package a11.a1120;

import java.util.Scanner;

public class B_2_0Hak091 {
    public static void main(String[] args) {
        
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int stu = 0;
        int [] sco = null;

        

        while (run) {//참 거짓을 토대로 계속 돔

            System.out.println("===========================================================");
            System.out.println("1.학생 수 | 2.점수 입력 |  3.점수 리스트 |  4.분석 | 5. 종료 |");
            System.out.println("===========================================================");
        
            System.out.println( "선택>");
        

           int sel = Integer.parseInt(scanner.nextLine());
            if(sel == 1){
                System.out.println("학생수");
                stu = Integer.parseInt(scanner.nextLine());
                sco = new int[stu];
            }else if(sel == 2){
                for(int i = 0; i< sco.length; i++){
                    System.out.println("점수["+i+"]");
                    sco[i] = Integer.parseInt(scanner.nextLine());
                }
            }

        }
    }
}

