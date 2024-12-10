package a1210;
// 메인만 만들고, 추상 클래스, 이후 오버라이드, 다시 메인 구성하기
import java.util.Scanner;

public class Override1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요");
        System.out.println("1.원형 \t 2.사각형 \t 3.삼각형");
        int shape = scanner.nextInt();
        Shape shapeObject = null; // Shape는 원래 객체를 만들 수 없다. ?? 캐스팅은 왜 됐어

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요:");
                double radius = scanner.nextDouble();
                shapeObject = new Circle(radius);
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요: ");
                double width =scanner.nextDouble();
                double height =scanner.nextDouble();
                shapeObject = new Rectangle(width, height);
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요: ");
                double base =scanner.nextDouble();
                height =scanner.nextDouble(); // 여긴 왜 double 가 안들어가지?
                shapeObject = new Triangle(base, height);
                break;
            default:
                System.out.println("잘못 입력함");
            break;
        }
        double area = shapeObject.calculateArea();
        System.out.println(shapeObject.render + "의 넓이" + area);
    }
}






//추상 클래스와 추상 메서드를 만들어보자
abstract class Shape{
    String render;
    public abstract double calculateArea(); //추상 메서드임
}




// 클래스 만들고, 필드 생성하고, 오버라이드 하고, 생성자 만듬
//
class Circle extends Shape{
    private double radius;
//생성자 만들고
    public Circle(double radius) {
        this.radius = radius;
        this.render = "cicle"; // 임의로 하나 더 만들어줌.
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); //radius의 2제곱
    }
}




class Rectangle extends Shape{
    //필드 생성 1
    private double width;
    private double height;
    //생성자 생성 2
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width*height;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5* base * height;
    }
}