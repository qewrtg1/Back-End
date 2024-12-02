package a11.a1114;
//교수님 2(결과는 똑같음)
import java.util.Scanner;

public class B_1Q_2IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력해 보세요: ");
        int dal = scanner.nextInt();
        if(dal >=3 && dal <=5){
            System.out.println("봄입니다.");
        }else if(dal >=6 && dal <=8){
            System.out.println("여름입니다.");
        }else if(dal >=9 && dal <=11){
            System.out.println("가을입니다.");
        }else if(dal == 12 || dal == 1  || dal == 2){
            System.out.println("겨울입니다.");
        }


    }
}
