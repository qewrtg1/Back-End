package a1205;

public class Member {
    public static int MALE = 0; // 남자
    public static int FEMALE = 0; // 여자

    //static 으로 하면? 
    //클래스 변수는 클래스명.변수명, 으로 바로 접근이 가능하다?
    //stream 9 ("박태호", Member.MALE, 30);

    private String name; //이름
    private int gender; //성별
    private int age;    //나이
    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
