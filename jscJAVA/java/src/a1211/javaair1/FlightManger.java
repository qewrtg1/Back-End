package a1211.javaair1;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
    // [3-1]
import java.util.Scanner;
public class FlightManger {
    private static ArrayList<Flight> flights; // 항공편 정보를 저장하는 arraylist 가 될 거임.
    private static ArrayList<Passenger> passengers; // 예약된 승객의 정보를 저장하는 곳임.
    
    //승객을 키(key)로 하고? 예약된 항공편을 값으로 가지는 맵을 하나 만들겠음
    private static Map<String, Flight> reservationMap = new HashMap<>();


    // [3-1-1] 여기 만들고 filec.java를 만들었음
    private static FileC fc = new FileC(); // 파일 관련 작업을 할 메서드임.
    Scanner sc = new Scanner(System.in);


    // [3-2]
    public FlightManger(){  // FlightManger 라는 메서드를 만들고
    //기본 생성자에 더미데이터를 넣는 것<<- 이게 정확한 표현인듯.
        flights = new ArrayList<>(); // 메서드에 arraylist 배열을 만든 후

        flights.add(new Flight("제주","11:55", 78000, false));
        flights.add(new Flight("이스탄불","17:10",1200000,true));
        flights.add(new Flight("방콕","21:35",280000,true));
        // 더미 데이터를 넣어줌

        passengers = new ArrayList<>();
        Flight sf = flights.get(0); //Flight 에서 하나를 꺼내옴. 0이니까 '제주' 인 듯?
        reservationMap.put("테스트", sf); // sf 0번(제주)을 가져와 봄. 테스트 해보려고. 뭘 테스트 한다는 건진 모르겠음.  
    }



    // [3-3] 
//항공기 모양이 나오게 만들어진 문자 아트. 교수님한테 받아서 복붙한 거임.
    public String airplane = "                       |                      \n" + "                      _|_                     \n" + "                    /_____\\                  \n" + "                   /oo   oo\\                 \n" + " \\_________________\\       /_________________/\n" + "  `-------|---|-----\\_____/-----|---|-------'\n" + "         ( ) ( )  O|OOo|oOO|O  ( ) ( )   \n";




    // [4-2-1]
    public void displayFilghtList(String str11) {
        //항공편 목록 출력 메서드. // 아까 flight에 만들어둔 toString을 이용할 것.
        System.out.println("================== " + str11 + " ==================");
        int count =1;
        for(Flight flight : flights){ // flights위에서 만들었던 더미데이터
            System.out.println(count+ "" +flight.toString()); // .toString()은 항상 생략되어 있어서 굳이 쓰지 않아도 되긴 한다. 기억하라고 써둠.
            count++;
        }
        System.out.println("===============================================");
    }



