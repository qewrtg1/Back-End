package a11.a1114;
//106p
import java.util.Scanner;


public class A_9AgeCategory2 {
    public static void main(String[] args) {
        int age = 15; // 나이를 이곳에서 설정하세요.
        
        // 삼항 연산자를 사용해 나이 카테고리 분류
        String category = (age >= 20) ? "성인" : (age >= 13) ? "청소년" : "어린이";
        
        System.out.println(category);
    }

    
}