package a1212.Lotto01;

import java.util.Calendar;

public class DatePrinter123 { 
    // 보통 얘를(클래스) 객체로 만들어서 써야 하는데 , static을 주면 걍 클래스명만
    // 가져가서 활용할 수 있다?

    public static void printDateTime(Calendar cal) {
        //년, 월, 일, 시, 분, 초 ->> 24시간제? 를 만들거임 

        int yy = cal.get(Calendar.YEAR); // 년도
        int mm = cal.get(Calendar.MONTH)+1; 
        int dd = cal.get(Calendar.DAY_OF_MONTH); 
        int hh = cal.get(Calendar.HOUR_OF_DAY); 
        int mi = cal.get(Calendar.MINUTE); 
        int ss = cal.get(Calendar.SECOND); 

    }

}
