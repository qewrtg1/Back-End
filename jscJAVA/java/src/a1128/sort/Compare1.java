package a1128.sort;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";


        System.out.println(str1.compareTo(str2)); // -1
//  string a는 아스키 코드로 97 b는 98.
//  앞글자만 아스키 코드값으로 봄.
//  a가 작아서 음수 -1 이 나옴.


        System.out.println(str1.compareTo(str3)); // 0
//  값이 같은 a라서 => 0이 나옴


        System.out.println(str2.compareTo(str1)); // 1 
//  b가 더 커서 양수.1이 나옴

    }
}
