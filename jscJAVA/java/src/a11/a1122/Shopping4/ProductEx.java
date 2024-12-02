package a11.a1122.Shopping4;

public class ProductEx {
    public static void main(String[] args) {
        Product1 laptop = new Product1("노트북", 1200000, 10);
        Product1 desktop = new Product1("데스크톱", -100000.0, -5); 
//음수로 넣으면 그냥 음수로 출력됨. 이걸 막아야함. 제한 시키기 위해선 pd1로 돌아가서(1-1)

        // System.out.println("제품명 : " + laptop.getName);
        // System.out.println("가격 : " + laptop.getPrice);
        // System.out.println("재고 : " + laptop.getstock);

        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());


        //가격 수정해보기 //pd1 21번줄을 이용함
        laptop.setPrice(-500); //setter을 이용해서 가격을 수정한 후
        System.out.println("수정된 가격 " + laptop.getPrice()); //getter로 불러옴
//가격 변동이 아니라 수정임.(요컨데 -500원만큼 뺀 값이 아니라 가격 자체가 -500으로 되어버린 것.)
//-500원 이라는 것은 존재하지 않기에 음수를 차단하는 메서드를 적용시킴.




        //재고를 추가하는 메서드를 만들어 봄
        laptop.addStock(5);


        //상품을 판매하는 메서드
        laptop.sellproduct(14);
    }
}
