package a1114;
// 내가 한 거
import java.util.Scanner;

public class A_12_0Yun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("올해 연도를 입력해 주세요: ");
        int num = scanner.nextInt();

        int test = num % 100;

        if (test == 0) {
            System.out.println(num + "년은 윤년입니다.");
        }else if(test != 0){
            System.out.println(num + "년은 윤년이 아닙니다.");
        }
    }
    
}

// 사용자에게 연도를 입력받아, 그 해가 윤년인지 아닌지를 출력하는 프로그램을 작성하세요. 
// 윤년의 조건은 다음과 같습니다.

// 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때 윤년입니다.
// 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...

// ☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...

// ☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...

// 예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다
