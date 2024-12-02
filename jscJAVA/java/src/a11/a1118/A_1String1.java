package a11.a1118;
//148~151p 사이? 157p도 갔음
public class A_1String1 {
    
    public static void main(String[] args) {
        //string은 참조 타입이다. 
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Hello2");


        System.out.println(a == c); //true
        System.out.println(d == f); //false

        System.out.println(a.equals(d)); //true
        System.out.println(b.equals(e)); 

        // == 두 개는 해당 변수의 레퍼런스(참조 정보)를 비교하는 거임. 같다는 의미로도 쓰이는데 정확하겐 참조 정보를 비교한다고 이해해야 하나 봄.
        //equals : 해당 변수의 문자열 자체를 비교한다. 
            // - 157p의 내용처럼 번지를 비교하는 개념과 다르게 이퀄스는 그 안의 내용물만 골라서 비교.
    
    
    }
}
