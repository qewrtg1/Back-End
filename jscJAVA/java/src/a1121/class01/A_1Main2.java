package a1121.class01;

public class A_1Main2 {
    public static void main(String[] args) {
        


        C_1Person p1 = new C_1Person(); //이렇게 class? 를 불러오고
//이후 사용
        p1.name ="홍길동";
        p1.age =30;
        p1.gender="남성";

        System.out.println("이름: " + p1.name);
        System.out.println("나이: " + p1.age);
        System.out.println("성별: " + p1.gender);

        //이렇게 한 번에 넣을 수 있다, 는데 큰 의미가 있나 싶음
        C_1Person p2 = new C_1Person("이름" , 22 , "젠더");
    
    
    }
    
}

//p1, p2와 같은 것이 객체.
//p1: 이름 나이 성별 등이 저장되어 있음 , p1.name 같이 안찍고 p1만 찍으면 내용물은 안나오고 p1의 주소만 나온다.
//p2: 이름 나이 성별 등이 저장되어 있음 ,이걸 참조 변수라고 한다?

//212~213p

// 객체와 인스턴트는 같다. 같은 말이다?