package a11.a1126.sec02;

public class SmartPhoneEX {
    
    public static void main(String[] args) {
        //smartphone 객체 생성

        SmartPhone myPhone3 = new SmartPhone("갤럭시", "은색");


        // phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone3.model);
        System.out.println("모델: " + myPhone3.color);

        //스마트폰 필드 읽기
        System.out.println("와이파이 상태 : " + myPhone3.wifi);
        //boolean 초기값은 false임. true쓰고 싶으면 수정해야함


        //phone으로부터 상속받은 메소드를 호출해보자
        myPhone3.bell();
        myPhone3.sendVoice("여보세요");
        myPhone3.receiveVoice("안녕");
        myPhone3.sendVoice("네 반갑");
        myPhone3.hangUp();


        //스마트폰 메소드 호출해보자
        myPhone3.setWifi(true);
        myPhone3.internet();
        System.out.println("와이파이 상태 : " + myPhone3.wifi);

        

    }
}
