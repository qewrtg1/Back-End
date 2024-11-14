package a1114;
//121ㅔ
public class A_13_0swich {
    public static void main(String[] args) {
        // double num = Math.random();//랜덤하게 숫자 나오게 하는 것 메스랜덤은 int로 못받음
        // System.out.println(num); //0에서 1사이의 난수가 랜덤으로 나옴
        
        int num = (int)(Math.random()*6) +1; //이렇게 하면 int로 받을 수 있음
        System.out.println();
        System.out.println(num); // 0.9999 *6 = 5.9999 =(int)5 + 1 =6 1~6사이에서 나오게 함
    }
}
