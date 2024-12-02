package a11.a1126.sec01;

public class SmartPhone extends Phone{//extends Phone를 추가해줘야함(3)
    //extends Phone: 부모인 Phone으로 부터 스마트폰이 필드와 메소드를 상속받겠다는 의미

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

    // 생성자 선언
    public SmartPhone(String model, String color){//phone에 있던거지?(1)
        this.model = model;
        this.color = color; //에러 뜰거임(2)
    }



}
