package a1119;

import java.util.Scanner;

public class A_1Array3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//문제. 배열의 크기를 정하지 않고 그때그때 임의로 넣으시오

        System.out.print("배열의 크기를 입력하시오: ");
        int size = sc.nextInt();
        int[] arr = new int[size];


        System.out.println("배열 요소를 입력하시오"); //이거 볼 때 (1-2) 입력할때 엔터말고 스페이스바로 5개 입력해도 됨


        for(int i = 0 ; i<arr.length; i++){ //입력하는 곳
            arr[i]=sc.nextInt();
        }

        for(int i = 0 ; i<arr.length; i++){ //출력하는 곳임
            System.out.print(arr[i] + " "); //이거 볼 때 (1-1)
        }
//합계와 평균을 구해보시오

        int sum = 0;
        for (int num : arr) {
            sum = sum + num; 
        }
        double avg = (double)sum / size; // size = arr.length

        System.out.println("합계: " + sum);
        System.out.printf("평균: %.2f\n" , avg);
    }
}
