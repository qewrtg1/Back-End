package a11.a1112;
//57~60p 강제 타입 변환
public class Casting {
    public static void main(String[] args) {
        int var1 = 10; // int를
        byte var2 =(byte) var1; //byte로 바꿀 때 이렇게 쓴다?
        System.out.println(var2); //강제타입 변환 후에 10이 그대로 유지된다. 


        long var3 = 300;
        int var4 =(int) var3;
        System.out.println(var4); 


        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6); // 유니코드 A출력


        double var7 =3.14;
        int var8 =(int) var7;
        System.out.println(var8); //
          //이런 식으로 강제로 변환시킬 수 있음. 그러나 위험한 방식임

    }//59p
}
