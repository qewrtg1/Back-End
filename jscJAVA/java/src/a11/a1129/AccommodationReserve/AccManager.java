package a11.a1129.AccommodationReserve;

import java.util.ArrayList;
import java.util.Scanner;

//숙소를 관리하는 정보를 담을 class

    //이 acc매니저를 실행하면, 

public class AccManager { // [1]
    //array 배열 생성.
    private ArrayList<Accommodation> accommodations; // 숙소 집합? 숙소 리스트인가? 
    private ArrayList<Accommodation> bookeAccommodations; // 예약한 숙소 현황? 예약된 애들이 여기에 저장됨.
                                    //객체명은 대문자를 잘 안 씀

    //생성자 생성, 그런데 내용을 좀 수정함 [2]
    public AccManager() { // 메서드?
        accommodations = new ArrayList<>(); //초기 숙소를 저장할 리스트.
        bookeAccommodations = new ArrayList<>(); //이런걸 초기화한다고 표현하나봄
        

        //초기 숙소 추가?[3]
        accommodations.add(new Accommodation("호텔A", "서울", 100.0));
        //Accommodations 어커먼데이션즈 라는 객체를 만든 거임
        accommodations.add(new Accommodation("호텔B", "부산", 80.0));
        //arraylist 배열에 하나씩 들어가는 것...?
        accommodations.add(new Accommodation("호텔C", "제주", 120.0));

    }




    public void disAvailAccommodations() {
// [4-3-3_1] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐
        System.out.println("예약가능 숙소 보기");

        for(Accommodation accommodation : accommodations){
//Accommodation:클래스명, accommodation(변수명{아무이름이나 써도 됨}) : accommodations(AccManager에서 가져온 객체)
            
            //숙소를 보기 위해서 만들었던 참거짓을 활용해 if문으로 만들 거임
            if (accommodation.isAvailalbe()) { //여기 ()괄호는 이미 true값이 들어가 있어서 굳이 true를 다시 안 써도 됨.
                //요컨데 객체에 true값이 있을 경우에, so를 출력하라 라는 의미.
                System.out.println(accommodation);                
            }
        }

    }




    public boolean bookeAccommodations(String name) { //named은 accommDTName값임. 변수명이 너무 길어서 줄였음 줄여도 됨.
// [4-3-3_2] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐

        for(Accommodation accommodation : accommodations){ //위와 똑같이 하나하나 돌려보면서
            if(accommodation.getName().equalsIgnoreCase(name) && accommodation.isAvailalbe()){
            //equals 랑 equalsIgnoreCase의 차이를 기억하면 좋음 equalsIgnoreCase를 더 자주 쓴다더라
                accommodation.book(); //isAvailalbe 에 false를 넣는 메서드임.
                bookeAccommodations.add(accommodation);
                //bookeAccommodations에 accommodation객체를  추가해줌
                // = 예약 숙소에 arraylist를 추가한다...?

                return true; // 반환해줘야 하니까.
            }
        }       //else를  안 쓴 이유는 boolean 값이라서??? 뭔가 합당한 이유가 있었는데.
        return false;
    }




    public void disBookedAccommodations() {
// [4-3-3_3] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐
        System.out.println("예약한 숙소 현황: ");
        for(Accommodation accommodation : bookeAccommodations) // for each문, accommodation는 몇 번이고 말하지만 이름 대충 쓰면 됨
        System.out.println(accommodation); // tostr 덕분에 걍 이름만 써도 되는 건가?
    }




    public void addAccommodation(String newName, String newLocation, double newPrice) {
// [4-3-3_4] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐
        accommodations.add(new Accommodation(newName, newLocation, newPrice));
        // 기존에 있던 accommodations에 add로 추가해주는 거임
        // switch문 case 4번 에서 받은 newName, newLocation, newPrice값을 넣어줌.
    }




