package a11.a1125.hak2_01;

public class Main2 {
    public static void main(String[] args) {
        //학생 객체 생성
        Student student1 = new Student("홍길동", 20231234, 90, 85, 92);

        //학생정보출력
        System.out.println("이름 : " + student1.getName() );
        System.out.println("학번 : " + student1.getStudentId() );
        System.out.println("국어 : " + student1.getKor() );
        System.out.println("수학 : " + student1.getMath() );
        System.out.println("영어 : " + student1.getEng() );
        System.out.println("평균 : " + student1.getAverage() );




        // Student student2 = new Student(); 이렇게 2개째를 만들 때 에러가 뜸.
        // 이유는 student에 이미 생성자1이 존재하기 때문이다.
        // 해결하기 위해선 기본생성자를 따로 만들어줄 필요가있음 (1-1 : student.java)
        Student student2 = new Student();
        student2.setName("아경자");
        student2.setStudentId(112345655);
        student2.setKor(80);
        student2.setMath(86);
        student2.setEng(78);



        System.out.println("이름 : " + student2.getName() );
        System.out.println("학번 : " + student2.getStudentId() );
        System.out.println("국어 : " + student2.getKor() );
        System.out.println("수학 : " + student2.getMath() );
        System.out.println("영어 : " + student2.getEng() );
        System.out.println("평균 : " + student2.getAverage() );
    }
}
