package a11.a1122.gettersetter3;
//매우 중요함 271p
//매우 중요함 271p
//매우 중요함 271p
public class A1AccountTest3 {
    public static void main(String[] args) {
        
        Account acc = new Account(); //객체 1
        acc.setBalance(1000); 
        System.out.printf("잔액 : %d", acc.getBalance());  
        //(1-3) 여기를 이렇게 수정해주면 나옴

    }
}


class Account {
    private int balance;   // (1-1) 여기 전구버튼 눌러서 getter and setter를 만들 수 있음
    //게터 메서드
    //세터 메소드?
    public int getBalance() { // (1-2) 생성한 후 
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}