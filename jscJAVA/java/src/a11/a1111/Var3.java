package a11.a1111;
//책 40p 매우 중요 복습 반드시 필요
public class Var3 {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        System.out.println("x:" + x + ", y"+ y);


        int temp = x;
        x = y;//이렇게 하면 x의 본래값이 무시되고 y의 값 5가 x에 대입됨.
        y = temp; // temp엔 본래 x의 값 3이 저장되어 있음.


        System.out.println("x:" + x + ", y"+ y);

// x와 y의 값을 바꿔줄 때 java에선 1대1로 교환이 불가능함
// 그래서 이런 식으로 교환하는 거고 앞으로 평생 쓸 거니까 이 원리를 기억해야함
// 40p 그림 참고하면 이해가 쉬움.
    }
}
