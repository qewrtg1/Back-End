package a11.a1113;

public class A5_Over1 {
    public static void main(String[] args) {
        byte var1 = 125;
//byte의 최대값은 127이다. 최대값을 벗어나는 경우를 오버 플로우라고 말한다.
        for(int i=0; i<5;i++){ 
            var1++;
            System.out.println("var1: "+ var1);
//오버플로우가 발생하면 결과값은 최소값으로 출력되고 최소값은 -128이다.
        }
        System.out.println("-----------------------");


        
        byte var2 = -125;
		for(int i=0; i<5; i++) {	  		//{ }를 5번 반복 실행
			var2--;					      	//-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}

    }
}
