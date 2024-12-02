package a11.a1126.game2;

public class Main1 extends Object{ // extends Object 이거 상시 존재하나 안 보이는 거 기억하고 있지?
    public static void main(String[] args) {


        Pikachu pikachu = new Pikachu();
        System.out.println("피카츄");
        System.out.println(pikachu.toString());
        //.toString() 이거 상시 존재하나 안 보이는 거 기억하고 있지?
        // 이게 존재한다는 가정하에서 부모? 인 피카츄에서 toString 메소드를 만들어줘야함.

        Pikachu pikachu20 = new Pikachu(150,"전기,강철",20);
        System.out.println("피카츄20");
        System.out.println(pikachu20.toString());


        
        Raichu raichu = new Raichu();
        System.out.println("라이츄");
        System.out.println(raichu);       

        System.out.println("라이츄40");

        Raichu raichu40 = new Raichu(400, "메가전기", 40);
        System.out.println(raichu40);       

       
    }
}
