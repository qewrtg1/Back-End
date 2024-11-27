package a1127.downCasting01;
//괄호없는 숫자는 만들어진 순서


class Animal{// 부모2
    public void move(){
        System.out.println("움직입니다.");
    }
}

class Brid extends Animal{//자식3
    public void bark(){
        System.out.println("짹짹");
    }

    @Override
    public void move() {//brid의 오버라이드 4
        System.out.println("날아갑니다");
    }
}




public class DownCST1 {//메인1
    public static void main(String[] args) {

        // Animal animal =new Animal(); //메소드 가져오기5
        // Brid brid = new Brid();
        // animal.move();
        // brid.bark();
        // brid.move();//오버라이드로 값은 move의 값을 자식에서 바꿈
        // 주석처리6

        Animal animal = new Brid(); //자식을 부모타입으로 변환(이를 업캐스팅이라 함_자동으로 된다?) 7
        
        
        animal.move(); //이러면 6 내용과 다르게 된 걸 볼 수 있음.
                        //자식을 부모로 만들어서 본래 '움직입니다'였던 animal.move가 '날아갑니다'로 교환됨


        // animal.bark(); 
        // 그러나 이건 안 된다. 부모 안에 있는 메소드만 사용이 가능하다. bark은 자식한테만 존재하고 부모에겐 존재하지 않음


        //8
        //다운캐스팅 한 번 더 보여줌
        if(animal instanceof Brid){ //뭐가 버드 타입이면?
            Brid brid = (Brid) animal;
            brid.bark();
            
        }else{ // 타입이 아니면 에러날 수도 있으니까.
            System.out.println("Bird 타입이 아닙니다.");
        }//이렇게하면 7에서 안 된다 한 게 된다.
    }
}
