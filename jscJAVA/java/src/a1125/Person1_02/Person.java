package a1125.Person1_02;

public class Person {

    private static int count; //정적 변수 라고 함.
    //전체 사람 수를 저장하는 것 = 정적 변수 ?  클래스 변수? 등등 다 같은 표현임.
    //절대로 기억해야함.
    //공용 변수 = static ?
    //퍼블릭이 아니라 private 면 접근 안됨.


    private String name;  // 변수, 필드,  인스턴스 변수. 다 같은 표현임.
    private int age;
   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;  //객체가 증가할 때마다 1 추가되는 거.
    }

    public static int getTotalCount() {//정적 메소드라고 부름
        return count;
    } //(1-1)

}

//클래스 명으로 접근하는 걸 정적, 이라고 표현하나봄. 
// ex_) Person.count 같은 느낌.


//정적변수 (static 변수 or 클래스 변수)
//정적 변수는 클래스에 속한다. 객체를 생성하지 않고도 클래스 이름으로 직접 접근할 수 있다.
//즉 클래스의 모든 객체가 공유한다.



//정적 메소드 (static)
//정적 메서드는 클래스 에 속하면 객체를 생성하지 않고 
//클래스 이름으로 직접 접근 할 수 있는 메소드.
// 메소드는 인스턴스 변수에 접근할 수 없으며, 오직 정적 변수나 다른 정적 메소드만이 접근(호출)할 수 있다.


// 정적 메소드 = static으로 된 클래스 변수, 정적 메소드만 불러올 수 있다, 로 이해하면 되는 듯.

//막상 보니까 클래스 변수를 불러올 때 getter를 써도 되더라.
//근데 getter 쓰면 스태틱 붙음. 좋지는 않은 방법이라고 한다.
