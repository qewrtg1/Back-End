package a1121.object05;

                                            //클래스란? 
                                            //객체를 정의한 설계도. / 클래스 = 설계도
                                            //객체를 생성하는데 사용한다.
public class Car {                          //요컨데 public class ㅁㅁㅁㅁ 전체가 클래스 (1)
                                            //클래스를 구성하는 요소 : 필드, 메서드, 생성자, 이너클래스(24.11.21.14:08 기준 안 배움)
                                           
     // 필드(속성) 선언                     //필드 = 속성
     public String model;
     public String color;
     public int price;
 
     // 생성자(객체의 선언 및 초기화 방법)              //(3)이걸 해야지 객체를 선언하고 적용받을 수 있음.
     public Car(String model, String color, int price) {
         this.model = model;
         this.color = color;
         this.price = price;
     }
 






     // 메서드(행위_행동) 선언                                 (4)
     void powerOn() {    //void는 리턴해서 값을 다시 전달할 필요가 없을 때 쓰는 거. 기억해.
         System.out.println("시동을 켠다");
     }
 
     void accelerate() {
         System.out.println("앞으로 간다.");
     }
 
     void stop() {
         System.out.println("멈춘다.");
     }
}
