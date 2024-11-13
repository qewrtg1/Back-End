package a1113;

public class A1_Ex02 {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.5;
        double result = x + y; 
// 숫자 계산은 자연스럽게 더 큰 값으로 변환됨
// 정수보다 실수의 범위가 더 크기 때문에 int의 10진수(정수)는 double의 실수로 치환됨
        System.out.println(result); // = 13.5
    }
}
