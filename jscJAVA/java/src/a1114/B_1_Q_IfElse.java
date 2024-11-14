package a1114;
//나
import java.util.Scanner;

public class B_1_Q_IfElse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 월을 입력해 주세요 :");
        int num = scanner.nextInt();
        
		
		if( (num>=3) && (5<=num) ) {  
			System.out.println("봄 입니다");
		}else if( (num>=6) || (8<=num) ) {  
			System.out.println("여름 입니다");
		}else if( (num>=9) || (11<=num) ) {  
			System.out.println("가을 입니다");
		// }else ( (num == 12) || (1<=num) ) {  
		// 	System.out.println("겨울 입니다");
		}
    }
}
