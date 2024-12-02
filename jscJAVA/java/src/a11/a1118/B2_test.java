package a11.a1118;
import java.util.Scanner;
public class B2_test {


    // 숫자에 대한 한글 배열
    static String[] unit = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    static String[] tens = {"", "십", "백", "천"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 숫자 입력받기
        System.out.print("숫자를 입력하세요: ");
        int a = scanner.nextInt();
        
        // 숫자를 한글로 변환하여 출력
        System.out.println("입력한 숫자의 한글 표기: " + convertToKorean(a));
    }

    // 숫자를 한글로 변환하는 메서드
    public static String convertToKorean(int number) {
        if (number == 0) {
            return "영";
        }
        
        StringBuilder result = new StringBuilder();
        
        int unitPos = 0;  // 자리수 단위 (1, 10, 100, 1000)
        boolean hasUnit = false;  // 단위 없이 "일"이 나오는 경우를 처리
        
        while (number > 0) {
            int digit = number % 10;  // 현재 자리의 숫자
            if (digit > 0) {
                if (unitPos > 0 && digit == 1) {
                    result.insert(0, tens[unitPos]);  // '십', '백', '천' 등
                } else {
                    result.insert(0, unit[digit] + tens[unitPos]);
                }
                hasUnit = true;
            } else if (hasUnit) {
                // 0이지만 이전에 값이 있었던 경우에만 '영'을 삽입
                result.insert(0, "영");
            }
            
            number /= 10;  // 다음 자리로 이동
            unitPos++;  // 자리수 증가
        }
        
        // "일"이 10의 자리 앞에 나타나는 경우 처리
        if (result.length() > 0 && result.charAt(0) == '일' && result.charAt(1) == '십') {
            result.delete(0, 1);  // "일" 제거
        }

        return result.toString();
    }
}

