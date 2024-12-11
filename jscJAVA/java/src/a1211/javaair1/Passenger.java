package a1211.javaair1;

import java.time.LocalDate;
import java.time.Period;

// [2-1 : 필드, getset, 생성자]
public class Passenger { // 예매정보를 저장, 나이 검증 등을 하게 만들 곳(class)
    private String name;
    private int birthData; // 생년월일 
    private String pw; // 예약 비밀번호
    private String seat; // 좌석


// [2-1-1 : 생성자는 이렇게 2개 만들었음]
    public Passenger(String name, int birthData) {
        this.name = name;
        this.birthData = birthData;
    }
    public Passenger(String name, int birthData, String pw) {
        this.name = name;
        this.birthData = birthData;
        this.pw = pw;
    }

// [2-1-2: getset]
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthData() {
        return birthData;
    }
    public void setBirthData(int birthData) {
        this.birthData = birthData;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }





// [2-2 : 15세 이상만 국제선 예약 가능하도록 메서드를 만들 것]
    public boolean man15(Passenger p){ //man15 라는 메서드를 만든 것. 괄호 안은 모름
                                        // 831016 이라고 가정해보자
        int y = p.birthData/10000; //83.1016 -> int라서 83만 남을 것.
        int m = (p.birthData%10000) / 100; //83.1016 -> %라서 나머지 1016 /100 = 결과: 10 (만 남게 됨_ 즉 10월생이란 의미)
        int d = p.birthData%100; //나머지는 16만 남게 될 거임. 

        if( y > 0 && y<=24){
            y = y+2000;
        }else{
            y += 1990;
        }
        // 1983 10월 16일, 으로 날자를 기억한다?
        
        LocalDate birthDate2 = LocalDate.of(y,m,d); //생년월일
        LocalDate currentDate = LocalDate.now(); // 오늘자 년 월 일

        int age = Period.between(birthDate2, currentDate).getYears(); //get뒤에 년월일 아무거나 넣어서 다 구할 수 있음
//Period : 오늘 처음 본 메서드. 
//Period.between(birthDate2, currentDate).getdays(): 두 날짜 간의 차이를 구할 때 쓴다? 

        return age > 15;
    }



}
