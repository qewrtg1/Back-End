package a1122.Test;

public class Student{

    private String name;
    private int age;
    private int[]testNum;


    public Student(String name, int age, int... testNum) {
        this.setName(name);
        this.setAge(age);
        this.testNum = testNum;
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


    
}
