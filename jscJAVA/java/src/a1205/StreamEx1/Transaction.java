package a1205.StreamEx1;

public class Transaction {
    private Trader trader; //객체 안에 클래스?를 넣을 수 있다?
    private int year;
    private int value;


    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader() {
        return trader;
    }
    public void setTrader(Trader trader) {
        this.trader = trader;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    //접근 문제로 내용을 조금 수정한다?

    @Override
    public String toString() {
        return " [name:  "+trader.getName()
         + ",city: "+ trader.getCity()
         +", year: " + year 
         + ", value: " + value + "]";
         //trader 안에 있는 
    }
}
