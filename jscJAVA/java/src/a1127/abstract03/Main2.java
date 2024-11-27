package a1127.abstract03;

abstract class GameCharacter{
    //템플릿 메서드 : 공통 로직 제공하는 역할을 의미. 세부 구현은 자식이 함
    
    public void performAction(){
        prepare();
        action();
        finish();
        //이것들은 추상클래스와는 좀 다르다? 라는데
    }
        
    private void prepare(){
        System.out.println("캐릭터를 준비합니다");
    };


    //추상메서드를 제공하겠음
    //추상메서드 : 구체적인 행동은 자식 캐릭터에서 구현한다.

    protected abstract void action();
    //공통 종료단계

    private void finish(){
        System.out.println("행동을 마무리합니다.");

    }
}




class Warrior extends GameCharacter{
    @Override
    protected void action() {
        System.out.println("전사가 칼을 휘두릅니다.");
    }
}


class Mage extends GameCharacter{
    @Override
    protected void action() {
        System.out.println("마법사가 마법을 사용합니다.");
    }
}










public class Main2 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Warrior();


        System.out.println("전사의 행동");
        warrior.performAction();

        System.out.println("\n 마법사의 행동");
        mage.performAction();
    }
}
