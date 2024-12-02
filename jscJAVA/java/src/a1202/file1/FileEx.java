package a1202.file1;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        //File 객체생성
        File file =new File("c:\\abc\\out1.txt");
        // 역슬레쉬(\\)가 중요하다?

        //파일 정보를 출력하게 만들자

        if (file.exists()) {
            System.out.println("파일이름: " + file.getName());            
            System.out.println("파일경로: " + file.getPath());            
            System.out.println("파일크기: " + file.length()+" 바이트");            
            System.out.println("읽기 기능: " + file.canRead());            
            System.out.println("쓰기 가능: " + file.canWrite());            
        }else{
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
