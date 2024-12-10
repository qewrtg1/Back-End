package a1210;

import java.util.Scanner;

public class Casting1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요");
        System.out.println("1.원형 \t 2.사각형 \t 3.삼각형");
        int shape = scanner.nextInt();

        Shape shapeObject = new Shape("");
        double area = 0;


        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요: ");
                double radius = scanner.nextDouble();
                area = shapeObject.calculateArea(radius);
//shapeObjec: 객체 이름
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요: ");
                double width =scanner.nextDouble();
                double height =scanner.nextDouble();
                area = shapeObject.calculateArea(width, height);
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요: ");
                double base =scanner.nextDouble();
                double triHeight =scanner.nextDouble();
                area = shapeObject.calculateArea(base, triHeight, true);
                break;
            default:
            System.out.println("잘못 입력함");
                break;
        }
        System.out.println(shapeObject.getRender() + "의 넓이: " +area);
            }
        }
        
        
        
        
        
        
        
class Shape{
    private String render;
//생성자
    public Shape(String render){
        this.render =render;
    }

    public String getRender() {
        return render;
    }


//3개의 calculateArea 매개변수가 있음
//괄호 갯수에 맞춰서 알아서 찾아가게 되어 있음.
// 매게 변수의 갯수에 따라 알아서 이동하게 하는 것을 메소드 오버라이딩이라고 함.
    //원형 넓이 계산
    public double calculateArea(double radius){
        this.render = "circle";
        return Math.PI * Math.pow(radius, 2);//pow 실제 있는 메소드 , 반지름x반지름x3.14와 같다?
    }
    //사각형 넓이 계산
    public double calculateArea(double width, double height){
        this.render = "rectangle";
        return width *height;
    }
    //삼각형 넓이 계산
    public double calculateArea(double base, double height, boolean isTriangle){
        if (isTriangle) {
            this.render = "triangle";
            return 0.5*base*height;
        }
        return 0; // 삼각형이 아닌 경우 기본값 반환.
    }
}