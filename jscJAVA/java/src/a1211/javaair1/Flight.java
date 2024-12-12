package a1211.javaair1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Flight {
    //목적지, 비행시간, 금액
// [1-1]
    private String destination;
    private String time;
    private int price;
    private DecimalFormat priceFormat = new DecimalFormat("#,###원");
    // ex) 120000원이다 -> 1,200,000원 으로 나오게 만들어줌. format효과 기억하지?
    private Boolean internationaFlight; // 국제선? 관련으로. 15세 이하는 못하게
    private ArrayList<String> seats; //좌석

// [1-4] get set 누르면 이따구로 밀려서 순서가 섞임 만드는 순서 바뀌어도 ㄱㅊ음
public String getDestination() {
        return destination;
    }



    public void setDestination(String destination) {
        this.destination = destination;
    }



    public String getTime() {
        return time;
    }



    public void setTime(String time) {
        this.time = time;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    public DecimalFormat getPriceFormat() {
        return priceFormat;
    }



    public void setPriceFormat(DecimalFormat priceFormat) {
        this.priceFormat = priceFormat;
    }



    public Boolean getInternationaFlight() {
        return internationaFlight;
    }



    public void setInternationaFlight(Boolean internationaFlight) {
        this.internationaFlight = internationaFlight;
    }



    public ArrayList<String> getSeats() {
        return seats;
    }



    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }



    // [1-2] 생성자를 만듬. 포멧 빼고.
    public Flight(String destination, String time, int price, Boolean internationaFlight) {
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.internationaFlight = internationaFlight;
// [1-2-1] seats 수정
        seats = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            seats.add(i+""); // 다른 곳에서 값을 받고 ArrayList<String> seats;에 값을 넣어주려고?
        }                   // 숫자를 문자열로 넣기 위해서 이렇게 만듬.
                            //seats.add(String.valueOf(i)); 이렇게 넣으면 더 직관적임.
    }
    // , ArrayList<String> seats 은 괄호에서 빼고 내용도 별도로 직접 만들어줌



// [1-3] toString , 목적지와 시간만 넣음.
    @Override
    public String toString() {
        String priceComma = priceFormat.format(price); // 위에 만든 값을 쓰려고 이렇게 메소드 적용
        //포멧 메서드 사용(활용)하는 방법이란 느낌으로 공부하면 됨
        return " ." + "목적지: " + destination + ", 출발 시간" + time + ", 가격: "+ priceComma;
    }



// [1-5] 머리아프다고 교수님이 보내줘서 복붙한 내용임.
    public void seatToString(){
        for (int i = 0; i < seats.size()-3; i += 4) {
            System.out.printf("|  [%2s]\t\t[%2s][%2s] \t [%2s]  |\n",seats.get(i),seats.get(i+1),seats.get(i+2),seats.get(i+3));
        }
    }
    //[1][2][3][4]
    //[5][6][7][8]
}