    public void deleteAccommodation(String dname) {
// [4-3-3_5] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐

        boolean result = false; 
        for(Accommodation accommodation : accommodations){
            if (accommodation.getName().equalsIgnoreCase(dname)){ //대소문자 관계없이 같은 게 있는지
                
                if(accommodation.isAvailalbe()){ //이중if문. 예약이 되어 있는 걸 지우면 안되기에 만드는 내용
                    accommodations.remove(accommodation);
                    result = true;
                    break; //삭제됐으면 for문에서 나가게
                }else{ // 숙소가 예약중이면 삭제 불가능하게 하려고 만듬
                    result = false;
                    break;
                }
                
            }
        }
        if (result) { // 참이 된 거???
            System.out.println("삭제 완료");
        }else{
            System.out.println("삭제 실패");
        }
    }













// [4-3-3_6] 4번째면서 3번파일(main)에 3번째 만든switch에서 만들어짐
// 제일 어렵고 긴 메서드 제작임

    public void updateAccommodation(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true; 
        Scanner sc = new Scanner(System.in); // 3번엔 있지만 여긴 scan 처음이라 만들어줘야함.

        // 본문에 없던 새로운 객체도 만들 거임
        Accommodation newA = new Accommodation(); // 처음 만들 때 빨간 줄이 나올 거임. //빈 객체?
//여기서뭔가 문제가 생겨서 파일1(Accommodation)로 돌아감 (1-1) 
//기본 생성자를 파일1에 만들어야 한다?



        System.out.println(uname);



//기본생성자 만들다가 못해서 여기 부분 좀 못 들었음 순서는 영향 없음
        for(Accommodation a : accommodations){//리스트를 순회하면서 같은 이름이 있는지, 를 알아보고. 같은 이름이 있으면 i++하고 ~
            i++;
            if(a.getName().equals(uname)){
                index = i - 1;  // 이름이 같은 애가 발견될 때 계속 i++될 거다?
                                // 아무튼 index는 -1이 안될 거다?
                newA = a;       // 이름이 같으면 객체를 생성해서 해당 객체를 newA에 넣어 저장함.
            }
            System.out.println(a.getName().equals(uname) + " " + a.getName() + " " + uname); //사람이 있으면 true가 나오겠지
//이름 일치를 확인해. 그리고 트루값이 나오면
//newA에 그 값을 넣어둬.
// 아직 수정하려는 구체적인 목적을 모름, 이름인지, 가격인지, 위치인지 등등.

//아무튼 여기까진 이름이 일치하는지만 확인하는 내용을 작성한 거임.
        

        }


        if(index != -1){ // 수정할 호텔이 있다면
            System.out.print("무엇을 수정하시겠습니까? \n 1. 숙박업소 이름 \t 2. 지역 \t 3. 가격 \n >>");//\t : 칸 좀 떨어트리기
            menu = sc.nextInt();
            sc.nextLine(); // 비워주는거임


            while (flag) {
                switch (menu) { // 메뉴 1 2 3 4 입력이 되면 
                    case 1:
                        System.out.println("수정할 이름을 입력하세요: ");
                        newA.setName(sc.nextLine());//d 이름을 입력받을 곳
                        accommodations.set(index, newA); // 덮어 씌우는?
                        flag = false; // 수정하면 더이상 while이 돌 이유가 없어서
                        break;
                
                    case 2:
                        System.out.println("수정할 위치를 입력하세요: ");
                        newA.setLocation(sc.nextLine());// 위치가 수정된 객체.
                        accommodations.set(index, newA); // 리스트에 있는 값을 수정, 이라고 함. 객체 통째로 바뀐다.
                        flag = false; // 수정하면 더이상 while이 돌 이유가 없어서
                        break;    
                    case 3:
                        System.out.println("수정할 가격을 입력하세요: ");
                        newA.setPricePerNight(sc.nextDouble());//
                        accommodations.set(index, newA); // 리스트에 있는 값을 수정, 이라고 함.
                        flag = false; // 수정하면 더이상 while이 돌 이유가 없어서
                        break;

                    default:
                        System.out.println("1 ~ 3번 중에 입력하세요.");
                        break;
                }
                
            }

        //이게 if문 끝임 너무 길어서 적어둠.
        }else{
            System.out.println("찾는 숙소가 없어서 업데이트가 불가능합니다. ");
        }


    }








    public void showAccommodation(String sname) {
    
        for(Accommodation a : accommodations){
            if(a.getName().equalsIgnoreCase(sname)){
                System.out.println(a.toString()); // toString을 보여줘라?
            }
        }

    }


}
