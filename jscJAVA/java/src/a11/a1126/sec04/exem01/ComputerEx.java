package a11.a1126.sec04.exem01;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator =new Calculator();//칼큘레이터가 부모임
        System.out.println("원의 면적: "+ calculator.areaCircle(r));

        Computer computer =new Computer();
        System.out.println("원의 면적: " + computer.areaCircle(r));
        //areaCircle가 두개가 있음. 이걸 메소드 오버라이딩이라고 하는 건가???
        //아닌거같음 컴퓨터.java에 이미 오버라이드가 있음
    }
}
