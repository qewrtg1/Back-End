package a1205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//회원 (Member) 객체에 '남자' 회원의 평균 나이를 
//외부 반복자를 이용하는 방법과 , 내부 반복자 람다식 스트림을 적용하는
//방법으로 코딩하시오
public class Stream9 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member m1 = new Member("박태호", Member.MALE, 30);
        Member m2 = new Member("김연경", Member.FEMALE, 29);
        Member m3 = new Member("손유일", Member.MALE, 32);
        Member m4 = new Member("안재홍", Member.MALE, 27);
        list.add(m4);
        list.add(m3);
        list.add(m2);
        list.add(m1);


        // 1.외부 반복자를 사용해보자
        // index값을 사용, for문과 if문으로 남성여성을 구분하고 
        // 남성 나이만 sum에 누적시키고
        // count로 나눠서 평균 나이를 출력시킨다.

        int count = 0 ;
        double sum = 0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getGender() == Member.MALE) {
                sum = sum + list.get(i).getAge();
                count++;      
            }
        }
        double ageAvg1 = sum / count;
        System.out.println("남자 평균 " +ageAvg1);
//여기까지가 방법 1.

        
        
        //방법 2. 내부 반복자를 적용하여 해결해보자
        double ageAvg2 = list.stream() //어레이를 스트림으로 바꿔줌 //여기까진 빨간줄 나올거임
            .filter(m-> m.getGender() == Member.MALE) // 쓰는 도중 내내 붉은 줄 생김
            .mapToInt(Member::getAge)
            .average() // 내부 함수임. 
            .getAsDouble(); // 이것도 내부함순가?

        System.out.println("남자 회원의 평균나이: " + ageAvg2);
//방법 1과 같은 결과
        
    }
}


// 아마 방법 2 설명
/// 1. list.tream() : 리스트를 스트림으로 변환해주는 것
/// 2. 성별이 남성인 회원만 필터링 -> 중간연산.
/// 3. 회원객체를 나이로 매칭시킴. mapToInt: 매서드 객체를 int값으로 변환시켜주는 것????
/// = IntStream을 만드는 것
/// 4. average : 평균 값을 구할 때 쓰는 메서드? 스트림 요소들의 평균을 계산 -> 최정처리 집계 처리? 처리가 왜 두번나오는진 모름
/// 5. getAsDouble(): 평균 값을 double 형태로 반환 시켜 줌