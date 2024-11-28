package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>(); // 다 쓰고 alt s o 를 누르면 뭔가 된다는데?
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //삽입도 가능하다.
        //10 20 사이에 15를 넣고 싶다.
        list.add(1, 15);;  //괄호 선택지에서 따로 골라야함 e가 아닌
        //1번에 15를 삽입완료

        
        //출력
        System.out.println("ArrayList: " + list);
        
        list.remove(1); // 이렇게하면 1번 인덱스를 삭제한다.

        System.out.println("ArrayList: " + list);


        list.remove(Integer.valueOf(30)); //조금 이해하기 어려운 삭제 방법
        //요컨대 인덱스 번호가 아닌 값을 삭제하는 방법임.
        
        System.out.println("ArrayList: " + list);

    
    }

}
