package a1121.methodOverloding07;

public class Calculator {

    // public int add(int a, int b) {
    //     int result = a + b;
    //     return result; 
    //  } //이렇게 써도 되고
    public int add(int a, int b) {
        return a+b; 
     }//해도 된다
     

    public int add(int i, int j, int k) {
        int result = i + j + k;
        return result;
    }

    public double add(double d, double e) {
        double result = d+e;
        return result;

    }



}
