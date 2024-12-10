package a1209.ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeEx {
    public static void main(String[] args) {
        ArrayList<Age> ages = new ArrayList<>();


        ages.add(new Age("학생", 20,"001"));
        
        Age s1 = new Age("학생1", 21 ,"002");
        ages.add(s1);

        Age s2 = new Age();
        s2.setPerson("학생2");
        s2.setAge(20);
        s2.setPersonId("003");
        ages.add(s2);


        // System.out.println(ages);

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("\n=========== 메인 메뉴 ===========\n");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 정보 보기");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. Exit");
            System.out.print("선택해주세요? > ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("학생추가");
                    System.out.print(">>");
                    String n = sc.nextLine();

                    System.out.println("나이");
                    System.out.print(">>");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("학생id");
                    System.out.print(">>");
                    String pId = sc.nextLine();
                    
                    
                    ages.add(new Age(n,age,pId));
                    break;
            

                case 2:
                    if(ages.isEmpty()){
                        System.out.println("에러");
                    }else{
                        for(Age age1 : ages){
                            System.out.println(age1);
                        }
                    }
                break;
                
                case 3:
                    System.out.println("학생 명부 수정 대상의 이름을 입력하시오");
                    String upParson = sc.nextLine();
                    boolean found = false;
                    for(Age age11 : ages){
                        if(age11.getPerson().equalsIgnoreCase(upParson)){
                            System.out.println("변경할 이름");
                            age11.setPerson(sc.nextLine());
                            System.out.println("나이 변경");
                            age11.setAge(sc.nextInt());
                            sc.nextLine();
                            System.out.println("변경할 id");
                            age11.setPersonId(sc.nextLine());
                            System.out.println("변경 완료");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("오류발생");
                    }
                break;
                
                case 4:
                    System.out.println("삭제할 대상 id를 입력 하시오");
                    String delete = sc.nextLine();
                    found = false;
                    for (Age age12 : ages){
                        if (age12.getPersonId().equalsIgnoreCase(delete)) {
                            ages.remove(age12);
                            System.out.println();
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("없어요");
                    }
                default:
                    break;
            }
        }

    }
    
}
// 문제 1. x
// 문제 2.
// student를 담을 수 있는 arraylist를 만들어보세요

// 문제 3 학생관리 프로그램을 만들어보시오?
// 1. 학생 추가하기
// 2. 학생 리스트 조회
// 3. exit 