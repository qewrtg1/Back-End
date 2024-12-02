package a11.a1127.shape04;

public abstract class Shape { //abstract: 추상클래스 선언
    



    Point point; //변수선언...? 잘 모르겠음 다른 폴더에 있는데.
// Point에서 나오는 xy좌표를 받는다? 도형의 위피?를 나타내기 위해 사용할 예정
// 아무튼 Point타입의 필드를 만든 것과 같다고 함.
// x,y 좌표를 포함하는 클래스입니다.



    //넓이와 둘례를 구하는 메소드 원형을 정의하시오
    //추상메소드르 만들 것이며
    //추상메서드는 ':{} '<< 같은 블록 없이 메서드 원형만 정의함???

    //자식 클래스에서 반드시 오버 라이딩을 해야만 적용됨.
    //형식: abstract 반환타입+메서드명(매개변수)


//이게  위에서 말한  형식인가?
    abstract double area(); //넓이
    abstract double round(); //둘례가 될 거임



    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }



}
