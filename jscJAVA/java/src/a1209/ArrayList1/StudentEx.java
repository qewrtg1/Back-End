package a1209.ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx { //extends Student
        public static void main(String[] args) {

// 문제 2.
// student를 담을 수 있는 arraylist를 만들어보세요

        ArrayList<Student> students = new ArrayList<>(); // 이게 정답임

// 방법 1
        // students.add("Char", "S2003", 23); // add는 하나의 객체? 값? 밖에 넣을 수 없어서 안됨
        students.add(new Student("Alice" , "S001", 20));
        students.add(new Student("Bob", "S002", 22));
        students.add(new Student("Charlie", "S003", 19));
        

// 방법 2
        //이건 좀 구식방법? 
        // Student s3 = new Student("Char", "S2003", 23);
        // students.add(s3);  // 여기까지가 세트임.

        // Student s4 = new Student(); 
        // 메인인 Student에 '기본생성자'가 없을 경우 에러가 생김.
        // 그래서 생성자를 만들어주고 기본 생성자도 꼭 한 번 더 만들어주는 것.


// 방법 3        
        //기본 생성자를 만든 후
        // Student s4 = new Student("Tom", 34); 생성자 규격과 맞지 않아서 안됨.
        Student s4 = new Student("Tom", "S004", 34); // 가능



// 방법 4
        Student s5 = new Student();
        s5.setName("tom");
        s5.setAge(22);
        s5.setStudentId("S005");
        students.add(s5);



// 문제 3 학생관리 프로그램을 만들어보시오?
// 1. 학생 추가하기
// 2. 학생 리스트 조회
// 3. exit 


        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("\n=========== 메인 메뉴 ===========\n");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 정보 보기");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. Exit");
            System.out.print("선택해주세요? > ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //개행문자. 알지?

            switch (choice) {
                case 1: // 학생을 입력받아 넣고 리스트에 추가하는 내용
                    // students.addStudent();
//방법 1. 가장 기초적이고 좋은 방법
                    // System.out.println("학생을 추가합니다.");
                    // System.out.print("학생 이름 : ");
                    // String n = scanner.nextLine();  // 여기에서 선언한 이름 Id, 나이는 기존 선언된 것과 관계 없다는 걸 보여주려고 이상하게 이름을 씀
                    // scanner.nextLine();

                    // System.out.print("학생 번호: ");
                    // String sId = scanner.nextLine();
                    // scanner.nextLine();

                    // System.out.print("학생 나이: ");
                    // int a = scanner.nextInt();
                    // scanner.nextLine();

                    // students.add(new Student(n , sId, a)); // 저장시키는 거임
                    // System.out.println("성공적으로 학생을 추가했습니다!");
//방법 2. 객체를 하나 만드는 것부터 시작
                    Student s6 = new Student();
                    System.out.print("학생 이름 : ");
                    s6.setName(scanner.nextLine());
                    
                    System.out.print("학생 번호: ");
                    s6.setStudentId(scanner.nextLine());

                    System.out.print("학생 나이: ");
                    s6.setAge(scanner.nextInt()); //숫자를 입력할 때, \n 개행문자
                    scanner.nextLine();
//next, nextInt는 에러가 날때가 많음. = 같은 메서드가 입력 버퍼에 남긴 \n을 개행문자로 제거해야함.
//그래서 개행문자를 넣어주면 좋음
                    students.add(s6);
                    System.out.println("성공적으로 학생을 추가했습니다!");

                    break;


                case 2://학생 리스트 보여주기
                    if (students.isEmpty()) { // Empty는 없다는 뜻. 비어있다?
// *students == null**은 students가 null인지 확인하는 코드로, students 객체가 초기화되지 않았거나 참조되지 않은 상태
// students.isEmpty()**는 students가 ArrayList로 초기화된 후, 비어 있는지 확인하는 메서드
                        System.out.println("보여줄 학생이 없습니다.");
                    }else{
                        for(Student student : students){
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    System.out.println("업데이트할 학생 id를 입력해주세요");
                    String updateId = scanner.nextLine();
                    boolean found = false;
                    for(Student student: students){
                        if(student.getStudentId().equalsIgnoreCase(updateId)){
                            System.out.print("새로운 이름: ");
                            student.setName(scanner.nextLine());
                            System.out.print("새로운 나이: ");
                            student.setAge(scanner.nextInt());
                            scanner.nextLine(); // 개행문자.
                            System.out.println("학생 수정 성공");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;




                case 4:
                    System.out.println("삭제할 학생id를 입력하라");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for(Student student: students){
                        if (student.getStudentId().equalsIgnoreCase(deleteId)) {
                            students.remove(student); //리스트에서 학생 한 줄 삭제.
                            System.out.println("학생을 삭제했습니다");
                            found = true;
                            break;                     
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생이 없습니다");
                    }
                    break;





                case 5:
                    System.out.println("프로그램을 종료합니다");
                    scanner.close();
                    // System.exit(0); //이건 안되나?
                    // break: 는 현재 위치만 빠져나가는 명령어라 3에서 swith로 되돌려줌? 
                    // return; //방법 1.  현재 메서드(main) 전체를 종료, 호출된 곳으로 제어를 반환한다.
                    run = false; // 방법2.
                    break; // while문은 false가 뜨는 순간 종료된다. 그걸 이용하여 break를 사용.
                            // break를 사용하지 않으면 default까지 거친 후에 종료됨.
                default:
                    System.out.println("======================");
                    System.out.println("1,2,3,4,5 중에서 입력하시오");
                    System.out.println("======================");

                    break;
            }




        }





    }


    
}
