package a1121.Computer04;
//236~238
public class A_1ComputerEX {
    public static void main(String[] args) {
        //컴퓨터 객체 만들거임
        C_1Computer myCom = new C_1Computer();

        int result1 = myCom.sum(1,2,3);
        System.out.println("result1: " + result1);



        int result2 = myCom.sum(1,2,3, 4, 5);
        System.out.println("result2: " + result2);

        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println("result3 : " + result3);

        int result4 = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println("result4 : " + result4);
    }
    
}
