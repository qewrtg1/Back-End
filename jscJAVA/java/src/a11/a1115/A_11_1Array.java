package a11.a1115;

public class A_11_1Array {
    public static void main(String[] args) {

        //배열 선언
        // = - 자료형 변수명[];
        int arr[]; // 변수를 []로 배열형으로 만들고
        arr = new int[5]; //이렇게 변수를 넣는 방법1.(원시적인 방법이라고 함)

        //배열 생성
        // - 변수명 = new 자료형[개수];

        //배열 요소에 접근
        // : index(0부터 시작하는 순서번호)로 접근.

        arr[0]= 1;//이렇게 하나하나 접근(넣는)하는 방법
        arr[1]= 2;
        arr[2]= 3; 
        arr[3]= 4; 
        arr[4]= 5; 

        //배열의 길이 : 배열의 요소의 개수 = 배열.length;

        int n = arr.length;
        System.out.println("배열의 길이: " +n); //이렇게 길이(몇 게 들어 있는지) 알 수가 있음.

//컨트롤 스페이스바 누르면 나오는 창?? 이라는데 잘 이해 못해서 걍 손으로 씀
        for (int i = 0; i<arr.length; i++){ // 이렇게 arr에 들어 있는 값을 볼 수 있다.
            System.out.println(arr[i] + " "); //arr의 [0]엔 =1이 들어 있음. 그래서 0~4의 arr은 1~5가 출력되게 됨
        }
        System.out.println();

    }
}
