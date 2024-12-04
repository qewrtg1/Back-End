package a1204.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda2 {
    
    public static void main(String[] args) {
        //컬렉션과 람다식
        List<String> names = Arrays.asList("apple","banana","orange");

        //이름을 내림차순으로 정렬
        names.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("내림차순 정렬" + names);


        names.sort(String::compareTo);
        System.out.println("오름차순 정렬" +names);

// sort 메서드는 리스트를 정렬하는 메서드입니다.
// compareTo 메서드는 두 객체를 비교해서 작다, 같다, 크다를 판별하는 메서드입니다.
// names.sort((s1, s2) -> s2.compareTo(s1));는 내림차순 정렬을 위해 compareTo를 뒤집어서 사용하고,
// names.sort(String::compareTo);는 오름차순 정렬을 위해 compareTo를 그대로 사용하는 것입니다.
    }
}
