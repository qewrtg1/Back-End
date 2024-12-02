package a11.a1121.Computer04;

public class C_1Computer {

    public int sum(int ... values) {
        int sum = 0 ; 
        for(int value : values){ //for each문 03인가에서 했음
            sum += value;
        }

        return sum;
    }
    
}
