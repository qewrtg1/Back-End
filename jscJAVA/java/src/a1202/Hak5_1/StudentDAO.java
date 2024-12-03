package a1202.Hak5_1;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentDAO {
    
    private ArrayList<StudentDTO> slist; //S, list 라는 이름인거임
    Scanner sc = new Scanner(System.in);

    // FileClass file = new FileClass("student", "student_Grade");

    public StudentDAO(){ //생성 메서드를 만듬
        slist = new ArrayList<StudentDTO>(); // StudentDTO 는 <>안에 안 써도 자동인식되지만 보고 이해하라고 적어둠


//기본 데이터 - 4명의 더미데이터를 생성.
        StudentDTO s1 = new StudentDTO(0,"테스트1",11,100,90,80);
        StudentDTO s2 = new StudentDTO(1,"테스트2",22,90,89,91);
        StudentDTO s3 = new StudentDTO(2,"테스트3",33,85,77,55);
        StudentDTO s4 = new StudentDTO(3,"테스트4",44,77,68,85);
        //객체를 만들고

        slist.add(s1); //add를 사용해서 
        slist.add(s2); //slist에 하나씩 집어 넣음
        slist.add(s3);
        slist.add(s4); //4개의 데이터를 생성한 것임.

        //MainClass 에 넣으나 DAO에 넣으나 똑같다고 함.
        // System.out.println(slist);//결과 확인용.

        // StudentDTO s = new StudentDTO();// 교육용 예시용으로 넣은거라 안중요함
    }



    private void insert(StudentDTO s) {
       slist.add(s);
    }//사실 안 만들어도 되는 메소드임 그냥 slist.add(s); 쓰고 끝내도 됨. 


    private void delete(int index) {
        slist.remove(index);
        // remove : arraylist 에서 리스트 한줄 삭제용(인덱스번호)
    }
//위 두개는 그냥 겉멋용. 크게 필요 없는 메서드





    private StudentDTO select(int index) {
        //인덱스번호 통째로 뽑으려면
        return slist.get(index); 
//slist.get(index);는 객체 전체를 반환하는것.
//각 점수별로 반환하고 싶으면 slist.get(index). kor eng 등등 써주면 됨.
        
    }
    private void update(int index, StudentDTO s) {
        slist.set(index, s);
    }
//이건 좀 햇갈려서 비움 











    public void userInsert() {
        // System.out.println("<학생을 추가하기>");
        // System.out.print("이름 :");
        // String name = sc.next();
        // System.out.print("나이 :");
        // int age = sc.nextInt();
        // System.out.print("국어 :");
        // int kor = sc.nextInt();
        // System.out.print("영어 :");
        // int eng = sc.nextInt();
        // System.out.print("수학 :");
        // int math = sc.nextInt();

        // StudentDTO student = new StudentDTO(slist.size(), name, age, kor, eng, math);


        // slist.add(student); // 배열 slist +  StudentDTO student = new S...
        // System.out.println(slist); // 1번 방식. 이렇게 했던 게 지금까지 배웠던 거고


    StudentDTO s = new StudentDTO();
        s.setId(slist.size());
            System.out.println("<학생 추가하기>");

            System.out.print("이름 : " );
        s.setName(sc.next());
            System.out.print("나이 : ");
        s.setAge(sc.nextInt());
            System.out.print("국어점수 : ");
        s.setKor(sc.nextInt());
            System.out.print("영어점수 : ");
        s.setEng(sc.nextInt());
            System.out.print("수학점수 : ");
        s.setMath(sc.nextInt());

        // slist.add(s);
        //이게 두번째 방법임. 1번 방법과 같은 결과임


        insert(s);//이후 메서드는 위로 올림

        System.out.println(slist);

    }



    public void userDelete() { //만들기 전 주의. 찾는 메소드가 필요함. 찾아야 비교하고 지우던, 없는 걸 확인하던 하니까.
        System.out.println("<학생 정보삭제>");
        int index = searchIndex(); //찾는 메소드가 이거임. 
        if(index == -1){ // (2)가 여기에도 영향을 준다??
            System.out.println("찾는 학생이 없습니다.");
        }else{
            String name = slist.get(index).getName(); //찾은 값이 존재한다면,
            
            // slist.remove(index); 사실 이걸로 끝나는데 굳이 delete 메서드를 만들기로 함.
            delete(index);

            System.out.println(name + "정보를 삭제했습니다.");
        }

    }
                    
                    
            
    private int searchIndex() {//만약 void가 있으면 지워야 함. 찾은 값을 반환해야하니까.
        int index = -1; //(2)찾는 값이 없을 때 결과적으로 -1이 되어 강제로 벗어나게 하는 장치.
        System.out.println("찾는 학생의 이름을 입력하세요");
        System.out.print(">>");
        String name = sc.next();

        for(int i =0; i < slist.size(); i++){ // slist는 arraylist 배열 이름과 입력한 이름을 비교하기 위해 만든 거
            if (slist.get(i).getName().equals(name)) { // slist.get(i) = lengh 였나? 아무튼 이거 기억해야함.
                index = i; // 같은 데이터가 있으면 i를 index에 대입하시오, 라는 의미.
                break;
            }
        }
        return index; //(2)
    }



        public void userSelect() {
            System.out.println("<학생 정보 보기>");
            int index = searchIndex(); // 위에 만들어둔 메서드임

            if(index == -1){ // -1은 계속 같은 의미임. -1이란 값은 나올 수 없고 -1로 굳어졌다면 없다는 의미로 해석
                System.out.println("찾는 학생이 없다");
            }else{
                System.out.println(" 이름 \t 나이 \t 국어 \t 영어 \t 수학 \n"+
                "----------------------------------------------------");
                StudentDTO s =select(index); 
                // 이 메서드를 또 만든 이유: test1에 포함된 모든 내용, student객체 전체를 불러오기 위해서.
                // 이름을 대조 후 출력했을 때 이름만 나와버리면 의미가 없으니까. 
                System.out.println(s);
// (s)는 사실 (s.toString()) 이다. 생략되어 있을 뿐임.
            }
            
        }



        public void userUpdate() {
            System.out.println("<학생 정보 수정>");
            int index = searchIndex(); //학생의 인덱스번호를 찾아오는 것

            if(index == -1){
                System.out.println("찾는 학생이 없다");
            }else{
                StudentDTO s = new StudentDTO(); // 빈 객체를 하나 만들어서 넣을 수 있게? 
// = 기존에 있는 인덱스번호로 기본 데이터를 뽑아 s에 넣고,
//              
                s.setId(slist.get(index).getId()); //기존 인덱스 번호, 해당 리스트에 있는 id
                s.setName(slist.get(index).getName());
                s.setAge(slist.get(index).getAge()); 
// 기존에 있는 애들이 private걸려 있어서 get써서 끌고오는 거임??? 아마,

                System.out.println("<" + slist.get(index).getName()+ "학생의 정보수정");
                System.out.println("국어점수: ");
                s.setKor(sc.nextInt());
                System.out.println("영어점수: ");
                s.setEng(sc.nextInt());
                System.out.println("수학점수: ");
                s.setMath(sc.nextInt());


                update(index, s);
                //set은 업데이트, 수정
            }
        }



        public void printAll() {
            System.out.println(" 이름 \t 나이 \t 국어 \t 영어 \t 수학 \n"+
            "----------------------------------------------------");

            for(int i = 0; i < slist.size(); i++){ //arraylist slist.size() = 배열 .length
                System.out.println(slist.get(i).toString());
            }
            
        }



        public void dataSave() {
            // file.create(); 
            
        }
                
                
                

                
                
                

        
        
        

    
}
