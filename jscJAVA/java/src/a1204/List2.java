package a1204;

import java.util.ArrayList;
import java.util.List;

class Student{
   
    private int id;
    private String name;
    private int age;
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
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

public class List2 {
    public static void main(String[] args) {
        //ArrayList 생성
        List<Student> studentList = new ArrayList<>();

        //객체추가
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 22));
        studentList.add(new Student(103, "Charlie", 21));

        //ArrayList 내용출력
        System.out.println("Student List 출력 : ");
        printList(studentList);

        //특정인덱스의 객체 가져오기
        System.out.println("\n특정 인텍스(1)의 Student 정보");
        Student student = studentList.get(1); //인덱스 1번객체
        //String name = studentList.get(1).getName(); 이름
        System.out.println(student);

        //모든 student 이름만 출력
        System.out.println("\n모든 학생의 이름 출력");
        for(Student s : studentList){
            System.out.println(s.getName());
        }

        //데이터추가 
        //104, "David", 23
        System.out.println("\n새로운 학생 추가");
        studentList.add(new Student(104, "David", 23));
        printList(studentList);
        
        //데이터 변경
        System.out.println("\n특정 학생 변경");
        updateStudent(studentList, 102 ,"Robert", 25);
        printList(studentList);

//
        
        //데이터 삭제 
        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList, 103);
        printList(studentList);

        //특정 학생(데이터) 검색
        System.out.println("\n특정 학생 검색");
        Student search = findStudentById(studentList, 104);
        //일단 학생 전체를 가져온 후에, 대상만 출력하는 식으로 코딩할 것
//findStudentById : 메소드, 학생 전체를 가져온 후 대상을 출력하는 내용
//Student search : 메소드에서 반환된 값을 저장할 곳


        System.out.println(search != null ? search:"학생을 찾을 수 없습니다.");
//search != null : 서치가 null이 아니면
// ? : 물음표(?) 뒤 x:y 는 true false이며 참이면 왼쪽, 거짓이면 오른쪽을 출력하세요.
//search:"학생을 찾을 수 없습니다." =
//  참일 시 , search를 출력하세요
//  거짓일 시 , "학생을 찾을 수 없습니다."

    }
                        
        
        
        
        
                
        
        
    //ArrayList 출력 메서드
    private static void printList(List<Student> studentList) {
        for(Student student : studentList){
            System.out.println(student);
        }
    }



    //학생정보 업데이트
    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge) {
        //리스트를 돌면서 id가 같은 것을 찾아서 이름 과 나이를 변경해보세요 

    //for문으로 돌리는 법 . student를 객체로 받을거고
        for(Student student : studentList){
            if(student.getId() == id){ //studentList 중, 매개변수의 입력된 102(id)와 같은 것
                student.setName(newName);//새로운 이름을 넣고
                student.setAge(newAge);//나이도 넣고. //요컨대id빼곤 다 바꾸는 거임.
                System.out.println("아이디"+id+"정보 수정완료");
            return;
            }
        }
        System.out.println("해당 정보("+id+")를 찾을 수 없습니다.");
    }





    private static void deleteStudent(List<Student> studentList, int id) {
        // for(Student student : studentList){
        //     if(student.getId() == id){ 
        //         studentList.remove(student);
        //         System.out.println("아이디"+id+"정보 삭제 완료");
        //     return;
        //     } //방법 1
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getId() ==id){

                studentList.remove(i);
                System.out.println("아이디"+id+"정보 삭제 완료");
                return;
            }
        }
        System.out.println("해당 정보("+id+")를 찾을 수 없습니다.");
    
    }

    

    private static Student findStudentById(List<Student> studentList, int id) {
        for(Student student : studentList){
            if(student.getId() == id){ 
                return student;
                //return 만 쓰면 true값이 반환된다.?
                //뒤에 student를 써야 student값이 반환됨.
            }
        }
        return null;
        

    }

}
