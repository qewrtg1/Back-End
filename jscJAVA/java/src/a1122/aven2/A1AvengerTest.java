package a1122.aven2;

public class A1AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);

        thor.punch(thanos); //메서드(를 아래에 만들 예정임)(전구 1번줄)
        thanos.punch(thor);

            }
        }
        

    class Avenger{
        String name; //필드 생성?
        int hp;        // 전구 4줄
    
        //기본 생성자?
        public Avenger(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }
    
        public void punch(Avenger enemy) { // 메소드 생성
            System.out.printf("[%s]의 펀치\n", name);
            System.out.printf("[%s]의 펀치를 맞은 개체[%s]\n", name, enemy.name);
            enemy.hp = enemy.hp -10;
            System.out.printf("->%s의 체력 : %d\n",enemy.name,enemy.hp);

            System.out.printf("[%s]의 펀치\n", name);
            System.out.printf("[%s]의 펀치를 맞은 개체[%s]\n", name, enemy.name);
            enemy.hp = enemy.hp -10;
            System.out.printf("->%s의 체력 : %d\n",enemy.name,enemy.hp);
        
            System.out.printf("남은[%s]의 체력 : %d\n",enemy.name,enemy.hp);

        }//메소드에 객체도 전달할 수 있다는 걸 보여준 거임



}
