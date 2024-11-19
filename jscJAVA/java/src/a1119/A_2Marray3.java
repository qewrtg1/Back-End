package a1119;

import java.util.Scanner;

public class A_2Marray3 {
    public static void main(String[] args) {
        //2행 3열 배열 생성할 때
        //[][][]
        //[][][] 이런느낌으로 생성했다.

        //비정방 행렬 배열 ??
        // [][]
        // [][][][]
        // [][][]   이렇게 들어올 때도 있을 것. 그걸 만들어 볼 거임

        int [][] a = new int [3][]; //3행 ?열
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];  //이렇게 하면 위의 비정방 행열을 만들 수 있음
        //Scanner(입력)
        Scanner sc = new Scanner(System.in);
        
        
        for(int i = 0; i < a.length ;i++ ){
            System.out.println("입력해 주세요: ");
            for(int j=0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

//적용시킨 값을 출력하려면?

        for(int i = 0; i < a.length ;i++ ){
            for(int j=0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
        } 
    }
}
