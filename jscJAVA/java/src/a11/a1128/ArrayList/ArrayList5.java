package a11.a1128.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        //특정 요소 확인.

        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
//일부로 abc순서를 꼬았음.

        //Array List 정렬, 하는 걸 할거임 (아마)


        System.out.println("일단 출력: " + list);
        //순서대로 출력됨.


        Collections.sort(list);
        System.out.println("정렬 후 출력: " + list);
        //abc순서대로 정렬하나봄

        Collections.reverse(list);
        System.out.println("역 정렬 후 출력: " + list);
        //역순으로 출력됨

    }

}
