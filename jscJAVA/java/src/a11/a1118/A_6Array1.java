package a11.a1118;
//168p
public class A_6Array1 {
    public static void main(String[] args) {
        //배열 변수 선여과? 배열 생성
        String[] season = {"Spring", "Summer", "Fall", "Winter"}; 
//대괄호의 위치는 변수명 오른쪽에 위치해도 된다. 근데 가급적이면 안 햇갈리게 스트링 옆에 붙이자

        System.out.println("배열1 : " + season[0]);
        System.out.println("배열2 : " + season[1] );
        System.out.println("배열3 : " + season[2] );
        System.out.println("배열4 : " + season[3] );
        System.out.println();

        //배열 변수 선언과 배열을 생성
        int[] scores = { 93, 90, 89};
        //총합과 평균을 구하시오
        int sum = 0;

        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
            // sum +=scores[i]; 이렇게 축약 가능
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / scores.length;
        System.out.printf("평균: %.2f\n" , avg); //소수점을 끊고싶으면 프린트f로바꾸고
        System.out.println("평균: " + avg);
        //%.(x)f : %나누고 남은 x의 수까지의 자리수를 표시.
        // \n 띄어쓰기? 인지 br인지 모름. 아마 띄어쓰기인듯?
    }
}
