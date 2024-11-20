package a1120;

import java.util.Scanner;

public class B_2_2Hak09 {
    public static void main(String[] args) {
        boolean run = true;

        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            

//콘솔창으로 입력할 때 1~5가 아닌 그 외의 숫자를 입력했을 때 에러가 뜸
//숫자 외 글자도 포함

//그 에러코드를 해결? 예외? 처리? 되돌리기.







            System.out.print("선택>");

            try{ // 이거랑 (1-1)













            int selectNo = Integer.parseInt(scanner.nextLine());
            //줄단위로 문자처럼 입력받고 parseInt 숫자로 변환
            if(selectNo == 1){
                System.out.print("학생수>");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            }else if(selectNo==2){




                //시작하자마자 1번이 아닌 다른 번호를 눌렀을 때도 에러가 터짐

                if(scores == null){
                    System.out.println("학생 수를 먼저 입력하세요.");
                    continue;
                }
                //더 좋은 방법도 있지만 당장은 이렇게 해서 모든 for문에 넣어주면 임시 해결 가능? 한듯












                for(int i=0; i < scores.length;i++){
                    System.out.print("scores["+i+"]>");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }else if(selectNo==3){
                if(scores == null){
                    System.out.println("학생 수를 먼저 입력하세요.");
                    continue;
                }
                for(int i=0; i < scores.length;i++){
                    System.out.println("scores["+i+"]: " +scores[i] );
                    //scores[0] : 80 scores[1] : 80
                }
            }else if(selectNo==4){
                if(scores == null){
                    System.out.println("학생 수를 먼저 입력하세요.");
                    continue;
                }
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i = 0; i <scores.length;i++){
                    max = (max < scores[i])? scores[i] : max ;
                    sum = sum + scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }else if(selectNo==5){
                run = false;
            }else{
                System.out.println("유효하지 않은 선택지 입니다.");
            }












            }catch(NumberFormatException e){
                System.out.println("숫자로 입력하시오.");
            } // 이거를 넣으면 해결 (1-1)











        }
        System.out.println("프로그램종료");
    }
}
