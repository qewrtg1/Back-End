package a1212.Lotto01;
//한 파일 내에서 전부 작업하기에 GETset이 필요가 없다?
import java.util.Calendar;
import java.util.Scanner;


public class Membership123 {
    String name;
    String personalYY; // 태어난 년도
    String personalMM; // 월
    String personalDD; // 일
    String email;
    String address; // 주소
    String pw; // 카드의 비밀번호

    //생성 메서드
    public void membershipGuide(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
				" \n\n ##        ####    ######   ######   ######   #####    ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     ##       ##  ##   ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     #####    #####    ###### \r\n"
				+ " ##       ##  ##     ##       ##     ##       ## ##      ##    \r\n"
				+ " ######    ####      ##       ##     ######   ##  ##     ##");
		
		System.out.println("\n[INFO] 안녕하세요. 동행로또입니다.\n"
				+ "로또 구입을 위해선 회원가입이 필요합니다.\n"
				+ "회원가입을 진행하시겠습니까?\n"
				+ "[1] 예\t[2] 아니요");
		
		String answer = ""; 

        for(;;){ // 무한루프. 따로 빠저나갈 수 있게 하지 않으면
            System.out.print("n입력: ");
            answer = sc.next();
        //여기서 입력할 때 , 1만 입력할 수 있고 '예'라고도 입력할 수 있으니까.
        if(answer.equals("1") || answer.equals("예")){ // 이렇게 만듬.
            personalData(); // 회원가입 
            //1 눌러서 회원가입 메서드를 타거나 이 아래의 값으로 무한루프에서 벗어남.
        
            break; //특정조건을 충족하면 반복문을 종료
        }else if(answer.equals("2") || answer.equals("아니오")){
            System.out.println("\n[ERROR] 회원이 아니면 로또를 구해할 수 없습니다.");
            System.exit(0);//현재 실행중인 자바 프로그램 종료
        }else{
            System.out.println("\n[ERROR] 잘못된 입력입니다. 다시 입력해주세요."); 
        }
        }
    }




    // 회원가입 
    private void personalData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=================================================================\n");
		System.out.println("[INFO] 회원가입을 위해 아래의 양식을 채워주세요.\n");
		
		System.out.print("* 이름 : ");
		 this.name=sc.next();	

        //미성년자는 가입할 수 없다.
        // 생년월일은 조건에 맞지 않으면 다시 입력을 해야한다.
        int personalYYnum = 0;
		int personalMMnum = 0;
		int personalDDnum = 0;

        //입력하는 연도가 올해를 넘기지 않게 만든다.
        Calendar cal = Calendar.getInstance();
        int yy = cal.get(Calendar.YEAR); //현재연도

        
        //이 위론 복붙했고 여기서부터 다시 손작업. 만 18세 이하는 구매 불가능하게 하는 메서드 
        for(;;){
            System.out.print("태어난 년도 4자리를 입력하세요: ");
            this.personalYY = sc.next(); // 여기서 값을 입력받아 저장하고
            personalYYnum = Integer.parseInt(personalYY); // 그걸 괄호에 넣어서 YYnum으로 보내버림

            //이제 19세 계산해야함,  ||: 또는(or),  &&(and) :그리고
            if(personalYYnum ==yy-20 || personalYYnum > yy-20 && personalYYnum <yy){
                System.out.println("[ERROR] 미성년자는 구매불가능"
                + "\n회원가입을 종료합니다");
                System.exit(0);
            }else if(personalYYnum < 1900 || personalYYnum > yy){
                System.out.println("뭔가 잘못 입력 되었습니다. " + "\n 다시 입력하세요");
            }else{
                break;
            }

        }
        for(;;) {
			System.out.print("* 태어난 월 : ");
			this.personalMM = sc.next();
			personalMMnum = Integer.parseInt(personalMM);
			if( personalMMnum == 0 || personalMMnum > 12) {
				System.out.println("[ERROR] 잘못된 입력입니다."
						+ "\n태어난 월을 다시 입력해주세요.\n");
			}else {
				break;
			}
		}


//여기 복붙했는데, dateprinter , printDateTime 둘다 에러 뜰거임. 이때까지만 해도 아직 안 만들었던거라서.
// 각각 클래스, 메서드, 전구로 생성해주면 됨. 
          //입력한 월에 따른 일의 변화
          DatePrinter123.printDateTime(cal);  
          cal.set(Calendar.DAY_OF_MONTH,personalMMnum); //personalMMnum 입력한 달을 넣고
          int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
          //personalMMnum 에 해당하는 달의 마지막 날짜를 구한다.
          for(;;){
              System.out.print("* 태어난 일 : "); //830313이면 13이된다?
              this.personalDD = sc.next();
  
              personalDDnum  = Integer.parseInt(personalDD);
              if(personalDDnum == 0 || personalDDnum > day_count + 1){
                  System.out.println("[ERROR] 잘못된 입력입니다."
                          + "\n태어난 일을 다시 입력해주세요.\n");
              }else{
                  break;
              }
          }
          this.address = sc.next();  
          System.out.print("* 결제 비밀번호 : ");
          sc.next();
          this.pw = sc.next();
          System.out.println("\n[INFO] 회원가입이 완료되었습니다.");
  
          System.out.println("====================================================");
    }
}
