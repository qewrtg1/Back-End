package a1202.file;

import java.io.IOException;
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args) throws IOException{ //(1-1) 그래서 throws를 씀.
        InputStream in = System.in;  //System.in : 콘솔에서 키보드로 입력 받겠다. 스캔에서 자주보던거
// InputStream read 메서드는 1byte 크기의 사용자 입력을 받아들인다. 라는 뜻?



        int a;
        a = in.read();
// (1)이런 파일 입출력은 항상 에러가 생김.
        System.out.println(a);
    }//출력 후 대문자 A 입력시 65값으로 반환해줌. 이유는 말 안해서 모름.
}



//정리


//사용자가 입력한 문자인 a에 해당하는 아스키코드 97출력
//InputStream 은 바이트 단위의 데이터를 읽어들이는 내장 클래스
//1byte만 읽으므로 한글자만 입력

// throws는 예외 처리를 위임하는 키워드입니다. 좀 더 쉽게 말하자면, 이 메서드에서 발생할 수 있는 예외를 호출한 곳으로 "미루는" 역할