package a1127.shape04;

public class Point { //1 //4-1
    int x;
    int y;


    //아무것도 없는 기본 생성자를 만듬.
    public Point() { //2
    }
    
    //이 아래는 매개변수가 있는 생성자임.
    public Point(int x, int y) {  //3
        this.x = x;
        this.y = y;
    }


//toString: 알지? so(대상자) = 주소 가 나오는 걸 바꿔주는 녀석
    @Override
    public String toString() {  //4-2
        return "Point [x=" + x + ", y=" + y + "]";
    }


    
}
