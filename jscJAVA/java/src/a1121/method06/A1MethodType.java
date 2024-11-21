package a1121.method06;

public class A1MethodType {


    // public String printName;
    // public int printNumber;
    // public double multiply;
    public void printName() {
        System.out.println("홍길동");
    }

    public int printNumber() {
        return 10;
    }

    public void multiply(int i, double d) { //반환해서 돌려줄 게 아니고 여기있는값 그대로 보여줄 거니까.
        
        System.out.println("곱샘 결과 : " +(i*d));
    }
    
}
