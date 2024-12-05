package a1205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Set2 {
    public static void main(String[] args) {
        //객체선언
        List<String> items = new ArrayList<>();


        //중복된 값이 있는 리스트
        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("apple");
        items.add("banana");
        System.out.println(items);
        System.out.println();



        
        //Hashset을 사용하여 중복 제거
        Set<String> uniqueItems = new HashSet<>(items); //괄호에 items 쓰는 게 중요

        //결과 출력
        System.out.println(uniqueItems);

    }
}
