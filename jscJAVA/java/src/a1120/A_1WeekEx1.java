package a1120;

import java.util.Calendar;

//198p 복습해봄
public class A_1WeekEx1 {
    public static void main(String[] args) {
        A_0Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        switch (week) {
            case 1:today=A_0Week.SUNDAY;break;
            case 2:today=A_0Week.MONDAY;break;
            case 3:today=A_0Week.TUESDAY;break;
            case 4:today=A_0Week.WEDNESDAY;break;
            case 5:today=A_0Week.THURSDAY;break;
            case 6:today=A_0Week.FRIDAY;break;
            case 7:today=A_0Week.SATURDAY;break;
        }

        if(today == A_0Week.SUNDAY || today == A_0Week.SATURDAY){
            System.out.println("주말입니다");
        }else{
            System.out.println("공부하는 날입니다.");
        }
    }


}