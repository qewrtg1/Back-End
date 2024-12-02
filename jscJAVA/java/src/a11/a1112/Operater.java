package a11.a1112;

public class Operater {
    public static void main(String[] args) {
        //byte a = 10;
        //byte b = 10;
        //byte result = a + b;

        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;//int 타입으로 변환후 연산
        System.out.println("result2: " + result2);

        byte v3 = 10; //자동타입은 큰 쪽으로 자동변환된다?
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; 	//long 타입으로 변환후 연산
		System.out.println("result3: " + result3); 


        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7; // int타입으로 변환후 연산 65+1
        System.out.println("result4: " + result4); 

        System.out.println("result4_5: " + (char)result4); 
        // B = 66을 아스키 코드로 바꿈

        int v8 =10; 
        int result5 = v8 /4 ; //정수 연산의 결과는 정수다.
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;  //double 타입으로 변환 후 연산한다
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        // double result7 = v10/v11; //이러면 0
        double result7 = (double)v10/v11;  // double을 앞 뒤 한쪽에만 붙여도 실수형 연산이 적용됨.(둘다 붙여도 되긴함) 
        System.out.println("result7: " + result7);

    }
}
