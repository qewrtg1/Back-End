package a11.a1121.anotherConstructor03;

public class C {
    //필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	C(String model) {
		this(model, "은색", 250);
	}
	
	C(String model, String color) {
		this(model, color, 250);
	}
	
	C(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
