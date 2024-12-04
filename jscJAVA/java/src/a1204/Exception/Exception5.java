package a1204.Exception;
//매우중요//매우중요//매우중요//매우중요//매우중요//매우중요
//매우중요//매우중요//매우중요//매우중요//매우중요//매우중요



//사용자 예외처리..?
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
    //CustomException 클래스는 'Exception' 클래스를 상속하여 사용자 정의 예외를 만든다.
    //생성자에서 super(message);를 호출하여 부모 클래스인 Exception 생성자를 호출
}



public class Exception5 {
    //사용자 정의 예외
    public static void main(String[] args) {
        try{
            validate(15);
        }catch (CustomException e){
            System.out.println("사용자 정의 예외"+ e.getMessage());
        }
    }

     static void validate(int age) throws CustomException {
       if(age < 18){
         throw new CustomException("나이는 18세이상이여야 함");
       }
//메소드 CustomException 중 Exception 는 반드시 포함된 이름이어야 정상작동함.
       
    }
}
