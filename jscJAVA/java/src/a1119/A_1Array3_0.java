package a1119;

import java.util.Scanner;

public class A_1Array3_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("5개의 배열 요소를 입력하시오"); //이거 볼 때 (1-2) 입력할때 엔터말고 스페이스바로 5개 입력해도 됨


        for(int i = 0 ; i<arr.length; i++){ //입력하는 곳
            arr[i]=sc.nextInt();
        }

        for(int i = 0 ; i<arr.length; i++){ //출력하는 곳임
            System.out.print(arr[i] + " "); //이거 볼 때 (1-1)
        }
        System.out.println(arr); 
        // 이렇게 확인하면 이상하게 나오는데 
        // 이 값은 arr의 주소임. 실제 값은 사실 이 안에 없음.
    }
}
