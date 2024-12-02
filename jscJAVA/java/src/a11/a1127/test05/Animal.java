package a11.a1127.test05;

abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //추상 메서드
    public abstract void sound();
    public abstract void move();

    //공통정보 출력
    public void info() {
        System.out.println("이름: " + name + ", 나이: " + age);

        System.out.println(this.getClass().getSimpleName() + " : " + name + "나이" + age); //이것도 가능하다?
        //클래스명을 가져온다?
        //현재 객체의 클래스 정보, 의 클래스 명을 반환해줌.
    }


}
