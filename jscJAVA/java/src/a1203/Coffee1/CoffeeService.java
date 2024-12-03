package a1203.Coffee1;

import java.util.LinkedHashMap;

public class CoffeeService {
    private boolean reOrder = false; // 고객 추가 주문 여부
    private int orderNum = 1 ;

    public CoffeeService(){
        orderList = new LinkedHashMap<>();
//orderList: 주문 저장할 곳
//LinkedHashMap<>()
// - 입력 순서 또는 접근 순서 보장, 속도: 약간 느림, 용도: 순서가 중요할 때 사용
    }
    
        //커피 객체 준비
    Coffee coffee = Coffee.getInstance(); //커피 메뉴 관리하는 싱글톤 객체
    
        //손님 객체
    Customer Customer;
    
} 