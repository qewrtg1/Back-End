package a1202.Hak5;

// import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // StudentDTO student1 = new StudentDTO(0,"테스트1",11,100,90,80);
        // StudentDTO student2 = new StudentDTO(1,"테스트1",12,70,80,90);
        // StudentDTO student3 = new StudentDTO(2,"테스트1",13,10,9,8);
        // ArrayList<StudentDTO> arrList = new ArrayList<>();

        // arrList.add(student1);
        // arrList.add(student2);
        // arrList.add(student3);

        // System.out.println(arrList); //엄청 기초적인 방법이라 보기만 하고 다 지움
        //윗 내용은 여기에 쓰여도 되고 DAO에 쓰여도 됨

        StudentDAO test = new StudentDAO();
        Scanner sc = new Scanner(System.in);




        while (true) {
            System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 삭제");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 학생 목록 보기");
			System.out.println("6. 파일로 저장하기");
			System.out.println("7. 학생정보 파일 불러오기");
			System.out.println("0. 종료");
            System.out.print(">>");

            int choice;
            try{
                choice = sc.nextInt();
            }catch(Exception e){//Exception은 가장 큰 예외값이다
                choice = -1;
            }


            if (choice == 1) { //swith로 해도 상관없다. =가 하나면 1을 넣어라 라는 의미가 되니 주의.
                test.userInsert();

            }else if(choice == 2){
                test.userDelete();

            }else if(choice == 3){
                test.userSelect();

            }else if(choice == 4){
                test.userUpdate();

            }else if(choice == 5){
                test.printAll();
            }


            else if(choice == 0){
                System.out.println("시스템 종료");
                sc.close();
                System.exit(0);
            }






        }
    }
}
