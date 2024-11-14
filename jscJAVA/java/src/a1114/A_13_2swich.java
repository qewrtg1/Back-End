package a1114;
//122p 8~11뽑기 
public class A_13_2swich {
    public static void main(String[] args) {

        int num = (int)(Math.random()*4) +8;
        // int num1 = num + 8;이거 빼고 위에 한줄로 합치겠음

        switch (num) {
            case 8:
            System.out.println();
                System.out.println("출근");
                break;
            case 9:
            System.out.println();
                System.out.println("회의");
                break;
            case 10:
            System.out.println();
                System.out.println("업무");
                break;
        
            default:
            System.out.println("외근");
                // break; 이건 없어도 되나봄?
        }
    }
}
