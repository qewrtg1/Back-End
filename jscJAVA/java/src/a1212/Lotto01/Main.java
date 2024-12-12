package a1212.Lotto01;

public class Main {
    public static void main(String[] args) {
        Membership123 m= new Membership123();
        m.membershipGuide();
        
        //위에서 가입했으면 이제 로또를 구매해야함.

        //이 아래 전부 그냥 전구로 클래스 메서드 순간순간 만들어버림
        Purchase123 p = new Purchase123();
        p.perchaseQuestion(m);
    }
}
