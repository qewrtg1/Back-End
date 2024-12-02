package a11.a1115;

public class A_3GuguAll3 {
    public static void main(String[] args) {
        System.out.println();
        //A x B
        //i : 단
        for(int i=1; i <=9; i++){

            for(int j=2; j <= 9;j++){
                System.out.print(j + " * " + i + " = " + i*j ); //i와 j의 위치에 따라서 나오는 모양세가 다르다? 가로세로
                System.out.print("   "); //탭공백
            }
            System.out.println();	// 한 단 끝 --> 다음줄로
        }
    }
}
