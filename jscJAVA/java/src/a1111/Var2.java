package a1111;
//세이브 에즈 시 클래스명이 일치 하지 않아서 에러가 날 거임 바꿔줘야함
public class Var2 {
    public static void main(String[] args) {

        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총" + totalMinute + "분");
    }
    
}
