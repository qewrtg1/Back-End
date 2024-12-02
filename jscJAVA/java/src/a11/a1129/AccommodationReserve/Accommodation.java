package a11.a1129.AccommodationReserve;

//숙소 클래스.
public class Accommodation {// [1]
    private String name; // 숙소의 이름
    private String location;    //위치
    private double pricePerNight; //가격
    private boolean availalbe; //예약 여부


    //생성자 생성 [2]:위 클래스 클릭 후 전구로 생성
    public Accommodation(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.availalbe = true; //예약 가능한 게 true
// ()괄호의 내용물은 3개지만 결국 available 값까지 해서 4개가 들어가게 됨

    }

    //get,set 생성 [3] : 전구로 생성
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public double getPricePerNight() {
        return pricePerNight;
    }


    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


    public boolean isAvailalbe() {
        return availalbe;
    }


    public void setAvailalbe(boolean availalbe) {
        this.availalbe = availalbe;
    }




    //기본 생성자를 하나 만들어야 함

    public Accommodation(){

    }    
//여기서뭔가 문제가 생겨서 파일1(Accommodation)로 돌아간게 여기임 (1-1) 
// [6]










    public void book(){ //  [5] : 왜 만든지 모르는데. 아마 예약 관련해서 
        this.availalbe = false; // 예약이 되면 false를 넣어서 더이상 예약 못하게 하려고?
    }


    //tostring 메서스 생성 [4] : 클래스에 전구로 생성
    @Override
    public String toString() {
        return "숙소이름 = " + name + ", 위치 =" + location + ", 박 당 가격=" + pricePerNight
                + ", 예약 여부=" + (availalbe ? "예약가능" : "예약불가") + "]";
    }// availalbe에 삼항 연상자를 사용했음 true : false
    





    
}
