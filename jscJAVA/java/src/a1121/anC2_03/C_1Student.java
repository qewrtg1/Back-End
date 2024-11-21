package a1121.anC2_03;

public class C_1Student {
    //학새의 속성: 이름 나이 학번 전공
    //변수 (필드)

    String name;
    int age;
    String stdNo;
    String major;

    //기본 생성자 

    public C_1Student(){
        this("이름없음",1,"00000000","없음");
    }

    public C_1Student(String name, int age, String stdNo, String major) {
        this.name = name;
        this.age = age;
        this.stdNo = stdNo;
        this.major = major;
        
    }



    public void study(String subject) { 
        // void와 스태틱?의 차이를 알아야 한다고 함.
        // void : 받아서 그냥 출력만함, 리턴을 안함?   스태틱: 값을 받고 반환함?

        System.out.println(subject + "(을/를) 공부합니다.");
        //반환 타입이 voide면 이면, return을 생략 가능하다? 
        return; //써도 됨. 
    }


    public double getAverage(int score1, int score2) { //String => double
        //평균 = 합계 /개수
        double average = 0.0;
        average = (double)(score1+score2) / 2;
        return average; //여기서 되돌려주면 getAverage로 들어가서 ex에 있는 getAverage로 감
    }

    public double getAverage(int i, int j, int k) { //메소드 변수명이 같아도 이렇게 다르게 할 수 있음.
        double average = 0.0;
        average = (double)(i+j+k) / 3;
        return average;

    }

    public double getAverage(int[] scores) { //ex에서 score여도 여기서 받을땐 변수명이 달라도 됨
        double average = 0.0;
        int sum = 0;

        // for(int i=0; i<scores.length; i++){
        //     sum=sum+scores[i];
        // } 이걸 foreach문으로 아래처럼 만들거임
        for(int score : scores){
            sum += score;
        }
        average = (double) sum / scores.length;
        return average;

    
    }
    
}
