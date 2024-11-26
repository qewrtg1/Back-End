package a1126.asd;

public class Main5 {
   public static void main(String[] args) {
        Person person = new Person("홍", 22);
        // System.out.println(person); 이러면 주소만 나온다. 알지?
        //getter setter도 필요함
        System.out.println(person.toStr());//겟,셋을 안쓸거면 이 메소드를 만들어야 함
        
    
        } 
    }
        
        
    class Person{
        private String name;
        private int age;
        //전구로 생성자를 만들고
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toStr(){//메소드 이름은 ㅈ대로 해도 됨.
            return String.format("이름: %s, 나이: %d", name, age);
        }
        // 복습할 때 확인좀. get set과 format의 정의나 차이에 대해서.
}
