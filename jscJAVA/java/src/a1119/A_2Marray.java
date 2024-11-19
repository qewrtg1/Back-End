package a1119;

public class A_2Marray {
    public static void main(String[] args) {
        int [][] arr = new int [2][3]; // 2행 3열 = 2차원 배열 arr근처[]의 위치는 앞 뒤 상관없음 

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        //[1][2][3]
        //[4][5][6]
        // arr.length : 첫번째 차원 배열요소의 개수 2  아마도 2행
        // arr.[i].length : 두번째 차원의 배열요소의 개수   아마도 2행에 있는 3열 3열 합산 6열


        for(int i = 0 ; i < arr.length; i++){  //그래서 여기는 2행을 만들고
            for(int k=0; k < arr[i].length; k++){  // 여기는 i행(=2행)만큼 반복하면서 또 k열만큼 봄
                System.out.println(arr[i][k] + " " );
            }

        }
    }
}