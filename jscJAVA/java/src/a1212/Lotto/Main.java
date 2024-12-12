package a1212.Lotto;

public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.membershipGuide();
        //로또를 구매
        Purchase p = new Purchase();
        p.perchaseQuestion(m);

        //3초 뒤 진행하게 연출하는 것. // 클래스랑 메서드 둘다 만들어서 넘김
        Loading l = new Loading();
        l.Loading();

        //로또번호를 추첨하는 클래스를 만들자
        Lottery lt = new Lottery();
        //랜덤으로 로또 번호를 생성한다.
        lt.randomLotteryNum();

        //당첨된 로또 번호를 출력한다.
        lt.lotteryNum();

        //당첨 결과를 출력한다.
        lt.result(m, p);
        // 가입된 회원의 객체(m)와 로또 구매 객체(p)를 인수로 result메서드에 실어보냄(대입함)
    }
}
