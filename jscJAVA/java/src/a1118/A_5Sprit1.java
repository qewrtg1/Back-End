package a1118;
//166
public class A_5Sprit1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
        //문자열을 배열로 분리? ,(콤마)로 나눈 걸 말하는 듯?

        String[] tokens = board.split(",");
        System.out.println("번호: "+ tokens[0]);
        System.out.println("번호: "+ tokens[1]);
        System.out.println("번호: "+ tokens[2]);
        System.out.println("번호: "+ tokens[3]);
        // System.out.println("번호: "+ tokens[4]); //Index 4 out of bounds for length 4 :길이가 4인 배열에서 4번 인덱스를 참조하려고 했지만, 4번 인덱스는 존재하지 않는다"는 의미 
    
        System.out.println();

        for(int i = 0; i <tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
