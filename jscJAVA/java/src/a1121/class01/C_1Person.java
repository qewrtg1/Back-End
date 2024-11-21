package a1121.class01;

public class C_1Person {
    //필드의 정의?

    public String name;
    public int age;
    public String gender;


    //기본 생성자 만드는 방법.

    public C_1Person(){ //이렇게 class만 빼고 그대로 쓰면 된다.

    }
//어제도 했지만 여기까지만 만들면 a1에선 하나만이 된다.
//2개 이상 만들고 싶으면 아래를 만들어야 함.

//전구를 사용

//this값이기에 아래와 같이 하나만 만들면 여러 객체를 만들 수 있다?


    
//의미는 없지만 가급적 기본 생성자 아래에 넣으면 좋다. 관례인듯ㄷ
    public C_1Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



}
