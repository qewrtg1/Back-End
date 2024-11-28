package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        //특정 요소 확인.

        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //요소가 존재하는지 확인.

        System.out.println("바나나 있니? " + list.contains("Banana")); //true
        System.out.println("포도 있니? " + list.contains("Grapes")); //false

        // 크기 확인 - 지금까지 배열의 숫자를 파악하는 것 length 였음
        // 그러나 ArrayList에선 size()를 씀 _ 괄호도 꼭 붙여야 하는 거임


        System.out.println("리스트(list)의 갯수: " + list.size());



        //인덱스 요소를 검색하는 방법도 다름 for문에서 기존엔 xxxx[i]로 검색했었는데
        String fruit = list.get(1);
        System.out.println("검색한 내용 출력 : " + fruit);



        //for-each 는 => enhance for문

        for(String fruit1 : list){
            // System.out.println(fruit);//이거 뭔가 잘못된거 같아서 한줄다시씀
            System.out.println(fruit1);//이거 뭔가 잘못된거 같아서 한줄다시씀
        }

        //Array List 정렬.(은 여기서 안하고 넘어가나봄)

    }

}
