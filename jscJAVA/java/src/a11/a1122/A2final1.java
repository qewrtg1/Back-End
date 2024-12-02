package a11.a1122;
//254p                  꼭 읽어볼 것
public class A2final1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.display();
        // car.brand = "Honda"; //여기에 에러가 생김(1)
        // car.display(); //파이널 필드는 재할당할 수 없다. 254p
    }
}

class Car{
    final String brand; //final 필드선언 //여기에 A2final1를 붙이면 (1)
    final String model;

//final : 객체마다 고유하지만 한 번만 초기화 한 후 변경할 수 없는 데이터.
//static fianl: 상수 클래스 차원에서 모든 객체가 공유하며,
//대신 변경할 수 없는 고정 데이터


// 예시) static fianl double PI=3.14159;


    public Car(String brand, String model) {
        this.brand = brand; 
        this.model = model;
    } 
    void display(){
        System.out.println("Brand: "+ brand + ", Model: " + model);
    }

}


