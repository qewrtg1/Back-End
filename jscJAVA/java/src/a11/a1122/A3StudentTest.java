package a11.a1122;

public class A3StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019112233, "Park");
        Student kim = new Student(2019442233, "kim");
        Student lee = new Student(2019552233, "lee");

        System.out.printf("학생(Student) 객체의 수:%d" , Student.count);
    }
}

class Student{
    //클래스(static)변수를 쓰게 된다.(뭐할 때?)
    static int count = 0; //학생 수를 저장 및 확인하는 걸 만들려고 만든 것?

    //인스턴트 변수(= 객체 였던가?)
    int id;
    String name;


    public Student(int id, String name){
        this.id = id;
        this.name = name;

        Student.count++; //객체가 만들어질 때 마다 1씩 증가하게 만듬. 이렇게 하면 총 객체가 몇 갠지 확인하기 쉽다?
    }
}
