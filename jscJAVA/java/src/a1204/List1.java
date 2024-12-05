package a1204;
//pdf 리스트 참고

import java.util.ArrayList;
import java.util.List;

class Student{
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}


public class List1 {
    public static void main(String[] args) {

        //arraylist 생성하는 법
        List<Student> studentList = new ArrayList<>();


        //배열의 객체 추가하기
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "BOb", 21));
        studentList.add(new Student(103, "Ch", 22));



        //arraylist 출력하기

        System.out.println("student list 출력: " );

        for(Student student : studentList){ //for each문
            System.out.println(student);
        }
        //printList(studentList); 로 통일할 거임



        //특정 인덱스의 객체 가져오기

        System.out.println("\n 특정 인덱스(index:1) 가져오기");
        Student student = studentList.get(1); //이러면 인덱스 1번 전체를 가져옴
        String name = studentList.get(1).getName(); 
// 내용 특정 하나를 뽑아내려면 이런식으로 변수를 따로 하나 만들고 getxxxx로 가져와야함.
        System.out.println(student); // 전체가 출력될 거임
        System.out.println(name); //이름만 출력될 거고

        //모든 student의 '이름'만 출력하고 싶어. = for문 사용

        System.out.println("\n모든 학생의 이름만 출력하기");
        printList(studentList); 



        //데이터 추가를 해보자
        //104, "David" ,23
        System.out.println("\n새로운 학생 추가");
        studentList.add(new Student(104, "David", 23));
        printList(studentList); 
        //계속 반복하는 부분이 있어서 아예 메서드를 만들기로 함.(1)
        //FOR문이나 so(프린트내용)
                
        
        
        
        
        
        
        
        
        
        
    }
    

    //arraylist 출력 메서드를 만든거임 (1)
    private static void printList(List<Student> studentList) {
        for(Student student : studentList){
            System.out.println(student+" ");
        }
        
    }
    
}
