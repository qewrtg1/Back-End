package a1118;

public class A_4IndexOf {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        int location1 = subject.indexOf("24425165");
        //만약 주어진 문자열이 대상 문자열 안에 없다면, indexOf()는 -1을 반환합니다.
        System.out.println(location);
        System.out.println(location1);


        String subString = subject.substring(location);
        // 인덱스번호 3번부터 끝까지 문자열을 추출해서 substring 변수에 넣어라.
        System.out.println(subString);
        // 값 확인해봐
        location = subject.indexOf("자바");
        //자바라는 단어가 없으면 ? 위와 동일하게 -1을 추출. 있으면 잘 함.

        if (location != -1) {
            System.out.println("자바와 관련된 책이 맞습니다.");
        }else{
            System.out.println("자바와 관련된 책이 아닙니다.");
        }


        if (location1 != -1) {
            System.out.println("자바와 관련된 책이 맞습니다.");
        }else{
            System.out.println("자바와 관련된 책이 아닙니다.");
        }
//위와 아래는 똑같음  
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이 맞습니다.");
        }else{
            System.out.println("자바와 관련된 책이 아닙니다.");
        }
    }
}
