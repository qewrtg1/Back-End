package a1118;
//161~162
public class A_2replace1 {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변 입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바", "JAVa");
        
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}