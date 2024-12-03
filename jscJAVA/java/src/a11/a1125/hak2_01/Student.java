package a11.a1125.hak2_01;

public class Student {

    
    private String name;
    private int StudentId;
    private int kor, math, eng; //인스턴스 변수.

    public Student(){

    } //(1-2) 이렇게 아무것도 안 써 놓는 걸 기본 생성자라고 함.
    // 만약 아래처럼 별도의 생성자를 만들지 않은 상태라면 기본 생성자를 만들지 않아도
    // 있는 걸로 취급, 생성한 걸로 java자체가 적용해줌.

    
    //생성자 : 초기값을 쉽게 대입하려고 만든다.
    public Student(String name, int studentId, int kor, int math, int eng) {
        this.name = name;
        StudentId = studentId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
//get, set부터 만들던 기본 생성자부터 만들던 차이는 별로 없는 듯.
//get > 값을 호출할 때.
//set > 값을 정할 때, 저장할 때.
    
    public double getAverage() {
        double result = (kor + math + eng)/3.0;
        return result;
        //여기까지가 정석이고
        // return (kor + math + eng)/3.0; //이렇게 축약해도 되긴 함.
    }
    //void로 출력할 수도 있는데 조건이 있다
    //return히지 않을 때. 
    
}




// getter, setter, 생성자를 활용한 연습 문제
// 문제 1: 학생 클래스 만들기
// 문제 설명:

// 학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
// 각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록 하세요.
// 생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

