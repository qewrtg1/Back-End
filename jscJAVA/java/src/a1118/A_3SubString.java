package a1118;
//162p 중요
public class A_3SubString {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        // substring: 문자열을 잘라내서 저장함
        // substring: beginIndex - 지정한 인덱스번호에서부터 잘라냄
        // substring: beginIndex+ endIndex - 0~6까지 잘라냄

        System.out.println(ssn);
        System.out.println(firstNum);
        System.out.println(secondNum);

    }
}
