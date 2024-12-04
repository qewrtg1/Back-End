package a1204;
//하다가 놓쳐서 따로 빼둠



import java.util.HashMap;
import java.util.Map;

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




//Map 의 장점.
public class Map1_1 {
    public static void main(String[] args) {
        
    //Map 생성
    Map<Integer, Student> studentMap = new HashMap<>();
// Integer는 인덱스 번호 말고 값을 구분할 수 있는 키 값을 별도로 넣어줌. (일종의 번지? 인듯)


    // 객체 추가
    studentMap.put(1, new Student(101, "Alice", 20));
    studentMap.put(2, new Student(102, "Bob", 22));
    studentMap.put(3, new Student(103, "Charlie", 21));


    //map내용 출력해보기
    System.out.println("student map 출력");
    for(Map.Entry<Integer, Student> entry:studentMap.entrySet()){
//entry뜻 : 항목

// Map.Entry<Integer, Student>  : 모름
// entry: 이 객체의 이름
// studentMap : map생성한 초기 변수명
// entrySet : 자바에서 정해준 메서드 이름?
    System.out.println("key "+entry.getKey() + ".value:" +entry.getValue());
    }


//특정 키로 객체를 가져와보자
    System.out.println("\n 특정키(2)의 정보 가져와보기");
    Student student = studentMap.get(2);
    System.out.println(student);

    //모든 이름을 출력해보자

    System.out.println("\n모든 학생 이름 출력");
    for( Student s : studentMap.values()){
        System.out.println(s.getName());
    }

    //Map 학생 한 명을 추가하는 데이터를 추가해보자.

    addStudent(studentMap, 4, 104, "Jogn" ,27);
        //지금까지 있던 studentMap에?, 추가한다? 
    printMap(studentMap);
        
    
    }
    



    
    private static void printMap(Map<Integer,Student> studentMap) {
        System.out.println("Student Map 출력");
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            System.out.println("key: "+ entry.getKey() + ". Value:"+ entry.getValue());
        }    
    }
    
    
        private static void addStudent(Map<Integer, Student>  studentMap, int key, int id, String name, int age) {
        Student student=new Student(id, name, age);
        studentMap.put(key, student);

    }

}

