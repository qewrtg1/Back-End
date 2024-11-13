package a1113;

public class A1_Ex03 {
    public static void main(String[] args) {
        double de = 9.99;
        // int wholeNumber = de; // double은 너무 커서 규격이 맞지 않아서 변환이 안됨.
        int wholeNumber = (int)de;

        System.out.println(wholeNumber);
        //강제로 형 변환이 되어서 9.99는 ->9가 됨
    }
}
