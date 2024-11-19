package a1119;

import java.util.Arrays;

public class A_1Array2 {
    public static void main(String[] args) {
        String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};

        for(int i = 0; i < week.length; i++){
            System.out.print(week[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(week));
        System.out.println();

        //foreach : 컨트롤 스페이스바. 이후 foreach 찾기
        //foreach문: 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문이다
        for (String ddddday : week) {
            System.out.print(ddddday + " "); //하나의 day = week[i]?
        }
    }
}
