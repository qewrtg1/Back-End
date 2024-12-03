package a1203.Map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();

        //put() 메소드를 이용한 요소의 저장
        tm.put(30, "삼십");
		tm.put(10, "십");
		tm.put(40, "사십");
		tm.put(20, "이십");

        System.out.println("맵에 저장된 키들의 집합 :" + tm.keySet());
//알아서 정렬이 되는 모습을 볼 수 있음.
//TreeMap은 키를 자연 순서(알파벳, 숫자)로 정렬하여 출력함

        for(Integer key : tm.keySet()){
            System.out.println(String.format("키: %s 값: %s", key, tm.get(key))); // tm.get(key) = keySet?
        }










        TreeMap<String, Integer> tm1 = new TreeMap<>();  //new 뒤 <>는 알아서 들어감

        //put() 메소드를 이용한 요소의 저장
        tm1.put("ㄷㄷㄷ",30);
        tm1.put("ㅅㅅㅅ",10);
        tm1.put("ㄱㄱㄱ",40);
        tm1.put("ㅎㅎㅎ",20);

        System.out.println("맵에 저장된 키들의 집합 :" + tm1.keySet());

        
        for(String key : tm1.keySet()){
            System.out.println(String.format("키: %s 값: %s", key, tm1.get(key))); // tm.get(key) = keySet?
        }
    //이번엔 문자열 순서대로 나열되는 거 보여주려고 만든듯?
    
    }
}
