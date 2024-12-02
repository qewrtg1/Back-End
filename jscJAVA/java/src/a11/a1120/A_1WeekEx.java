package a11.a1120;

import java.util.Calendar;

//198p
public class A_1WeekEx {
    public static void main(String[] args) {
        //week 열거 타입 변수 선언
        A_0Week today =null;

        //Calender 얻기
        Calendar cal = Calendar.getInstance();


        //오늘의 요일 얻기(1~7) 일:1, 월:2,화:3,
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        //숫자를 열거상수로 변환해서 변수에 대입한다

        switch (week) {
            case 1:today=A_0Week.SUNDAY;break;
            case 2:today=A_0Week.MONDAY;break;
            case 3:today=A_0Week.TUESDAY;break;
            case 4:today=A_0Week.WEDNESDAY;break;
            case 5:today=A_0Week.THURSDAY;break;
            case 6:today=A_0Week.FRIDAY;break;
            case 7:today=A_0Week.SATURDAY;break;
        
            // default: 필요없나봄
            //     break;
        }//열어타입 변수를 사용

        if (today == A_0Week.SUNDAY) {
            System.out.println("일요일엔 축구");
        }else{
            System.out.println("열심히 자바 공부 합시다.");
        }

    }
}
