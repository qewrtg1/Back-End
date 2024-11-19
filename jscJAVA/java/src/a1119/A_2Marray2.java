package a1119;

import java.util.Scanner;

public class A_2Marray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int [3][3];
        for(int i = 0; i < scores.length;i++){
            System.out.printf("학생%d의 국어,영어,수학 점수를 입력하세요 : " , i+1);
            for(int j=0; j < scores[i].length;j++){
                scores[i][j] = sc.nextInt();
            }
        } 

        //각학생의 총점과 평균 계산
        for(int i = 0;  i < scores.length;i++){
            int sum = 0;
            for(int j =0; j < scores[i].length; j++){
                sum = sum + scores[i][j];
            }
           double avg = (double) sum / scores[i].length;
           System.out.printf("학생%d의 총점, %d, 평균: %.2f\n",i+1, sum, avg);
        }







//숙제 전체 총점 . 전체 평균을 구하시오.


        int totalSum = 0;
        int totalSub = 0;

        for(int i = 0; i < scores.length;i++){

            // totalSub = totalSub + scores[i].length; //(1)이렇게 총 (과목?)을 구할 수도 있고

            for(int j=0; j < scores[i].length;j++){
                totalSum = totalSum + scores[i][j];
            }
        } //여기까지가 총합
        totalSub = scores.length * scores[0].length;  //(1)이렇게 구할 수도 있음
        
        System.out.println("총 과목"+totalSub);

        double totalAvg = (double)totalSum / totalSub;
        System.out.printf("전체 총점: %d, 전체 평균: %.2f\n", totalSum, totalAvg);






    }
}
