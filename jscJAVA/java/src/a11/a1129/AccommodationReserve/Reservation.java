package a11.a1129.AccommodationReserve;

import java.util.Scanner;

public class Reservation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캔
        AccManager manager = new AccManager(); // 숙소관리 객체를 만들었음.
//new AccManager() : 메서드를 생성하는 메서드. = 생성메서드

        boolean flag = true; //무언가 시작하고 끝낼때 쓰는 것. while문에 run넣던거랑 비슷.
//[1]이거 위까지 


        while (flag) { // 반복문
            System.out.println("\n 숙소예약 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 예약 가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 내용물 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요! >>");
            

            int choice = sc.nextInt();
            sc.nextLine(); // 메모리에 있는 개행문제 삭제.
//[2]이거 위까지 



            switch (choice) { //입력된 숫자에 맞춰서 화면을 띄우기 위해 case랑 연동
                case 1:
                    System.out.println("\n 예약가능한 숙소를 조회합니다.");
                    manager.disAvailAccommodations();// disAvailAccommodations라는 메서드를 하나 만들 거임. 처음엔 당연히 없고 이후에 만들어짐.
                    //메서드를 만들면 acc매니저에 가있음
                    
                    // System.out.println("\n 1. 처음으로 되돌아가기 2. 숙소 예약하기");

                    break;
                case 2:
                    System.out.println("\n 숙소를 예약합니다.");
                    System.out.print("예약하려는 숙소의 이름을 입력하세요: ");
                    String accommDTName = sc.nextLine(); // 예시)서울A 라는 숙소를 입력하는 곳
                    
                    if(manager.bookeAccommodations(accommDTName)){ // 메서드를 하나 만들 거임. 처음엔 당연히 없고 이후에 만들어짐.
                    //메서드를 만들면 acc매니저에 가있음
                    //bookeAccommodations 라는 메서드에 accommDTName가 일치하는지 확인하게 하는 
                    
                        System.out.println("숙소가 성공적으로 예약되었습니다.");
                    }else{
                        System.out.println("예약이 불가능하거나 존재하지 않는 숙소입니다.");
                    }

                    break;
                    //예약 가능한 숙소가 있으면 예약한 후 true를 반환함, 그렇지 않으면 false를 반환.
                    //하게 만들어야함 그걸 가능하게 해주는 게 'bookeAccommodations'메소드임
                


                case 3:
                    System.out.println("\n내가 예약한 숙소 보기");
                    manager.disBookedAccommodations();
                    
                    break;



                case 4:
                    System.out.print("추가하려는 숙소를 입력하세요 \n  숙소이름 >>");
                    String newName =sc.nextLine();
                    System.out.print("숙소 위치 >> ");
                    String newLocation =sc.nextLine();
                    System.out.print("일당 숙박 가격 >> ");
                    double newPrice =sc.nextDouble();
                    sc.nextLine(); //개행 문자 초기화
                    
                    System.out.println(newName+ "(은/는) 추가한 숙소 이름입니다."); // 추가하려는 숙소 이름, 으로 바꿔야할 수도 있음

                    if (newName.equals("")) { // 숙소 이름이 입력되어 있지 않으면 재입력 받기 위해 만든 
                        System.out.println("추가하려는 숙소이름 입력 \n 숙소이름>>");                        
                        newName = sc.nextLine();
                    }
                    manager.addAccommodation(newName, newLocation, newPrice);
                    System.out.println("숙소 추가 완료!");

                    break;



                case 5:
                    System.out.println("삭제 시작");
                    System.out.print("삭제하려는 호텔의 이름을 적어주세요: ");
                    String dname = sc.nextLine(); //d는 당연히 딜리트

                    if(dname.equals("")){ // ""는 비어있다는 의미임
                        System.out.println("삭제하려는 호텔의 이름이 잘못 되었습니다. 재 입력하세요 \n 이름>>");
                        dname = sc.nextLine(); //재입력을 위해서
                    }
                    manager.deleteAccommodation(dname); // (dname)이게 왜 있냐면 dacdtion에 dname에서 입력받은 값을 넣으려고

                    System.out.println("5번 명령 실행 종료.");
                    break;







                case 6:
                    System.out.println("수정시작");
                    System.out.print("수정하려는 호텔 이름을 적으시오: ");
                    String uname = sc.nextLine();
                    System.out.println(uname);
                    if (uname.equals("")){
                        System.out.print("추가하려는 숙소의 이름을 입력하시오. \n name >>");
                        newName = sc.nextLine();                        
                    }
//제일 어려운 메서드임
                    manager.updateAccommodation(uname);
//제일 어려운 메서드임
                    System.out.println("수정 끝");
                    break;






                case 7:
                    System.out.println("조회 시작 \n 호텔 이름을 입력하세요>>");
                    String sname = sc.nextLine();
                    if (sname.equals("")){ //case 6번 내용 그대로 복사함
                        System.out.print("조회하려는 숙소의 이름을 입력하시오. \nname >>");
                        newName = sc.nextLine();                        
                    }
                    manager.showAccommodation(sname);
                    System.out.println("조회 끝");
                    break;



                case 8:
                    System.out.println("종료");
                    flag = false;
                    sc.close();
                    System.exit(0);// 괄호에 0번을 주면 빠져나가는 명령어라는데.
                    break;
            


                default:
                    System.out.println("다시 입력하십시오.");
                    break;
            } // [3]
        }




    }
}
