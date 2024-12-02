package a11.a1127.shape04;

import java.util.Scanner;

public class ShapeMaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        double width = 0.0; 
        double  height = 0.0;
        double  radius = 0.0;

        //총합
        double  roundSum = 0.0;
        double  areaSum = 0.0;

        //입력 답은 도형 정보 배열
        Shape[] shapeList = new Shape[3];

        int index = 0; //이유가 있어서 만든건데 잘 못들음


        while (true) {
            if(index==3){
                break;
            }// 결과문이 하나일 땐 {}괄호 없어도 됨(1)
            System.out.println("1. 삼각형, 2.사각형, 3.원형");
            System.out.print(">>");
            String input = sc.next(); //next는 문자를 받는 것, 이라는데 line도 되지 않았던가
//여기가 문자형이니 swich형도 문자로 받아야함(2)

            if (input.equals("그만")) break; //이런식으로 ㅇㅇ(1)
            


        //삼각형




            switch (input) {
                case "1": // 따옴표로 문자취급(2)
                    System.out.print("가로>>");
                    width = sc.nextDouble(); // 실수로 입력을 받는다?
                    System.out.print("높이>>");
                    height = sc.nextDouble();
// 이렇게 가로 세로를 입력 받은 후,
                    shape = new Triangle(width, height); // 업캐스팅해준것? 해줄것?
                    shapeList[index++] = shape;


                break;
        


        //사각형



                case "2": // 따옴표로 문자취급(2)
                    System.out.print("가로>>");
                    width = sc.nextDouble(); 
                    System.out.print("세로>>");
                    height = sc.nextDouble();
                    shape = new Rectangle(width, height); 
                    shapeList[index++] = shape;


                break;
        


        //원



                case "3": // 따옴표로 문자취급(2)
                    System.out.print("반지름?>>");
                    radius = sc.nextDouble(); 
                    shape = new Circle(radius); 
                    shapeList[index++] = shape;

                break;
            

                default:
                    break;
            }

        }




            for(Shape s : shapeList){
                if(s == null) continue; //혹시라도 비어있으면 for으로 돌아가게?
            
                //instance of : 인스턴스를 비교하는 연산법?
                if(s instanceof Triangle){
                    System.out.println("[삼각형]");
                }
                if(s instanceof Rectangle){
                    System.out.println("[사각형]");
                }
                if(s instanceof Circle){
                    System.out.println("[원형]");
                }
//instanceof : 배열 저장된 객체가 어떤 도형인지 확인하기 위한 것.
//game2폴더 메인2에도 있음.
//자식타입인지 물어보고 일치했을 때 아래가 출력하게 하는 것.
                double area = s.area();
                double round = s.round();

                roundSum = roundSum + round;
                areaSum = areaSum + area;

                System.out.println("넓이: " + area + "\t");
                System.out.println("둘례: " + round + "\t");
                System.out.println();
            }


            System.out.println("둘례 종합 : " + roundSum);
            System.out.println("넓이 종합 : " + areaSum);

            sc.close();

        
    }
    
}
