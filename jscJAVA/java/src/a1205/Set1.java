package a1205;
/// 자바 컬렉션 
/// 다수의 데이터를 쉽고 효과적으로 처리한다
/// List 인터페이스, 
/// Map , set 이런게 자바 컬랙션인가?

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        //객체선언
        Set<String> set = new HashSet<String>();

        //데이터 삽입
        set.add("사과");
        set.add("바나나");
        set.add("표표");
        set.add("키위");
        System.out.println();

        for(String e : set){
            System.out.println(e);
        }
        System.out.println();


        set.remove("사과");  //이것만으로도 지워짐 
        set.add("오렌지");
        set.add("오렌지"); // 중복 요소가 저장되지 않는다는 걸 알 수 있음.
        for(String e : set){
            System.out.println(e);
        } //확인용
        System.out.println();



        Iterator<String> iterSet = set.iterator();
        
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next()+ " ");
        }
        System.out.println();
        System.out.println(set);

        System.out.println(set.contains("오렌지"));
        
        //전체 데이터를 삭제를 원하면
        set.clear();
        System.out.println(set);

        System.out.println(set.isEmpty());

    }
}
