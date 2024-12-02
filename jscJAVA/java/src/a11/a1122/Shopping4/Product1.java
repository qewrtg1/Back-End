package a11.a1122.Shopping4;

public class Product1 {
    private String name;
    private double price;
    private int stock;
   
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { 
        if(price < 0){ //음수를 막기 위해서 임의로 추가//이런 걸 유효성 검사라고 한다
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock){
        if(stock < 0){ //음수를 막기 위해서 임의로 추가//이런 걸 유효성 검사라고 한다
            this.stock = 0;
        }else
        this.stock = stock;
    }


    public Product1(String name, double price, int stock) {
        this.name = name;
        // this.price = price;
        setPrice(price);
        // this.stock = stock;
        setStock(stock);
    }       // 위 this 2개를 set set 메소드 두 개를 이용해서 음수 자체를 차단함(1-1)
//굳이 따지면 글자도 막는 등 막아야 할 건 많지만 일단 당장은 이런 느낌으로 막는다, 이 개념만 이해하고 있으면
//된다고 함.
// 사실 최근 setter 자체를 잘 안 쓰는 분위기라고 한다. 그래도 이해는 해야하니까 공부해야 한다, 라고 함

    public String toStr() {
        return String.format("제품 : %s , 가격 : %.2f, 재고 : %d", name , price, stock);
    }



    public void addStock(int amount) {//재고 추가 메서드 내용임
        if(stock < 0){
            System.out.println("재고 추가 실패: 음수 값은 허용되지 않습니다.");
        }else{
            stock += amount;
            System.out.println("재고 "+amount + "개의 수량이 추가되었습니다.");
            System.out.println("현재 재고량은 "+stock+"입니다.");
        }

    }

    public void sellproduct(int amount1){
        if(stock < amount1){
            System.out.println("판매 실패 : 재고가 부족합니다");
            System.out.println("재고량 "+stock+"을 " + ((double)stock-amount1) + "만큼 초과 했습니다.");
        }else if(amount1 <=0){
            System.out.println("판매 실패 : 판매수량은 양수여야 합니다");
        }else{
            System.out.println(amount1+"개 판매 완료. 남은 재고량은 " +(stock-amount1) + "입니다.");
        }

    }
}
