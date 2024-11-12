package a1112;
//51p

import a1111.char1;

public class String1 {
    public static void main(String[] args) {
        // char var1 = "A"; 이러면 에러 한문자는 '' 작은 따옴표 하나
        // char var2 = '홍길동'; char는 한 문자만 수용 가능함. 홍길동은 크게 3문자로 되어있음

        String var1 = "A"; // string은 char를 보안해서 나온 것?
        String var2 = "홍길동"; // String은 여러 문자를 받을 수 있음

        System.out.println(var1);
        System.out.println(var2);
    }
    
}
