package a11.a1126.game2;

public class Main extends Object {
    public static void main(String[] args) {
       
        Pikachu pikachu = new Pikachu();
        System.out.println("피카츄");
        System.out.println(pikachu.toString());
        
        Pikachu pikachu20 = new Pikachu(150, "전기,강철",20);
             
        Raichu raichu = new Raichu();
        System.out.println("라이츄");
        System.out.println(raichu);       
        Raichu raichu40 = new Raichu(400, "메가전기", 40);
        

    }
}