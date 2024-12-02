package a11.a1119;

public class A_2Marray5 {
    public static void main(String[] args) {


    int[][] englishScores = new int[2][];

        // 배열 항목 값 변경

		englishScores[0] = new int[2];
		englishScores[1] = new int[3];


        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

// [] []
// [] [] []
        // englishScores.length : 행이 몇 개인지 묻는 것 = 2행
		// totalStudent1 += englishScores[i]


    int totalStudent1 = 0;
    int totalenglishSum1 = 0;
    for (int i = 0; i < englishScores.length; i++) {      		// 반의 수만큼 반복 2
        totalStudent1 += englishScores[i].length;        		// 반의 학생수 합산 2 3
        for (int k = 0; k < englishScores[i].length; k++) {  	// 해당 반의 학생 수만큼 반복 3
            totalenglishSum1 += englishScores[i][k];         		// 학생 점수 합산
        }
    }
    double totalMathAvg1 = (double) totalenglishSum1 / totalStudent1;
    System.out.println("전체 학생의 영어 평균 점수: " + totalMathAvg1);
    System.out.println();






    }
}
