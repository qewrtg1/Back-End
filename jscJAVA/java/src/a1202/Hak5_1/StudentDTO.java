package a1202.Hak5_1;

public class StudentDTO {
    //각종 전달할 변수를 선언하자

    private int id;
    private String name;
    private int age;
    private int kor;
    private int eng;
    private int math;

    //기본 생성자
    public StudentDTO(){}


    //생성자
    public StudentDTO(int id, String name, int age, int kor, int eng, int math) {
        this.id = id;  //id는 별도로 입력하지 않아도 알아서 들어가게 만든 거임
        this.name = name;
        this.age = age;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getKor() {
        return kor;
    }


    public void setKor(int kor) {
        this.kor = kor;
    }


    public int getEng() {
        return eng;
    }


    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


@Override
public String toString() {

    return " "+ name + " \t" + age + " \t" + kor + " \t" + eng + " \t" + math;
}//id는 별도로 입력하지 않아도 알아서 들어감



}
