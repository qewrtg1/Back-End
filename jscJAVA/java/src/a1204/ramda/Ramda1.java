package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda1 {
    
    public static void main(String[] args) {
        //컬렉션과 람다식
        
        List<String> names = Arrays.asList("apple","banana","orange");

        //모든 요소 출력
        for(String name : names){
            System.out.println(name);
        }
        System.out.println(names);


        //람다 foreach
        names.forEach(name -> System.out.println(name));
        //이게 진짜 포이치문이래 위 for문과 여기 람다식은 같은 결과를 도출함
        

        //길이가 6이상*(단어의 갯수)요소만 필터링
        names.stream()
            .filter(name -> name.length() >= 6)
            .forEach(System.out::println);


    }
}
