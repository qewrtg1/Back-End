package a1127.shape04;

public class Triangle extends Shape{
    double width, height;


    public Triangle() {
        this(0, 0);
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    double area() {
        return (width*height)/2;
    }

    @Override
    double round() { //정삼각형이라고 가정함
        return width*3;
    }


}
