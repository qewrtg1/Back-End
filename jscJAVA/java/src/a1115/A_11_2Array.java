package a1115;

public class A_11_2Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // for문을 이용해서 값을 넣어라


        //이렇게하면 11-1처럼 원시적으로 넣지 않아도 된다.
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]); //이렇게도 볼 수 있나 궁금해서 해봄
        }



        for (int j = 0; j < arr.length; j++) { //당연하지만 j가 아니어도 된다 i로 해도 됨.
            System.out.print(arr[j] +" "); //잘 들어갔는지 보려는 거니까
        }

    }
}