    // [4-2-3]
    public void bookFlight() throws InterruptedException{
        //국제선 - 사용자 이름,생년월일(다른곳에 메서드 만들었음) 을 입력받을 예정
        //확인후 만 15세 미만 예약을 거절하게 짜야 함.

        for(;;){ // 무한루프를 시키는 거임.
            displayFilghtList("항공편 예매"); // 괄호 임의로 작성함
            System.out.print("예매할 항공편 입력 >> ");
            
            try {
                int bookNum = Integer.parseInt(sc.next()); // 문자여도 숫자로 바꾼다??
// 기억해도 0번에 기억된다? 뭔소린지 모르겠음. 화면엔 1번부터 시작하지만 인덱스번호는 0번인 걸 말하나 봄.
// 입력받은 번호는 flight.get(Booknum-1);  해야 한다?
                if (bookNum > flights.size() || bookNum < 1) { // flights =3 3밖에 없으니까
                   //예약할 수 있는 목록의 갯수?보다 크거나 목록이 없으면 (여기서 ㄹㅇ 끝남)
                    System.out.println("잘못된 입력입니다");
                    continue; // 잘못 입력했으면 되돌리려고.(루프시킴)
                                //사용자에게 올바른 입력을 다시 요청시키는 용도.
                }
                System.out.println("선택한 항공편");
                System.out.println("===============================================");
                System.out.println(bookNum + "" + flights.get(bookNum - 1));
                System.out.println("===============================================");


            
                Flight sf = flights.get(bookNum -1); // 선택한 항공편을 sf에 저장하고,
                if(flights.get(bookNum-1).getInternationaFlight()){ //국제선을 선택하면 물어보겠다.
                    // getInternationaFlight 메서드는 flight에서 시작됨.
                    //국제선을 선택했을 때, 아래 so 출력.
                    System.out.println("국제선은 만 15세 이상 예매가 가능합니다.");
                    passengerInfo(sf);
                    // passengerInfo(sf);
 // [4-2-4 passengerInfo 메소드 생성]
                }else{
                    
                }
                if(passengers != null && passengers.isEmpty()){ // isEmpty : 비어있다?
                    String seatNum = Integer.toString(seatSelection(sf)); // 좌석을 넣을 거다.
// [4-2-5] seatSelection 메소드도 만들어야 함. 
                    passengers.get(passengers.size()-1).setSeat(seatNum);
                    System.out.println("예약 중 입니다.");
                    Thread.sleep(2000); // 2 초 실행하게, 있어 보이려고 넣는 것.
                }
                System.out.println("===============================================");
                System.out.println("예약에 성공했습니다.");
                System.out.println("[ " + passengers.get(passengers.size()-1).getName() + " ] 님의 예약정보");
                System.out.println(bookNum + "" + sf);
                System.out.println("===============================================");

                System.out.println("잠시후 메인 화면으로 이동합니다.");
                Thread.sleep(2000);
                reservationMap.put(passengers.get(passengers.size()-1).getName(),sf);
                break;
                
            } catch (NumberFormatException e) {//숫자가 아닐 경우 처리하는 에러코드메서드
                System.out.println("잘못된 입력입니다.");
            }
        }

    }






// [4-2-5 내부 내용은 복붙받음. ]
    private int seatSelection(Flight flight33) { // 좌석 예약.
        int seatNum = -1;
            while (true) {
                try{
                    System.out.println("========================================");
                    flight33.seatToString(); //빈좌석 보이는 print
                    System.out.println("좌석을 선택하세요");
                    System.out.print("선택>");
                    int seatInt = sc.nextInt() - 1 ;
                    sc.nextLine();


                    if(seatInt + 1 < 1 || seatInt + 1 > 20){//좌석이 1~20인지
                        System.out.println("존재하지 않는 좌석입니다.");
                    }else if(flight33.getSeats().get(seatInt).equals("XX")){
                        // 왜 get안에 get이 또 있는가.
                        // seatInt . 내가 입력한 번호
// class Flight [1-5] 에 가보면 좌석이 어떤 식으로 되어 있는지 알 수 있음. 어디가 몇 번 인지 등
// Flight에 arraylist를 넣어 놨고 거기에 접근하려고 하다보니 set get이 여러번 쓰이게 됐다 함.                        
                        System.out.println("이미 예약된 좌석입니다.");
                    }else{
                        //좌석이 비어있는 경우 XX를 넣는다.
                        flight33.getSeats().set(seatInt, "XX"); // 좌석 수정이 된다.
                        System.out.println("좌석 선택이 완료되었습니다.");
                        seatNum = seatInt;
                        break;
                    }

                }catch(InputMismatchException e){
                    System.out.println("잘못된 입력입니다.");
                    sc.nextLine();
                }
            }
            return seatNum;
    }
            
                

// [4-2-4 passengerInfo 메소드 생성]
    private void passengerInfo(Flight flight22) {
        System.out.println("예매자 정보를 입력하세요");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.printf("생년월일(6자리):");

        try {
            int birthDate = Integer.parseInt(sc.next());
            Passenger p = new Passenger(name, birthDate); // 두개짜리 세개짜리 생성자 만들었던 거
            if(!p.man15(p) && flight22.getInternationaFlight()){ // p 가 15가 아니면(false)
                //!p.man15(p) false로 오면 true로 바꾼다???
                //왼 오 true여야만 실행되게 만듬
                //만 15세 검증 하는 거(메서드) 만들어 뒀지
                System.out.println("만 15세 미만은 예약이 불가능합니다");
            }else{
                System.out.print("결제 비밀 번호를 입력하세요: ");
                String pw = sc.next();
                p = new Passenger(name, birthDate, pw); // 이 3가지가 모두 있는 것 만이
                passengers.add(p);//항공예약명단에 추가  // 여기에 저장이 된다? 라고 이해하면 되나봄
            }

        } catch (DateTimeException e) {
            System.out.println("생년월일을 6자리로 입력해주세요 ex)19990101");
        }
    }







// [4-2-6] 내용이 답 없이 존나 길어서 복붙받음. 

    public void checkReservation() {//예약확인
        int index = search("예약 확인"); // // [4-2-7]
        checkPassword(index); // // [4-2-8]
    }




 // // [4-2-8]
    private void checkPassword(int index) {
    for(;;){
        if(index !=-1){
            System.out.print("결제 비밀번호: ");
            String pw = sc.next();
            System.out.println();
            if(passengers.get(index).getPw().equals(pw)){
                System.out.println("비밀번호가 일치합니다.");
                System.out.println(ticketPrint(reservationMap, passengers.get(index).getName()));
                 // // [4-2-9]
                break;
            }else{
                System.out.println("비밀번호가 일치하지 않습니다.");
            }

        }else{
            System.out.println("일치하는 이름이 없습니다.");
            break;
        }

    }

    }




 // // [4-2-9]
    String ticketPrint(Map<String, Flight> reservationMap, String name) {
        int index = -1;
        if(passengers !=null){
            for(int i=0; i < passengers.size();i++){
                if(passengers.get(i).getName().equals(name)){
                    index = i;
                }
            }
        }
        int seat = Integer.parseInt(passengers.get(index).getSeat())+1;
        return  "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n\n" +
                "\t" + name + "님의 티켓정보" +
                "| 좌석 : " + seat + "번\n"+
                "." + reservationMap.get(name) + "\n\n" +
                "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
    }




 // // [4-2-7]
    private int search(String str) {//이름을 검색받아서 인텍스 번호 반환
        System.out.println("===================== " + str + " =====================");
        System.out.print("예약자 이름: ");
        String name = sc.next();
        sc.nextLine();

        int index = -1;
        if(passengers != null){
            for (int i=0; i < passengers.size(); i++){
                if(passengers.get(i).getName().equals(name)){
                    index = i;
                }
            }
        }

        return index;
    }




// 이거 // // [4-2-9] 하는 중에 갑자기 넣음 

public void ticketSave() { // 케이스 4번인가봄
        int index = search("티켓 조회");
        checkPassword(index);
        fc.ticketSaveFile(reservationMap, passengers.get(index).getName());
    }
    public static ArrayList<Flight> getFlights() {
        return flights;
    }
    public static Map<String, Flight> getReservationMap() {
        return reservationMap;
    }

}
