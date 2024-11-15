package a1115;

//문제지는 맨 아래 

import java.util.Scanner;

public class B3_1ArrayMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("총 개수를 입력하시오 : "); //이거 빼먹으면 햇갈린다 ㅋㅋ

        int n = sc.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < n; i++) { // n대신 arr.length을 넣어보고 결과 확인해볼 것.
            System.out.print(i+1 + "번째 숫자를 입력하시오 : ");
            arr[i] = sc.nextInt();    //3. N번 반복하여 N개의 정수를 입력받는다 . 가 여기임

        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");    //콘솔 로그 같은 느낌으로 되나 안되나 보려고 만든거임
        //    }
        //5. arr을 반복하여 max와 1번째요소를 비교하는 코딩을 만들거임
        int max = Integer.MIN_VALUE; //int 타입의 최소값은 -21억xxx이다


           for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                //6. 두 요소 중 더 큰 요소를 max에 대입한다.
                max = arr[i];
            }
        }
         //7. 반복이 끝나고 변수 max를 출력한다.
         System.out.println("최대값: " + max);   
         sc.close();

        



    }
}

// 첫째 줄에 입력할 개수 N을 입력받고,
// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
// N개의 정수 중, 최댓값을 구하여 출력하시오.
// (입력예시)
// 5
// 90 60 70 100 55
// (출력예시)
// 최댓값 : 100



// (순서도)	
// 1. 정수 하나를 입력받는다.
// 2. 입력받은 정수를 변수 N에 대입한다
// 3. N번 반복하여 N개의 정수를 입력받는다
// 4. 입력받은 N개의 정수를 배열 arr 에 저장한다
// 5. 배열 arr 를 반복하여, max 와 i번째 요소를 비교한다
// 6. 두 요소 중 더 큰 요소를 변수 max 에 대입한다
// 7. 반복이 끝나고, 변수 max 를 출력한다