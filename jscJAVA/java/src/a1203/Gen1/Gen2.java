package a1203.Gen1;

import java.util.ArrayList;

//제네릭 572p 
//깊게 공부하고싶으면 따로 하라
public class Gen2 {
    public static void main(String[] args) {
        
        ArrayList<String> piches = new ArrayList<>(); //컬렉션
//이렇게만 해도 아래가 편해짐.
//제네릭스로 자료형을 선언하면 그 이후 자료형은 형 변환하는 과정이 필요없다
        piches.add("123");
        piches.add("3435");




    String one = piches.get(0); 
    String two = piches.get(1); 

    
    }
}
//이것만 이해하면 얼추 끝이라고 함.
//<> 꺽쇠에 무슨 형인지만 잘 지정하면 된다.


// 제네릭(Generic)이란 결정되지 않은 타입을 파라미터로 처리하고
//실제 사용할때 파라미터를 구체적인 타입으로 대체하는 기능이다.

