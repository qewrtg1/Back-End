package a1114;
//109~111p
public class B_2Q {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        System.out.println(y);



        int score =85;
        String result = (!(score >90))? "가":"나";
        System.out.println(result);



        int pen = 534;
        int stu = 30;

        //학생 한명이 가지는 연필 수
        int pencil = pen / stu;
        System.out.println(pencil);

        int pencils = pen % stu;
        System.out.println(pencils);



 //4번 문제는 Q1에



        int a =15;
        int h =7;

        System.out.println((a * h) / 2.0);

//5는 책에, 6은 이해문제라 pass, 7은 이거 봤을 때 한번 직접 해보셈


    }
}
