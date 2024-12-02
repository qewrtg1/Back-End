package a11.a1128.sort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int [] array = {64,34,25,17,22,11,90};
        InsertionSort(array);
        System.out.println("sort Array: " + Arrays.toString(array));
     }
        
    public static void InsertionSort(int[] array) {
        int n = array.length;
        for(int i=1 ; i< n;i++){
            int key = array[i]; //i=1이다. 인덱스번호는 0부터. 고로 2번째 방부터 시작하게 된다.
            int j = i - 1; //반대로 j는 -1로 0으로 시작하니 인덱스번호 0, 시작도 1번방부터             
            while (j>=0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }
    }

}
