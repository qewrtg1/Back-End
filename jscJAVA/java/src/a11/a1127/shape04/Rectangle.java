package a11.a1127.shape04;
//Rectangle : 사각형?
public class Rectangle extends Shape{
    
    double width, height ; //이렇게 필드를 한번에 선언할 수 있다 




    //기본 생성자
    public Rectangle() {
        this(0, 0); //기본 값 설정
    }


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    double area() {
        //넓이 값은 당연히 가로 x 세로
        return width * height;
    }


    @Override
    double round() {
        //둘례값이니까 가로+세로*2
        return (width + height)*2;
    }






    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }



    

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }



    
}
