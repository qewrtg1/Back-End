package a11.a1128.sort.Hak1;

import java.util.Scanner;



public class Main222 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //3명의 학생을 입력받아보자.
        System.out.println("학생 수를 입력하세요: ");
        int n = sc.nextInt();
sc.nextLine(); // 이렇게 빈 걸 하나 더 만들면, 가끔 엔터를 칠 때 엔터값이 입력되어버리는데
                // 이를 '개행문자'라고 하고 이를 소비해서 없애버림
         
        //학생 배열을 생성해보자.

        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            System.out.print("학생이름: ");
            String name = sc.nextLine();
            System.out.print("학생나이: ");
            int age = sc.nextInt();
            System.out.print("학생학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); //개행문자소비



            students[i] = new Student(name, age, studentId);
            // a, b, c 같이 대충 써도 됨.
            // i값마다 하나씩 배열을 넣는다?라고 이해하면되나

        }
        //삽입 정렬을 해보자.

        InsertionSort(students); //노랑부분은 임의로 지은 이름.

         //정렬된 결과중력
         System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }
  
    }
    
        //메서드 생성
    private static void InsertionSort(Student[] students) {
        int n = students.length; // 배열의 총 숫자를 n이란 값에 넣고.
        for(int i = 1; i < n; i++){
            Student cStudent = students[i];
            int j = i-1;
            while (j>=0 && students[j].getName().compareTo(cStudent.getName())>0) {
               students[j+1] = students[j]; //한칸씩 뒤로 이동
               j--;
            }
            students[j+1] = cStudent;
          }
          
           
     }
}








//퍼블릭은 쓰면 안 된다 알지?
class Student{
    private String name;
    private int age;
    private int studentId;

    
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

}