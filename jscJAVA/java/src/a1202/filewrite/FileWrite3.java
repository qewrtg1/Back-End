package a1202.filewrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite3 {
    public static void main(String[] args) throws IOException {
         FileWriter fw = new FileWriter("c:/abc/out1.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.\r\n";// 이 \r\n 두개를 다 써야함
            fw.write(data);
        }
        fw.close();
    }
}

// 이게 더 편하다.

// FileWriter를 이용하여 byte 배열 대신 문자열을 사용함?
