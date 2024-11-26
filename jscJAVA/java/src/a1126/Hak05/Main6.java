package a1126.Hak05;

//5와의 차이. get set format이 아닌 방법으로 진행할 것


public class Main6{
//모든 자바 클래스는 object 클래스를 상속함. 단지 생략할 뿐?
   public static void main(String[] args) {
        Person person = new Person("홍", 22);
        System.out.println(person.toString());
// 객체 person은 person.toString()가 생략된 형태임.
//          System.out.println(person.toString());
//      =>  System.out.println(person);


//Object, toString 둘다 안 보일 뿐 적용되고 있는 상태다?

//toString() 는 object에서 상속받은 메소드이다.
//객체의 문자열 표현을 정의하는 메소드다.(1-1)


        } 
    }
        
        


    
    class Person{ //(1-2) 여기서 전구를 누르고 toString 오버라이드
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toStr(){//메소드 이름은 ㅈ대로 해도 됨.
            return String.format("이름: %s, 나이: %d", name, age);
        }


//(1-3) : 오버라이딩 만들고 toString을 이용하여 set get fomat없이 볼 수 있음
//toString 문자열을 출력하라? 라는 명령어임.
//여기까지하면 so person 만으로 출력될 거임
        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
        //toString을 오버라이드하면 객체정보를 사람이 읽을 수 있는 형태로 출력할 수 있어
        //디버깅, 로깅, 출력 등에 매우 유용함

}
