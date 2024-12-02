package a11.a1120.class1;


public class A1_StudentEx {
    public static void main(String[] args) {
        A1_Student st1 = new A1_Student(); //이렇게 하면 이게 객체. 객체가 만들어진다고 함
    //A1_Student 객체?에 접근한 거 라고 함.

        st1.name = "홍길동"; //st1->A1_Student->안에 name에 접근한 거임.
        st1.age = 30;
        st1.studentId = "20201024" ;



        A1_Student st2 = new A1_Student();
        st2.name = "이말자"; 
        st2.age = 35;
        st2.studentId = "19950909" ;


        System.out.println("st1을 소개합니다 : ");
        System.out.println("이름: " + st1.name);
        System.out.println("나이: " + st1.age);
        System.out.println("생년: " + st1.studentId);
    }
}
