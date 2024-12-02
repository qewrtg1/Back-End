package a11.a1115;

public class A_11_3Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        arr[3] = 88; //특정한 배열의 요소값 변경 가능


        for (int j = 0; j < arr.length; j++) { 
            System.out.print(arr[j] +" "); 
        }

    }
}
