package a1126.sec02;
//291p~294p참고
public class SmartPhone extends Phone{
    //extends Phone: 부모인 Phone으로 부터 스마트폰이 필드와 메소드를 상속받겠다는 의미



    public SmartPhone(String model, String color){
        super(model, color);    //(2) 294p 참조하여 공부
    }
    //부모 클래스의 생성자 호출
    


    //필드 선언
    public boolean wifi;

    //setter도 메소드의 일종
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경합니다.");
    }
    

    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }


}
