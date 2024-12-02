package a1202.Exception1;
//467p~


public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        //null참조
        //객체가 null인 상태에서 해당객체를 호출하거나 맴버에 접근할 때, 발생.
        


        try {
            System.out.println(str.length());// 아무것도 없는데 갯수의 값을 가져오라 명령함.
                        //
        } catch (NullPointerException e) {
            System.out.println("null 참조가 발생한다 " + e.getMessage());
//e.getMessage: 자바에서 제공하는 기능. 에러 메세지를 상세 출력한다?
        }
        
    }
}
