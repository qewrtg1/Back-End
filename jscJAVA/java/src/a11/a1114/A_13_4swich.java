package a11.a1114;
//122p 8~11뽑기 
public class A_13_4swich {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
        //     case 'A','a' ->{
        //         System.out.println("우수회원");
        //     }
        //     case 'B','b'->{
        //         System.out.println("일반회원");
        //     }
        //     default ->{
        //         System.out.println("손님");
        //     } 이렇게 할 수있고

        case 'A','a' ->System.out.println("우수회원");
        case 'B','b'->System.out.println("일반회원");
        default ->System.out.println("손님");
        //이렇게 해도 똑같다
        }
    }
}
