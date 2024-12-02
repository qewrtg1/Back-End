package a11.a1121;


public class Rectangle {

// (이게 필드?)
    public int width;
    public int height;

// (이게 기본 생성자)
    public Rectangle(){
        this.width =0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setDimensions(int width){
        this.width = width;
        this.height = width;
    }


    public int getArea(int ij){
        return ij*ij;
    }


    public int getPerimeter(int AAAA) {
        return AAAA*4;
    }

}
