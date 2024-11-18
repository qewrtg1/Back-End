package a1118;
//178p
public class A_7Marray1 {
    public static void main(String[] args) {
        

        //각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열을 생성할 거임
        int[][] mathScores = new int[2][3];
        //2가 반이고 3이 학생 수?

        // for(int i = 0 ; i < mathScores.length; i++){ // 반의 수만큼 반복
        //     for(int k=0; k < mathScores[i].length; k++){ //해당 반의 학생수만큼 반복
        //         System.out.println("mathScores["+i+"] ["+k+"]: " + mathScores[i][k] );
        //     }
            System.out.println();
            //배열의 항복 값 변경?
            mathScores [0][0] = 80;
            mathScores [0][1] = 83;
            mathScores [0][2] = 85;
            mathScores [1][0] = 86;
            mathScores [1][1] = 90;
            mathScores [1][2] = 92;
            
            for(int i = 0 ; i < mathScores.length; i++){ // 반의 수만큼 반복
                for(int k=0; k < mathScores[i].length; k++){ //해당 반의 학생수만큼 반복
                    System.out.println("mathScores["+i+"] ["+k+"]: " + mathScores[i][k] );
                }
        }
        //전체 학생의 수학 합계 구하기.

        int totalMathSum = 0;
        // int totalSutdent = 0; //(1) :
        int t = 0 ; 
        for(int i = 0 ; i < mathScores.length; i++){ 

            // totalSutdent = totalSutdent+mathScores[i].length; //(1) : 여기를 머리로 그릴 수 있어야 함.


            for(int k=0; k < mathScores[i].length; k++){ 
                totalMathSum = totalMathSum + mathScores[i][k];

                t++; //(1)과 같은 값을 낼 수 있음

            }
        }
        System.out.println("전체 학생의 수학 합계 : " + totalMathSum);
        // System.out.println("전체 학생의 수 : " + totalSutdent);
        System.out.println("전체 학생의 수 : " + t);


        double totalMathAvg = (double)totalMathSum / t;

        System.out.println("수학 평균: "+totalMathAvg);

    }
}
