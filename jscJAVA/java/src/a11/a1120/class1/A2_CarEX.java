package a11.a1120.class1;
//219
public class A2_CarEX {


    public static void main(String[] args) {
        
        //Car 객체 생성
        A2_Car myCar1 = new A2_Car();

        myCar1.company = "현대";
        myCar1.model = "제네시스";
        myCar1.color = "검정";
        myCar1.maxSpeed = 250;
        myCar1.speed = 50; //직접 객체 생성에 대입하는 방법 (2-1)


        System.out.println("제작회사: " + myCar1.company);
        System.out.println("모델: " + myCar1.model);
        System.out.println("색상: " + myCar1.color);
        System.out.println("최대 속도: " + myCar1.maxSpeed);
        System.out.println("속도: " + myCar1.speed);

        myCar1.speed = 70; //도중 변경이 됨

        System.out.println("속도: " + myCar1.speed);

        System.out.println();


//////////////////////////////////////////////////////////////// 

        A2_Car myCar2 = new A2_Car("기아", "투산 ", "흰색 ", 220 ,  40);
        //(1-1)위의 내용은 생성자가 어떻게 만들어지는지 보여주기 위해서 했다? 220p
        System.out.println("제작회사: " + myCar2.company);
        System.out.println("모델: " + myCar2.model);
        System.out.println("색상: " + myCar2.color);
        System.out.println("최대 속도: " + myCar2.maxSpeed);
        System.out.println("속도: " + myCar2.speed); //매개변수를 불러와서 만들때 (2-2) 2-1만이라면 혼자 쓰는거지만 2-2가 생긴 이후론 혼용이 되기 시작한 거임.
    }


    
}
