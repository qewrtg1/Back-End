package a1202.Exception1;
//467p~

// import java.lang.reflect.Array; // 이거 왜 나왔는지 모르겠음

public class Exception1 {
    public static void main(String[] args) {
        //배열의 인덱스 초가?
        int [] numbers = {1,2,3};
        // System.out.println(numbers[5]);  //결과 : Exception in thread "main".....
//array의 인덱스 범위는 0~2. 그걸 초과해버림. 그러나 시스템은 알지 못하고 에러를 띄우지 않았음. 뒤늦게 결과창에서 알려줌

        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위 초과" + e.getMessage());
        }// 결과 : 배열 인덱스 범위 초과Index 5 out of bounds for length 3 , 에러의 원흉을 알려줌. 중지가 되진 않는다?

        
        
    }
}
