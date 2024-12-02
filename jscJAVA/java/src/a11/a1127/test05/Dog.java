package a11.a1127.test05;

class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void move() {
        System.out.println("네 발로 걷는다");
    }
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }

}

class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void move() {
        System.out.println("날개로 날아간다");
    }
    @Override
    public void sound() {
        System.out.println("짹짹!");
    }

}


class Fish  extends Animal{
    public Fish (String name, int age){
        super(name, age);
    }
    @Override
    public void move() {
        System.out.println("....");
    }
    @Override
    public void sound() {
        System.out.println("지느러미를 이용해 헤엄친다!");
    }

}

