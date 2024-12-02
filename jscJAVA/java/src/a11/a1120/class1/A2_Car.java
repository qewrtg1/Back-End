package a11.a1120.class1;

public class A2_Car {

    //필드 선언임
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    // public A2_Car(){} 과거엔 이걸 꼭 써줬음. 근데 이제 이걸 안 써도 알아서 적용이 됨. 단 하나만 쓸때. (2-1)처럼 혼용하기 시작하면 이야기는 달라짐.
    //220페이지 기본생성자 이야기임 


    // **  여기 매우 중요   ** \\
    // 위 필드선언한 부분 전부 드레그, 전구 클릭
    // 제너레이트 콘스트럭트 클릭하면 이 아래의 모든 내용이 만들어짐


////////////////////////////////////////////////////




    //(EX1-1)과 연관있음 ??
    public A2_Car(){}  // (2-3) 앞 ex에서처럼 방식을 혼용해서 여러개 쓸 때 반드시 이걸 붙여줘야함.


    // public A2_Car(String company, String model, String color, int maxSpeed, int speed){//필드(변수)를 소괄호에 싹 다 박아두고
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed =maxSpeed;
    //     this.speed = speed;
    // } // 이 내용을(3)
////////////////////////////////////////////////////////////////////////////////////////////////////////

    public A2_Car(String c, String m, String co, int max, int sp){//필드(변수)를 소괄호에 싹 다 박아두고
        company = c;
        model = m;
        color = co;
        maxSpeed =max;
        speed = sp; //이렇게 줄일 수 있음(3)
    } // 굳이 위에서 this 붙여서 길게 만든 이유는 공부하다보니 변수명이 곂쳐서 햇갈리지 않으려고
}     // 인듯?
