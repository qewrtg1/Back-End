package a11.a1112;

import java.util.Scanner;

public class scan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // 한줄 띄어쓰기 효과
        System.out.print("x 값 입력: ");
		String strX = scanner.nextLine(); //nextLine : 문자를 한줄 입력 받을 수 있다?
		int x = Integer.parseInt(strX); //parseInt: 얘가 nextLine를 숫자로 바꿔서 입력받을 수 있게 해주는 놈임
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y : " + result);
 
        while(true){ //for문과 다른 반복문. for는 정해진 횟수 반복. while은 무한정
            System.out.print("while 반복문입니다. 입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("종료")){
                break;
            }
            System.out.println("출력문자열 :" + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
