package a1112;
//69p 71p 참고
public class Printf1 {
    public static void main(String[] args) {
        // int value = 123;
        // System.out.printf("상품의 가격: %d원\n", value); //%d는 10진수(정수)를 받고. value가 들어간다?
        // System.out.printf("상품의 가격: %6d원\n", value); //71p 참고
        // System.out.printf("상품의 가격: %-6d원\n", value); 
        // System.out.printf("상품의 가격: %06d원\n", value);


        double area = 3.14159 * 10 * 10; //원의 넓이를 구하는 공식?
        System.out.printf("반지름이 %인 원의 넓이: %10.2f\n",10, area);
    
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n" ,1 ,name, job);
    }
}
