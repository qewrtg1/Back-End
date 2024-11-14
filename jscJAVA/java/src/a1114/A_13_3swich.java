package a1114;
//122p 8~11뽑기 
public class A_13_3swich {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:

            System.out.println("손님");
                // break; 이건 없어도 되나봄?
        }
    }
}
