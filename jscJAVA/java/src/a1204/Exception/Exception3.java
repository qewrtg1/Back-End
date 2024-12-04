package a1204.Exception;

public class Exception3 {
    public static void main(String[] args) {
        //숫자형식오류
        String str = "abc";
        try{
            int number =Integer.parseInt(str); 
        }catch(NumberFormatException e){//문자를 숫자 형식으로 처리하는것?
            System.out.println("숫자형식이 올바르지 않습니다."+ e.getMessage());
        }
    }
}
