package a1125.Person1_02;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 20); //new = 객체 추가, 증가.
        Person person2 = new Person("김철수", 30);
        Person person3 = new Person("박영희", 25);


        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        // Person.count;  //이건 그냥 안된다?
        // System.out.println(Person.count); //private라서 접근이 안되는 모습.

        System.out.println(Person.getTotalCount());//그래서 메소드 하나 만들러감(1-0)


    }
}
