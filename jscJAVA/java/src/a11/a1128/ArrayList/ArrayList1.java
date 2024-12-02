package a11.a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

//완전한 것, 완전체, 정수 (명사). 발음 : [ín 인 ti 티 dʒər 져] 
//정수. 소수 또는 소수점 구성 요소 없이 쓸 수 있는 숫자. 


        // 기초 배열 만들기는 이렇게 했었다.
        int[] arr = new int[3];
        arr[0] = 10; 
        arr[1] = 20;
        arr[2] = 30;
        //추가 시 배열 크기를 초과해 버린다 . = 새로운 배열을 생성? 생성해야한다?
        //삽입, 삭제의 비효율성
        // => 배열 중간에 삽입 또는 삭제가 발생하면 기존 요소가 이동해야 한다.
        // 메서드 부족. 크기조정(?), 정렬, 탐색, 등의 작업의 메소드 지원이 안된다?? 먼소리야
    
        //타입 설정이 어려움 = 타입 제한 부족.




        //배열은 내가 크기를 정해야 하는데 어레이 리스트는 다르다?

        ArrayList<Integer> list = new ArrayList<>(); // alt s o 를 누르면 뭔가 된다는데?
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //출력
        System.out.println("ArrayList: " + list);
        



        //변경하는 법.

        list.set(3, 50); // 인덱스 3번을 50으로 바꾸고싶어
        //출력
        System.out.println("ArrayList: " + list);

    }
}
