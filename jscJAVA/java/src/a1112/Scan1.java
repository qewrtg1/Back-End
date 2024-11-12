package a1112;

import java.util.Scanner; //컨트롤+알트+5 = 하면 나오는듯?

public class Scan1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //Scanner 객체 생성(파란글씨는 변수이름임 맘대로 설정 가능) 
        //. System.in(콘솔)에서 입력 받는다
        //new Scanner :키보드로 입력 받은 것을, 이란 의미?
        
        int num = scaner.nextInt();
        System.out.println(num);
        //System.out: 출력해라.println: 프린터한다()괄호 안에 있는 값을.69p에 자세히 나와있음
    }
}

