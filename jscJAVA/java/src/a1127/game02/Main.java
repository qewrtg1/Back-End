package a1127.game02;

public class Main {
    public static void main(String[] args) {
        
        Hero[] heros = new Hero[3]; //부모 객체를 배열로 선언
        heros[0] = new Warrior("전사"); //부모 객체 배열에 자식 객체를 업캐스팅
        heros[1] = new Archer("궁수");
        heros[2] = new Wizard("마법사");

        for(int i=0; i < heros.length; i++){
            heros[i].attack();

            // if(heros[i] instanceof Warrior){
            //     Warrior temp = (Warrior) heros[i];
            //     temp.groundCutting();
            // }else if(heros[i] instanceof Archer){ //부모 배열에 있는 타입을 다운캐스팅
            //     Archer temp = (Archer) heros[i];
            //     temp.fireArrow();
            // }else if(heros[i] instanceof Wizard){
            //     Wizard temp = (Wizard) heros[i];
            //     temp.freezing();
            // }else{
            //     System.out.println("잘못됬습니다.");
            // } 
            

            //이게 기본기인데 자바 17버전 이상부턴 조금 다르게 할 수 있음

            
            if(heros[i] instanceof Warrior w1){
                w1.groundCutting();
            }else if(heros[i] instanceof Archer a1){ 
                a1.fireArrow();
            }else if(heros[i] instanceof Wizard ww1){
                ww1.freezing();
            }else{
                System.out.println("잘못됬습니다.");
            }
            
            //이렇게 축약할 수도 있음.
            

        }

    }
}
