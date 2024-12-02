package a1202.Exception1;

public class Exception6 {
    public static void main(String[] args) {
        String[] name = {"K", "L", "P", "C"};

        try {
            System.out.printf("0번 인덱스 요소: %s\n" ,name[0]);
            System.out.printf("0번 인덱스 요소: %s\n" ,name[4]); 
//에러가 나는 순간 catch로 넘어감. 이 이상 수행하지 않고 빠져나옴.

            System.out.printf("0번 인덱스 요소: %s\n" ,name[3]);
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("인덱스 접근이 잘못되었습니다.");
        }finally{//꼭 수행해야할 게 있다면,
            System.out.println("finally문은 예외 발생과 상관없이 항상 수행함");
            System.out.printf("0번 인덱스 요소: %s\n" ,name[3]);
//본래라면 try에서 name[4] 이후 catch에서 종료되어야 했음

            System.out.printf("0번 인덱스 요소: %s\n" ,name[4]); 
//다시 한번 실수하면 catch를 거치지않고 일반 오류 코드 출력
        }


    }
}
