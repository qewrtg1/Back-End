package a1205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {
        int [] data = {5,6,4,2,3,1,1,2,2,4,8};

        //ArrayList생성 -> 짝수만 포함해보자
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i =0; i<data.length; i++){
            if(data[i]%2==0){
                dataList.add(data[i]);
            }
        }
        System.out.println(dataList);
        System.out.println();


        //set을 사용하여 중복 제거
        HashSet<Integer> dataSet =new HashSet<>(dataList);


        //set을 다시 list로 변경하자
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
        System.out.println(distinctList);
        System.out.println();


        //역순으로 정렬해보자
        distinctList.sort(Comparator.reverseOrder());
        //정방향, 순방향은 = Comparator.reverseOrder , 이다


        
        //Integer 리스트를 정수 배열로 변환해보자
        int[] result =new int[distinctList.size()];
        for(int i=0; i<distinctList.size(); i++){
            result[i] = distinctList.get(i);
        }
        for(int num :result){
            System.out.println(num+" ");
        }
    }   
}

// 진행 순서 

/// 1. 배열을 arraylist로 변환 후 -> 짝수만 추출함
/// 2. arraylist를 hashset으로 변환 (중복 제거를 위해서)
/// 3. 중복 제거된 값을 다시 list값으로 변환. -> 역순 정렬 시킴
/// 4. 다시 arraylist를 배열로 변환 
/// 5.  
