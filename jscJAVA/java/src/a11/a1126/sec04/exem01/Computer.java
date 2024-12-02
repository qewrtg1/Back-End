package a11.a1126.sec04.exem01;
//295
public class Computer extends Calculator {//상속 문구 쓰고 전구 눌러서 오버라이드

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle()를 실행");
        return Math.PI *r*r; //이게 좀 더 정확한 3.14 계산식이라는데 먼소린지 모르겠음
    }
    
}
