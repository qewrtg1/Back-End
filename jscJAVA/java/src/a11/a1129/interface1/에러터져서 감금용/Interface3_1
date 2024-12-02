package a1129.interface1;


interface Flyable{
    void fly();  

    default void sleep(){
        System.out.println();
    }; 

}

interface Swimmalbe{
    void Swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("새가 난다");
    }
}

class Fish implements Swimmalbe {

    @Override
    public void Swim() {
        System.out.println("물고기가 수영한다.");
    }

}

public class Interface3_1{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
    }
}