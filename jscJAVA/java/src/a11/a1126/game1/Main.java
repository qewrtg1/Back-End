package a11.a1126.game1;

public class Main {
    public static void main(String[] args) {
        //객체생성
        //클래스타입 객체명 = new 클래스명();
        Pikachu pikachu = new Pikachu();
       
        //(.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
        // pikachu.energy = 100;
        // pikachu.type = "전기";
        // pikachu.level = 1;  //원래는 여기서 부여 했었는데 pikachu에서 바꿈(1-0)

        System.out.println("######## 피카츄#######");
        System.out.println("에너지 : "+ pikachu.energy);
        System.out.println("타입 : " + pikachu.type);
		System.out.println("레벨 : " + pikachu.level);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());




        Pikachu pikachu20 = new Pikachu(150,"전기,강철",20); //(1-4) 이렇게 아예 괄호 안에다 값을 넣어도 됨.

        System.out.println("######## 피카츄20#######");
        System.out.println("에너지 : "+ pikachu20.energy);
        System.out.println("타입 : " + pikachu20.type);
		System.out.println("레벨 : " + pikachu20.level);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());



        Raichu raichu = new Raichu(200, "전기", 30);
        System.out.println("에너지 : "+ raichu.energy);
        System.out.println("타입 : " + raichu.type);
		System.out.println("레벨 : " + raichu.level);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println("공격 C : " + raichu.cAttack());



        Raichu raichu2 = new Raichu(200, "전기", 40);
        System.out.println("에너지 : "+ raichu2.energy);
        System.out.println("타입 : " + raichu2.type);
		System.out.println("레벨 : " + raichu2.level);
		System.out.println("공격 A : " + raichu2.aAttack());
		System.out.println("공격 B : " + raichu2.bAttack());
		System.out.println("공격 C : " + raichu2.cAttack());
    }
}
