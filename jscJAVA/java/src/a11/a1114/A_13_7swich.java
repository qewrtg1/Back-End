package a11.a1114;

import java.util.Scanner;

public class A_13_7swich {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하시오 : ");
        double num1 = sc.nextDouble();
        System.out.print("연산자 입력하시오(+,-,*,/) : ");
        char oper = sc.next().charAt(0); //charAt(0): 입력된 첫 번째(인덱스번호0) 글자만 가져오겠다
        System.out.print("두 번째 숫자를 입력하시오 : ");
        double num2 = sc.nextDouble();


        switch (oper) {
            case '+':
                System.out.println("결과: "+ (num1+num2));
                break;
            case '-':
                System.out.println("결과: "+ (num1-num2));
            break;            
            case '*':
                System.out.println("결과: "+ (num1*num2));
            break;      
            
            
//여기 중요
            //만약 0이 들어 갈 경우 0으로 나눌수없어 인피니티가 뜨기 때문에 예외처리 해줘야 함
            case '/':
                if(num2 != 0 ){
                    System.out.println("결과: " +(num1/num2));
                }else{
                    System.out.println("0으로 나눌 수 없어요!");
                }
                break;
            default: // 숫자 외의 문자가 섞일 시 출력됨?
                System.out.println("잘못된 연산자 입니다.");

        }
        sc.close();// 앞으론 이렇게 마무리에 닫아야함.
    }
}




// 간단한 계산기
// 사용자로부터 두 숫자와 연산자를 입력받아 계산 결과를 출력하는 프로그램을 작성하세요. 연산자는 +, -, *, / 중 하나입니다.

// 예시:
// 숫자 5, 연산자 +, 숫자 3을 입력하면 5 + 3 = 8을 출력