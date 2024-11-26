package a1126.sec02;

public class Phone {
    //필드 선언
    public String model;
    public String color;


    //생성자
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    //상속받는 자식이 있을 경우 생성자를 만들면 에러가 터짐.(1)
    //스마트폰으로 넘어가야함




    //메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다");
    }
    public void sendVoice(String message){
        System.out.println("자기: " + message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방: " +message);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
    

}
