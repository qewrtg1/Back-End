package a1114;
//106p
public class A_8Condi1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : (score>80) ? 'B' : 'c';
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
