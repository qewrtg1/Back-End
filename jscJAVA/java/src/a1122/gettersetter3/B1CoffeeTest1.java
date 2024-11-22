package a1122.gettersetter3;

public class B1CoffeeTest1 {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노", 3000);
        // 현재의 커피이름과 가격을 출력해 보세요
        System.out.printf("%s(%d원) ->", c.getName(), c.getPrice());
        
        // 가격을 500원 인상해 주세요
        c.setPrice(c.getPrice()+500);
        System.out.printf("인상된 가격 %s(%d원)\n", c.getName(),c.getPrice());

    }
}
class Coffee{
    private String name; //직접 name 접근이 불가능 
    private int price;
   
    public String getName() { //Getter 값을 부를때 (사용할때)
        return name; //여기서 접근이 안 되니까,(1)
    }

    public void setName(String name) { //setter 값을 정할때
        this.name = name;  //여기로 보내서 set효과로 접근 시킨다?(1)
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
   


}
