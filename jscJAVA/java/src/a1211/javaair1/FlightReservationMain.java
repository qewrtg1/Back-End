package a1211.javaair1;

import java.util.Scanner;

public class FlightReservationMain {
    public static void main(String[] args) {        // [4-1]
        FlightManger fm = new FlightManger();
        //객체가 생성됨과 동시에 더미데이터도 들어가 있는 거임.  // [3-2] 구간의 내용이 들어가게 된 것.

        Scanner sc = new Scanner(System.in);
        FileC fc = new FileC();
        System.out.println(fm.airplane);
        System.out.println("=============JavaAir에 오신걸 환영합니다.=============");





// [4-2]
Outter: while (true) {
// Outter : for 같은게 가끔 break를 써도 안 빠져 나갈 때가 있음. 이걸 쓰면 강제로 나올 수 있도록 유도함
            System.out.println("1. 항공편 목록\n2. 항공편 예매\n3. 예약 조회\n4. 티켓 저장\n5. 항공편 업로드 \n0.종료\n");
            System.out.print("메뉴입력>");

            String menuStr = sc.next();
            sc.nextLine(); //버퍼 비우기 개행문자였나

            int menu = -1;

            try{
                menu = Integer.parseInt(menuStr);
            }catch(NumberFormatException e){
                menu = 9;
            }

            switch (menu) {
                case 1: // 항공편 목록 보이게 하는 메서드
                    fm.displayFilghtList("항공편 목록");
                    //fm 는 fmanager에서 왔지?
                    break;
                case 2:
                    try {
                        fm.bookFlight();
                    } catch (InterruptedException e) { // 메서드에 스로우 InterruptedException 안쓰면 계속 빨간줄.
                        e.printStackTrace();
                    }
                    break;
                case 3: // 예약 확인
                    fm.checkReservation();
                    break;


// 3번 이후론 거의 복붙만 함
                case 4:// 티켓을 파일로 저장
                    fm.ticketSave();
                    break;
                case 5: //항공편 업로드 -> 항공편 불러오기
                    fc.upload();
                    break;  


                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    break Outter;
                    // 이렇게 하면 지정한 위치(Outter)로 빠저나감. 
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
                    //스위치 문만 빠져나간다?
            }
        }
    }
}
