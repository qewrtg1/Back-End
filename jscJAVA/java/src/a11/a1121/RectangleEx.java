package a11.a1121;


public class RectangleEx {
    public static void main(String[] args) {

        Rectangle Re = new Rectangle(40, 80);

        System.out.println("가로 높이: " + Re.width);
        System.out.println("세로 높이: " + Re.height);


        Re.setDimensions(40);
        // System.out.print(Re.width + Re.height);
        System.out.println("가로 높이: " + Re.width);
        System.out.println("세로 높이: " + Re.height);


        Re.getArea(30);
        System.out.println("넓이: "+ Re.getArea(30));


        Re.getPerimeter(20);
        System.out.println("둘례: " + Re.getPerimeter(20));
    }
}
