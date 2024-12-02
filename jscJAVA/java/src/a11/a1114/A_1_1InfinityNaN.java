package a11.a1114;
//92p
public class A_1_1InfinityNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z= x/y;


        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z+2);
        } // 이런식으로 예외처리 한다는데 잘 모르겠음.


    }
}
