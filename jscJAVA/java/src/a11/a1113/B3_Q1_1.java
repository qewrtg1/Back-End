package a11.a1113;
//교수

public class B3_Q1_1 {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 1; i <=100;i++){
           // System.out.print(i+" ");
           sum += i; //sum = sum + i;
         //  System.out.println("1부터100 합계 : "+ sum); 이걸 여기에 넣으면 일일이 전부 계산하고 그 값이 끝날 때까지 출력됨.
        }
        System.out.println("1부터100 합계 : "+ sum);
    }
}
