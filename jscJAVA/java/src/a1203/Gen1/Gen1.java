package a1203.Gen1;

import java.util.ArrayList;

//제네릭 572p 
//깊게 공부하고싶으면 따로 하라
public class Gen1 {
    public static void main(String[] args) {
        ArrayList piches = new ArrayList<>(); //이런걸 컬렉션이라고 한다?
//컬렉션에 제너럴을 안 넣은 상태? <>가 없다?
        piches.add("123");
        piches.add("3435");
        // String one = piches.get(0);
//0번은 불렀으나 되지 않는 모습을 볼 수 있음.


//제네릭스를 사용하지 않으면 arraylist에 추가하는 객체는
//object 자료형이 된다? = 모든 객체가 상속하고 있는 가장 기본적인 자료 형
//자료를 넣는 건 문제가 없으나 값을 가져올 때 에러가 생김.

//object 자료형에서 String 자료형으로 형 변환(castiong_캐스팅)을 해야 함.




    String one = (String)piches.get(0); // 이렇게()괄호를 써서 캐스팅 해줘야함
    String two = (String)piches.get(1); // 이렇게()괄호를 써서 캐스팅 해줘야함

    }
}
