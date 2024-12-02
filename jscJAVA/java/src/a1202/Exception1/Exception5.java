package a1202.Exception1;
//479p~


class CustomException extends Exception{ //(3)Exception: 자바에 원래 있는 값(클래스?)임.  
    public CustomException(String message){ // message 자동완성 안 뜨던데? <<변수명이라서 
        super(message);
    }
}




//CustomException 클래스는,
// 'Exception(자바에서 가장 큰 클래스?)'클래스를 상속하여 사용자 정의 예외를 만든다.
// 생성자에서 super(message);를 호출하여 부모 클래스인 Exception 생성자를 호출한다?





public class Exception5 {
    public static void main(String[] args) {
       //사용자 정의 예외처리
        try {
                validate(15); //메서드 만들거임 (1)
                
            } catch (CustomException e) { //(2) CustomException는 없는 거임. 임의로 만들었으니 에러표시뜸
                System.out.println("사용자 정의 예외" + e.getMessage());
    
            }
        }
    

        private static void validate(int age) throws CustomException{//(1) 여기 int값 바꾸면 위도 자동으로 바뀜
            //throws CustomException는 (4)임. 


            if(age < 18){ //(5)
                //아래랑 같다..? throw new UnsupportedOperationException("나이는 18세 이상이어야 함");
                throw new CustomException("나이는 18세 이상이어야 함");
            }

        }
}
