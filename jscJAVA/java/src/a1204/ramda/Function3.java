package a1204.ramda;
//함수형인터페이스
interface Calculator {
    int sum(int a, int b);

}


public class Function3 {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;  // 1~2와 다른 부분이 여기임
                                        // 같은 값이 나옴

        int result =  mc.sum(3,4);
        System.out.println((result));
    }
}
