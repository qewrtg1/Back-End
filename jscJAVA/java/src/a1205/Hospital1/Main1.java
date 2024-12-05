package a1205.Hospital1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        PatientManager pm = new PatientManager(); //이게 생성되자마자 아스틱 문자?가 나오게 함
        //PatientManager를 객체로 만든 것
        Scanner sc = new Scanner(System.in);


        System.out.println("\n\n");
        System.out.println(pm.hospital); 
//스트링 내용에 찍히겠죠?? 뭔소린지 모르겠음.
//아무튼 pm(PatientManager) 안에 hospital을 가져온 거임
        System.out.println("\t\t    어서오세요. JAVA 병원입니다.");

        while (true) {
            System.out.println("\n=========== 메인 메뉴 ===========\n");
            System.out.println("1. 환자 등록");
            System.out.println("2. 등록 정보 보기");
            System.out.println("3. 관리자 메뉴");
            System.out.println("0. 종료\n");
            System.out.print("입력 > ");
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {//이상한 문자가 들어오면
                System.out.println("잘못 입력하셨습니다.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    pm.patientAppointment(); //환자 등록
                    break;
                case 2:
                    pm.patientPrint(); //환자 조회
                    break;

                case 3:
                    if(!checkAdminPw()){//비밀번호 확인
                        System.out.println("비밀번호가 틀렸습니다.");
                        break;
                    }    
                        pm.adminMenu(); //통과 후?
                        break; 
                case 0:
                    System.out.println("시스템 종료");
                    System.exit(0);
                    break;
                default:
                    break;
                }
                        
            }
                        
                        
        }
                
        private static boolean checkAdminPw() {
            Scanner sc = new Scanner(System.in);
            System.out.print("관리자 비밀번호를 입력하세요> ");
            String adminPw = sc.nextLine();
            return "admin1234".equals(adminPw);
        }   



    }