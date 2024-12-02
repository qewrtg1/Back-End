package a11.a1119;

import java.util.Scanner;

public class A_1Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기를 입력하세요: ");
        int size = sc.nextInt();
        int[] arr = new int[size];


        System.out.println("배열 요소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("원래 배열:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n 역순 배열");
        for (int i = size - 1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        } // 중요: 여긴 배열이 바뀐게 아니라 그냥 출력 순서만 뒤집었을 뿐인 점을 명심할 것








        

        System.out.println("\n 실제 역순 정렬 배열을 해보자");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];  //운반용 변수임


            arr[i] = arr[arr.length - 1 - i];  // 앞과 뒤를 교환하기 위한 수식
            // -i가 필요한 이유는 -1로 끝냈을 경우 인덱스 0에서 1로 간 이후로 멈춰버리니까.
            
            arr[arr.length - 1 - i] = temp; //빈 값에 temp를 넣어주는 공식임
        }

        System.out.println("정렬된 배열을 출력합니다.");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
