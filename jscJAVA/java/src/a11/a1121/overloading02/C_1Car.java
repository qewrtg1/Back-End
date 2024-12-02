package a11.a1121.overloading02;

public class C_1Car {    //필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언ㅁ
	C_1Car(){}
	
	C_1Car(String model) { 
		this.model = model; 
	}
	
	C_1Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	C_1Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
