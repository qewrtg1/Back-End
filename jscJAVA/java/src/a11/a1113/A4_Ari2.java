package a11.a1113;

public class A4_Ari2 {
    public static void main(String[] args) {
      int apple =1;
      double pieceUnit = 0.1;
      int number =7;
      double result = apple - number*pieceUnit;
      System.out.println("사과 1개에서 남은 양: " + result);// 왜 0.3이 아닐까.
//컴퓨터는 근사치 값을 좋아함?
//부동 소수점이라고 한다?
    }
}
