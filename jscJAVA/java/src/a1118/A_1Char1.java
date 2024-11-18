package a1118;

public class A_1Char1 {
    public static void main(String[] args) {
        String ssn = "7310185";

        char sex = ssn.charAt(6);

        switch (sex) {
            case '1':
            case '3':
                System.out.println("남성입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여성입니다.");
                break;
            default:
                System.out.println("잘못입력됬어요");
                break;
        }

    }
}
