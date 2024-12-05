package a1205;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        String[] arr= new String[]{"넷", "둘", "셋", "하나"};

        //배열에서 스트림을 생성해보자
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.println(e + " ")); //e는 대충지은 변수명
        
        System.out.println();

        //위와 뭐가 다른지 비교해보기.
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e -> System.out.println(e + " ")); //e는 대충지은 변수명
//특정 부분만 stream한다?    
    
    
    
    }
}
