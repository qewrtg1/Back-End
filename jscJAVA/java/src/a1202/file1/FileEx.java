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


// file.exists():

// 이 메서드는 File 객체가 나타내는 파일이나 디렉토리가 실제로 존재하는지 확인하는 역할을 합니다.
// 존재하면 true를 반환하고, 존재하지 않으면 false를 반환합니다.