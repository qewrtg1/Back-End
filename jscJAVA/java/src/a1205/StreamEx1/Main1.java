package a1205.StreamEx1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList( // 지금까진 new로 넣었고 그게 정석이라고 함
        new Transaction(brian, 2011, 300)
        , new Transaction(raoul, 2011, 1000)
        , new Transaction(raoul, 2011, 400)
        , new Transaction(mario, 2012, 700)
        , new Transaction(mario, 2012, 700)        
        , new Transaction(alan, 2012, 950)
        );
        //brian , mario 거래자 // cambridge : 거래자 근무하는 도시

// 1. 문제 _ 2011년에 일어난 모든 트랜재션을 찾아 오름차순으로 정렬하시오
//함수를 만들어보자
        practice1(transactions);
// 2. 문제 _ 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transactions);
// 3. 문제 _ 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        practice3(transactions);
// 4. 문제 _ 밀라노엔 거래자가 있는가 확인
        practice4(transactions);
// 5. 문제 _ z케임브리지에 거주하는 거래자의 모든 트랜잭션 값을 출력하세요
        practice5(transactions);
// 6. 모든 거래자의 이름을  알파뱃 순으로 정렬해서 반환하시오
        practice6(transactions);
                
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            // 1. 문제 _ 2011년에 일어난 모든 트랜재션을 찾아 오름차순으로 정렬하시오
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
        .filter(t -> 2011 == t.getYear()) //t 변수명 transaction을 줄여 씀
        .sorted(Comparator.comparing(Transaction::getValue)) //comparing(객체명) 객체 안을 돌면서 getvalue를 뽑아내는 거임
        .collect(Collectors.toList());
// collect()처음배워본 거라고 함        stream형태를 다시 list로 바꿔주는 거라고 함.
        System.out.println(result);
    }


//.sorted(Comparator.comparing(Transaction::getValue).reversed())
//내림차순
//.sorted((tran1, tran2) -> integer.compare(tran1.getValue(), tran2.getValue()))
//뭔지 나도 잘 모르겠음




// 2. 문제 _ 거래자가 근무하는 모든 도시를 중복없이 나열하시오
    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
        .map((tran) -> tran.getTrader().getCity())
//tran(transactions) 객체를 입력받아서 
//.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
//.map(Trader::getCity) //각 거래자에서 도시정보추출
        .distinct()
        .collect(Collectors.toList());

        System.out.println(result);
    }





// 3. 문제 _ 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
        .map(Transaction::getTrader)
        .filter(trader->("Cambridge").equals(trader.getCity()))
        .distinct() //중복제거
        .sorted(Comparator.comparing(Trader::getName))//이름순으로
        .collect(Collectors.toList());

        System.out.println(result); 
    }






               
// 4. 문제 _ 밀라노엔 거래자가 있는가 확인
    private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
        .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
        System.out.println(result);
    }



// 5. 문제 _ z케임브리지에 거주하는 거래자의 모든 트랜잭션 값을 출력하세요
    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(tran ->"Cambridge".equals(tran.getTrader().getCity()))
            .collect(Collectors.toList());
            System.out.println(result);    
    }





// 6. 모든 거래자의 이름을  알파뱃 순으로 정렬해서 반환하시오
    private static void practice6(List<Transaction> transactions) {
        String result = transactions.stream()
        .map(Transaction::getTrader)
        .map(Trader::getName)
        .distinct()
        .sorted()//기본정렬
        .collect(Collectors.joining(","));
        System.out.println(result);

    }






}

