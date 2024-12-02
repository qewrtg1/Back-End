package a11.a1115;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
      //첫째줄에 입력할 개수 n 을 입력받고,
      //둘째줄에 N개의 정수를 공백을 두고 입력받으시오.
      // n개의 정수중 , 최대값을 구하여 출력하시오
      //입력예시
      //5
      //90 60 70 100 55
      //출력예시
      //최대값 : 100

      //(순서도)  
       // 1. 정수 하나를 입력받는다. 
      // 2. 입력받은 정수를 변수 n에 대입한다.
      //3. N번 반복하여 N개의 정수를 입력받는다.
      //4. 입력받은 n개의 정수를 배열 arr에 저장한다.
      //5. 배열 arr을 반복하여, max 와 i번째 요소를 비교한다.
      //6. 두 요소 중 더 큰요소를 변수 max 에 대입한다.
      //7. 반복이 끝나고, 변수 max 를 출력한다.

      Scanner sc = new Scanner(System.in);

      // 1,2풀이 
      int n = sc.nextInt();

      int arr[] = new int[n]; //입력받은 n 으로 배열의 크기를 결정
        //3. n번 반복해서 n개의 정수를 입력받는다.
      for (int i = 0; i < n; i++) {
        // 4. 입력받은 n개의 정수를 배열 arr 에 저장한다
            arr[i] = sc.nextInt();
      }
      
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
      


    }
}
