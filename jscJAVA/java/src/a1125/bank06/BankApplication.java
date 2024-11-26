package a1125.bank06;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100]; //100이 아니라 100개의 방
//모든 계좌 정보를 저장할 곳임
//하나의 배열에 저장함으로 새로운 배열을 만들 필요가 없음. = 그러기 위해서 static을 씀

    private static Scanner scanner =new Scanner(System.in);

    
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택>  ");

            int selectNo = Integer.parseInt(scanner.nextLine());
            //Integer.parseInt: 아마 글자로 들어가도 숫자로 처리해주는 역할임.

            if(selectNo==1){
                creatAccount();//메서드를 만든다.? 
            }else if(selectNo==2){
                accountList();
            }else if(selectNo==3){
                deposit(); //예금
            }
            else if(selectNo==4){
                withdraw(); //출금
            }else if(selectNo==5){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
                                
                
                

                
                
                
                        //계좌 생성하기
        private static void creatAccount() {
            System.out.println("-------");
            System.out.println("계좌생성");
            System.out.println("-------");

            System.out.print("계좌번호: ");
            String ano = scanner.nextLine();

            System.out.print("계좌 주: ");
            String owner = scanner.nextLine();

            System.out.println("초기 입금액: ");
            int balance = Integer.parseInt(scanner.nextLine());


            Account newAccount = new Account(ano, owner, balance); // 객체 생성?


            /////////////////////////////////// 이제부터 처음 만들었던 배열([100])에 넣을 거임
            
            for(int i = 0; i<accountArray.length; i++){
                //말을 잘 이해 못했는데 일단 당장은 100개중 0번 1번방에는 뭔가가 하나씩 들어가 있어서 2번부터 시작해야한다고 함.


                if(accountArray[i] == null){//0번방부터 순회(반복)하면서 값이 비어있는 걸 확인한 후에 집어 넣을 거
                    accountArray[i] = newAccount;
                    System.out.println("결과 : 계좌가 생성되었습니다.");

                    break; //이거 없으면 인덱스 99번까지 계속 같은걸로 채워질 듯?
                }
            }
            //accountArray[0] = newAccount("110-100", "홍길동" , 10000) 이 들어가 있겠지?
        }









            private static void accountList() {
                System.out.println("---------");
                System.out.println(" 계좌목록 ");
                System.out.println("---------");

                for(int i = 0; i<accountArray.length; i++){
                    Account account = accountArray[i];
                    if(account != null){
                        System.out.print(account.getAno());
                        System.out.print("        ");
                        System.out.print(account.getOwner());
                        System.out.print("        ");
                        System.out.print(account.getBalance());
                        System.out.println();
                    }
                }
            }


            

            //3 예금하기
            private static void deposit(){
                System.out.println("-------------");
                System.out.println(" 예금 ");
                System.out.println("-------------");

                System.out.print("계좌번호를 입력하시오 : ");// (1-1) 이걸 제대로 입력했을 때 입력이 맞는지, 맞았다면 전부 출력할 수 있는 로직을 짜야함
                String ano = scanner.nextLine();
                System.out.print("예금액: ");

                int money = Integer.parseInt(scanner.nextLine());

                Account account = findAccount(ano); //(1-2) 그게 이건듯//(1-5)담은 정보를 여기로 다시 반환함.
        
                if(account == null){
                    System.out.println("없는 계좌 번호 입니다.");
                    return;
                }

                account.setBalance(account.getBalance() + money);
                //현재 계좌 잔액을 getter로 불러와서 예금액에 money를 더하게 한 것.


            }
                
                
                
                
            private static Account findAccount(String ano) {  // (1-3) 메소드 만들기 시작
                Account account = null;  //  비어있는 객체를 만든다.
                for(int i = 0; i <accountArray.length; i++){
                    if(accountArray[i] != null){ //accountArray[i] 내용물이 있으면
                        String dbAno = accountArray[i].getAno(); // 꺼내오게 만듬. 꺼내야 비교할 수 있으니까.
                        if(dbAno.equals(ano)){ //db와 ano가 일치하는지 확인. 일치한다면,
                            account = accountArray[i];  // account 에 정보를 담아두고 (1-4)
                            break; // if문에서 빠져나가게 함.
                        }else{
                            System.out.println("계좌 번호가 일치하지 않습니다."); //내가 임의로 넣어봄 문제생기면 이거 빼면 됨.
                        }
                    }
                }
                return account;
            }





            //출금하기인데 걍 예금에 있던거 그대로 쓴거임 

            private static void withdraw(){
                System.out.println("-------------");
                System.out.println(" 출금 ");
                System.out.println("-------------");

                System.out.print("계좌번호를 입력하시오 : ");
                String ano = scanner.nextLine();
                System.out.print("출금액: ");

                int money = Integer.parseInt(scanner.nextLine());

                Account account = findAccount(ano);  //이미 메소드가 존재하기에 그대로 차용해서 씀

                if(account == null){
                    System.out.println("없는 계좌 번호 입니다.");
                    return;
                }
            
                account.setBalance(account.getBalance() - money); //여기 부분 +에서 -로 바꾸기만 하면 됨


            }
            
}
