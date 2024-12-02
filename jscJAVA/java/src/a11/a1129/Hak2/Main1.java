package a11.a1129.Hak2;

import java.util.ArrayList;
import java.util.Scanner;



public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();         // 변경점







        //학생수를 입력
        System.out.println("학생 수를 입력하세요 : ");
        int n =  sc.nextInt();
        sc.nextLine(); //개행문자소비
        
        // 
        
        //학생 배열 생성
        // Student[] students = new Student[n];         // 변경점



        //학생 정보 입력
        for(int i=0; i < n; i++){
            System.out.print("학생이름: ");
            String name = sc.nextLine();
            System.out.print("학생나이: ");
            int age = sc.nextInt();
            System.out.print("학생학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); //개행문자소비

            students.add( new Student(name, age, studentId));         // 변경점
         }





         //삽입정렬
         InsertionSort(students);          // 변경점 *이녀석 전구버튼 눌러서 1번째줄로 아래 자동수정햇음






         //정렬된 결과중력
         System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }
  
    }







//예시) 이필립, 김은주, 민주희         
       private static void InsertionSort(ArrayList<Student> students) {
                  int n = students.size(); //배열에 총숫자 . 아직은 배열임.? 라는데             // 변경점
                  for(int i = 1; i < n;i++){
                    Student cStudent = students.get(i); //1번엔 김은주가 있고 얘가 key값이 되고
                    int j = i-1;
                    while (j>=0 && students.get(j).getName().compareTo(cStudent.getName())>0) { //아스키 코드값 ,compareTo24.11.28에 했지?             // 변경점
                    // 에러나서 아예 새로 만들기로함   students.get(j+1) = students[j]; //한칸씩 뒤로 이동 // 방을 이동시키는 거임. 아스키 코드값대로 작은걸 앞으로 ㄱㄴㄷㄹ순서?
                       
                    students.set(j+1, students.get(j));          // .set: 변경하다, 라는 뜻 / 변경점 
                    j--;

                    }
                    // students[j+1] = cStudent;          // 변경점 
                    students.set(j+1 , cStudent);          // 변경점 
           }
           
            
      }
}

class Student{
    private String name;
    private int age;
    private int studentId;
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }


}