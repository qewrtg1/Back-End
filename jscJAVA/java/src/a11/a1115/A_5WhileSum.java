package a11.a1115;


public class A_5WhileSum {
    public static void main(String[] args) {
        //1~100까지 합계를 구하시오
        //합계 : 5050
        //합계를 누적시키는 놈(1), 증가시키는 놈이 필요하다(2)



        int a = 1;
        int sum = 0; //(1)
        // while문의 조건 :while(조건){반복 실행문}

        while (a<=100) {
            // sum = sum + a;   // 여기가 중요한데 a++과의 위치가 달라지면 후순위 연산법칙에 의해서 계산이 틀려짐
            // a++; //(2) 이하의 내용은 아래로 바꿀 수 있다
            sum= sum + a++;
        }
        System.out.print("합계: "+ sum); 

    }
}
