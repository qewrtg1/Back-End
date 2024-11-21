package a1121.overloading02;

public class A_1Car_Ex01 {
    public static void main(String[] args) {
        C_1Car car1 = new C_1Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        C_1Car car2 = new C_1Car("자가용");
        System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		

        C_1Car car3 = new C_1Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		C_1Car car4 = new C_1Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
