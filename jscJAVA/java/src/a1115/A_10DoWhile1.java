package a1115;

import java.util.Scanner;

public class A_10DoWhile1 {
    
    public static void main(String[] args) {
        //변수 선언: 메뉴 번호, 메뉴 이름

        int menuNO=0;
        String menuName = " ";
        Scanner sc = new Scanner(System.in);
// do while문
//무조건 1회는 실행 후 조건을 검사하여 반복하는 문장.

        do{
            System.out.println("#### 점심 메뉴판 ####");
            System.out.println("1. 서브웨이(에그마요)");
            System.out.println("2. 라면");
            System.out.println("3. 주먹밥");
            System.out.println("4. 국수");
            System.out.println("5. 버거");
            System.out.println("6. 카레");
            System.out.println("7. 보텐");
            System.out.println("8. 까스");
            System.out.println("9. 페이페이");
            System.out.println("10. 라밥");
            System.out.print("메뉴 번호 : ");


            menuNO = sc.nextInt();

            switch (menuNO) {
                case 1: menuName = "서브웨이(에그마요)";
                    break;
                case 2: menuName = "라면";
                    break;
                case 3: menuName = "주먹";
                    break;
                case 4: menuName = "국수";
                    break;
                case 5: menuName = "버거";
                    break;
                case 6: menuName = "카레";
                    break;
                case 7: menuName = "보텐";
                    break;
                case 8: menuName = "까스";
                    break;
                case 9: menuName = "페이페이";
                    break;
                case 10: menuName = "라밥";
                    break;
                default: menuName = "굶기";
                    break;
            }


            //메뉴 번호 유효성 검사
            if(menuNO !=-0 && menuNO <=10) {//&&:and
                System.out.println(menuName + "(을/를) 선택했습니다.");
            }else if(menuNO !=-0){
                System.out.println(menuName); //잘못 골랐을 때 일부로 대사가 안나오게 한다?
            }


        }while(menuNO !=0); //메뉴넘버가 0번이 아닐때 만 시행하라 = 반대로 말하면 0 번이 아니면 무한 반복한다.
        //무한루프 : 조건이 항상 true가 되는 경우 반복이 계속되는 상황
        //-반드시, 반복문 안에 종료 조건을 넣어야 한다.

        System.out.println("메뉴판을 종료합니다.");
        
        sc.close();

    }
}
