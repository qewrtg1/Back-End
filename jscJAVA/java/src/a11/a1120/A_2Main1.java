package a11.a1120;

public class A_2Main1 {
    public static void main(String[] args) {
        C_2ProductStatus status = C_2ProductStatus.SELL; 
        //ProductStatus.java가 반드시 있어야 실행됨. 이름만 맞추면 되는듯.

        System.out.println(status);          // 출력: SELL
        System.out.println(C_2ProductStatus.SOLD_OUT); // 출력: SOLD_OUT
    }
}
