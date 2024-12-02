package a11.a1112;

import java.util.Scanner;

public class scan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String a = scanner.nextLine();   // 얘랑
				
		System.out.print("y 값 입력: ");
		String b = scanner.next();   // 얘의 차이점이 뭘까
        
        
        System.out.println(a);
        System.out.println(b);

    }   
}
// 차이점 : next는 단어까지만. 
// nextLine은 문장까지 담을 수 있음