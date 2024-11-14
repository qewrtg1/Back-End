package a1114;

public class A_5Bitshift {
    public static void main(String[] args) {
        int num1 =1;
        int result1 = num1 << 3; //좌로 3칸 이동 해라 라는 뜻 2진수 0000 0001이 3칸 이동해서 8?
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result2 : "+ result1);
        System.out.println("result2 : "+ result2);

    }
}
