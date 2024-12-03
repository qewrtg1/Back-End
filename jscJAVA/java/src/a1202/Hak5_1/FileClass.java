package a1202.Hak5_1;

import java.io.File;

public class FileClass {
    private File file; // File: 자바가 제공하는 메소드
    private String dir; // dir: 디렉토리. 폴더 경로를 저장할 놈?
    private String fileName; // : 파일 명을 기록, 저장


    public FileClass(){
        file = new File("c:\\");  // 윈도우 기준 \\ 2개 써야 한다?
        //기본 생성자로, 기본디렉토리 c:\로 설정
    }


    public FileClass(File file, String dir, String fileName) {
        file = new File("c:\\" + dir +"\\" +fileName+".txt");
        this.dir = "c:\\" +dir;
        this.fileName = fileName+".txt";
        //드렉토리 경로와 파일이름을 받아서 파일 객체를 초기화한다.
        //디렉토리가 없는 경우 디렉토리도 생성한다
        //file = c:\\student\\student_Grade.txt
        //dir = c:\\student
    }


    public void create() {
        
        
    }




}
