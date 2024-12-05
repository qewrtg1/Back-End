package a1205;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
    

        //컬렉션에서 스트림을 생성해보자
        Stream<Integer> stream = list.stream();

        //forEach 메소드를 사용해보자 순차적 접근해보게
        stream.forEach(System.out::println); //이렇게하면 프린터 출력까지 됨

    
    }
}
