


public class RectangleEx {
    public static void main(String[] args) {

        Rectangle Re = new Rectangle(40, 80);

        System.out.println("가로 높이: " + Re.width);
        System.out.println("세로 높이: " + Re.height);


        int t = Re.width;
        System.out.println("가로: "+ t + "변경된 세로: " + Re.height);

    }
}
