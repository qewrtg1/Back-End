package a11.a1121.anC2_03;

// 241 메소드 오버로딩 관련 내용이 여기에 포함되어 있다는데 시발 그걸 다 하고 난 뒤에 있다고 하면 내가 어떻게 아냐고 미친놈아

public class A_1StudentEx {
    public static void main(String[] args) {
        //student 객체 생성
        C_1Student student = new C_1Student();


//아래 4줄을 안 쓰면 c1에 있는 것이 출력. 입력하면 이걸로 덮어씌이고 나옴
        student.name = "오영수";
        student.age = 31;
        student.stdNo = "196134534534";
        student.major = "컴퓨터네";
        C_1Student student2 = new C_1Student("김승현",20,"5165189","전자공학");
        
        
        
        
        int[] score = {10,20,30,40,50}; //(1)
        int[] score2 = {15,22,33,44,55}; 



        System.out.println("##### 학생1 #####");
        System.out.println("학생1 - 이름 : " + student.name);
        System.out.println("학생1 - 나이 : " + student.age);
        System.out.println("학생1 - 학번 : " + student.stdNo);
        System.out.println("학생1 - 전공 : " + student.major);

        student.study("Java"); //study라는 메서드(전구 눌러서)만듬 // 여기서도 가져오네 신기하게

        System.out.println("학생 1 - 중간고사 점수 : " + student.getAverage(10,20));
        System.out.println("학생 1 - 기말고사 점수 : " + student.getAverage(30,40,50));
        System.out.println("학생 1 - 최종 점수 : " + student.getAverage(score)); //(1)
    
    


        //복붙하고 2만 붙여줌
    
        System.out.println("##### 학생2 #####");
        System.out.println("학생2 - 이름 : " + student2.name);
        System.out.println("학생2 - 나이 : " + student2.age);
        System.out.println("학생2 - 학번 : " + student2.stdNo);
        System.out.println("학생2 - 전공 : " + student2.major);

        student.study("Java"); 

        System.out.println("학생 2 - 중간고사 점수 : " + student2.getAverage(20,80));
        System.out.println("학생 2 - 기말고사 점수 : " + student2.getAverage(100,30,40));
        System.out.println("학생 2 - 최종 점수 : " + student2.getAverage(score2));

    
    //이렇게 해도 출력이 됨
    //getAverage의 경우는 ?
    
    
    
    
    
    }
}
