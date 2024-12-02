//복습
//배열(array :정렬하다 배열하다)의 단점을 기억해
//  배열의 갯수를 지정해야만 한다.
//  삽입 삭제가 어려움.(기존에 존재하는 걸 삭제하기도 힘들고, 삭제하고도 순서를 섞는 것도 어려움)
//  이걸 해소하기 위해 컬렉션 프레임 워크? 라는게 있나봄 책 2권 15장쯤 공부함
//  list 인터페이스, set인터페이스, map인터페이스, 컬렉션 프레임 워크


// 1. list 인터페이스
//      - 요소의 저장 순서를 유지한다?
//      - 같은 요소를 중복 저장을 허용한다.


package a11.a1129.arraylist2;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        //integer: 인티저 = 정수, 숫자를 받을 때 쓰는 말. int를 생각하면 되나?
        //          -기본형인가봄. 그외 사용하던 타입은 그대로 int만 integer
        //ArrayList를 쓰려면 alt +shift + o 로 임폴트가 추가됨. 

        //add 메소드를 이용해서 요소를 저장할 수 있다.

        arrlist.add(40);
        arrlist.add(30);
        arrlist.add(20);
        arrlist.add(10);


        System.out.println("리스트 출력1: " + arrlist);//내용물 전체 확인용
        System.out.println("빈 여백입니다.");
        System.out.println();



        //for문과 get()메소드를 이용한 요소를 출력한다

        // for(int i=0; i<arrlist.size(); i++){ // lenght = size
        //     System.out.println(arrlist.get(i)+ " "); //이전 배열 xxxx[] = xxxx.get(i)
        // }



        // Enhanced for문 = foreach문과 get메소드를 이용해서 요소를 출력
        for(int e : arrlist){//당연히 여기 e는 임의로 만들고 본 것
            System.out.print(e + " "); 
        }//e에 값을 자동으로 하나씩 부여해서 전체를 출력시키는 듯?
        System.out.println("빈 여백입니다.");
        System.out.println();





        //collection.sort 메소드를 이용한 요소를 정렬하는법

        Collections.sort(arrlist); //Collections : 얘도 a+s+o 해서 넣거나 자동으로 넣어지던가
        for(int e : arrlist){
            System.out.print(e + " ");
        }
        System.out.println("빈 여백입니다.");
        System.out.println();
        //얜 역순으로 정렬되는 듯??????


//------------이 아래로는 화장실가서 못들었음




    }




}
