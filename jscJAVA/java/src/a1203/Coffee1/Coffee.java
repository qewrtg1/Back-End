package a1203.Coffee1;

import java.util.ArrayList;
import java.util.Map;

public class Coffee {
    //아까배운 싱글톤이라는 걸 써볼 거임

    //싱글톤
    private static Coffee instance;
    //기본 생성자
    private Coffee(){};

    // 메서드?
    public static Coffee getInstance(){
        if(instance == null){ //객체를 생성하기 전이면
            instance = new Coffee(); //객체를 생성하라
        }
        return instance; //아니라면 instance에 변수를? 되돌려줘라.
    }
//여기까지가 한 세트? 라고 함
    //메뉴 리스트로 저장 ?*뭔말인지 모르겠음*


    ArrayList<String> coffeeList; // 메뉴에 리스트
    ArrayList<Integer> coffeePrice;  // 각 메뉴의 가격
    Map<String, Integer> menu;







}
