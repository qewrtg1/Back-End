package a1201.Exception1;

public class Exception1 {
    public static void main(String[] args) {
        //배열의 인텍스초가
        int [] numbers = {1,2,3};
        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위초과 "+ e.getMessage());
        }
    }
}

//Exception : 예외하다.

// **try-catch**는 오류가 발생할 수 있는 부분을 "시험try"하고, 오류가 발생하면 그 오류를 처리하는 방법입니다.
    // = try에서 실험해보고 안 되는 부분은 catch로 보내 어떻게 할 것인지 물어봄

// **ArrayIndexOutOfBoundsException**은 배열의 잘못된 인덱스를 접근할 때 발생하는 오류입니다. =오류 코드


// e는 발생한 예외 객체를 의미
// **e.getMessage()**는 발생한 예외에 대한 메시지를 출력하는 메서드입니다.