package a1114;
//89p
public class A_1_0_InfinityNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;


        // double z= x/y; //infinity 라고 나옴
        double z = x % y ; // NaN 이라고 나옴 잘못된 코드일 때?

        System.out.println(z+2); 
        //지금처럼 infinity나 NaN가 나오는 경우엔 예외처리를 해야함.

    }
}
