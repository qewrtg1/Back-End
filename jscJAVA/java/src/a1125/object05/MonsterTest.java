package a1125.object05;

public class MonsterTest {
    public static void main(String[] args) {
        
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");

        // System.out.println(Monster.orc);

        Monster.battle(orc, skeleton);
            }
        }
        
        
        
    
    class Monster{
        private String name;
        private int hp;
        private static int maxHp = 30; //모든 몬스터의 최대 채력 //(1) 이렇게 정해주는 게 더 좋다
    
        public Monster(String name) {
            this.name = name;
            // this.hp = 30; //이렇게 정해줄 수도 있지만(1)
            this.hp = maxHp; //(1) 이렇게 정해주는 게 더 좋다
        }
    
        public static void battle(Monster a, Monster b) { // a와 b는 오크 스켈톤
            while (a.hp > 0 && b.hp >0 ) {
                Monster attacker = (Math.random() < 0.5) ? a:b ; //이게 삼항 연산자였던가
                Monster defender = (attacker == a) ? b : a ;

                attacker.attack(defender);
                
                            }
                        }
                
        private void attack(Monster enemy) { //enemy원래는 defender인데 
            System.out.printf("[%s]의 공격.", name);
            enemy.hp = enemy.hp - 10;

            System.out.printf(" %s의 체력: %d(%d)\n",enemy.name , enemy.hp , Monster.maxHp);

        }



}