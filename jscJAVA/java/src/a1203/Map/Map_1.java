package a1203.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

//스프링에선 잘 안 쓰는데 프로그램 할 때는 자주 씀
public class Map_1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>(); // 특이사항.<>다중으로 들어감.
//arraylist.add = HashMap.put
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        //출력하는 점도 뭔가 특이한가봄
        System.out.println("맵에 저장된 키들의 집합: "+hm.keySet());
        //출력시 순서가 보장되지 않음.


        for(String key : hm.keySet()){//foreach문.
            System.out.println(String.format("키: %s, 값: %s" , key, hm.get(key)));
        }
        //키 - 값 쌍으로 데이터 저장
        //각 데이터는 고유한 키(key)와 이에 대응하는 값(value)으로 구성되어 있다.

        //순서가 없다.
        //중복도 허용한다
        //null도 허용
        

        //동기화가 되지 않음
        //시간의 복잡도 평균? = array는 효율이 엄청 떨어짐. 1~10000번까지 있다고 했을 때 삽입,삭제 등으로 일어나는 행위에 엄청난 소비.
        //순서가 뒤죽박죽인만큼 주소만으로 교환하기에 효율성=보통 이라고함.



        System.out.println();
        //remove() 메소드를 이용해 요소를 제거할 수 있다.
        hm.remove("사십"); //key값만 넣으면 편하게 지울 수 있다.


//이게 뭘하는 건지 모르겠음 못듣기도 함
        Iterator<String> keys =hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키: %s, 값: %s" , key, hm.get(key)));
        }
        System.out.println();


        //replace()메소드를 통한 수정 
        hm.replace("이십", 200);

        for(String key : hm.keySet()){//foreach문.
            System.out.println(String.format("키: %s, 값: %s" , key, hm.get(key)));
        }
        System.out.println();

        //size()메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기: " +hm.size());











    TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); // 특이사항.<>다중으로 들어감.
//하다가 교수님쪽 문제로 다시 map2파기로함








        }











    
}
